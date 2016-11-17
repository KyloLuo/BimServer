package org.bimserver.database.mongo;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.bimserver.database.BimserverDatabaseException;
import org.bimserver.database.BimserverLockConflictException;
import org.bimserver.database.DatabaseSession;
import org.bimserver.database.KeyValueStore;
import org.bimserver.database.RecordIterator;
import org.bimserver.database.SearchingRecordIterator;
import org.bson.BsonBinary;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.Binary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoCommandException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.UpdateOptions;


public class MongoKeyValueStore implements KeyValueStore{
	
//	private static final Logger LOGGER = LoggerFactory.getLogger(MongoKeyValueStore.class);
	private static final String ban1 = "INT-Registry";
	private static final String ban2 = "INT-ClassLookup"; 
	private MongoClient mongoClient;
	private MongoDatabase mongoDatabase;
	private int committedWrites;
	private int reads;
	private final Map<String, MongoCollection<Document> > tables = new HashMap<String, MongoCollection<Document> >();
	private boolean isNew;
	private final Map<Long, StackTraceElement[]> openCursors = new ConcurrentHashMap<>();
	private long lastPrintedReads = 0;
	private long lastPrintedCommittedWrites = 0;
	private final AtomicLong cursorCounter = new AtomicLong();
	private String dbName;
	
	
	public MongoKeyValueStore(String DatabaseName) {
		mongoClient = new MongoClient("localhost", 27017);
		mongoDatabase = mongoClient.getDatabase(DatabaseName);
		//mongoDatabase.drop();
		dbName = DatabaseName;
		
		if(mongoDatabase.listCollectionNames().iterator().hasNext()) isNew = false;
		else isNew = true;
	}
	

	@Override
	public boolean containsTable(String tableName){
		return tables.containsKey(tableName);
	}

	@Override
	public Set<String> getAllTableNames(){
		MongoCursor<String> cursor = mongoDatabase.listCollectionNames().iterator();
		Set<String> set = new HashSet<String>();
		while(cursor.hasNext()){
			String string = cursor.next();
			set.add(string);
		}
		return set;
	}

	@Override
	public long count(String tableName){
		MongoCollection<Document> mongoCollection = mongoDatabase.getCollection(tableName);
		return mongoCollection.count();
	}

	@Override
	public void close(){
		return;
	}
	@Override
	public boolean isNew(){
		return isNew;
	}

	@Override
	public	boolean openTable(String tableName) {
		MongoCollection<Document> mongoCollection = mongoDatabase.getCollection(tableName);
		tables.put(tableName, mongoCollection);
		return true;
	}

	@Override
	public	void incrementCommittedWrites(int committedWrites){
		this.committedWrites += committedWrites;
		if (this.committedWrites / 100000 != lastPrintedCommittedWrites) {
			lastPrintedCommittedWrites = this.committedWrites / 100000;
		}
	}

	@Override
	public	void incrementReads(int reads){	
		this.reads += reads;
		if (this.reads / 100000 != lastPrintedReads) {
			lastPrintedReads = this.reads / 100000;
		}
	}

	@Override
	public	RecordIterator getRecordIterator(String tableName, DatabaseSession databaseSession) throws BimserverLockConflictException, BimserverDatabaseException{
//		LOGGER.info("Fuck Record :" + tableName);
		MongoCollection<Document> mongoCollection = mongoDatabase.getCollection(tableName);
		FindIterable<Document> iterables = mongoCollection.find(); 
		MongoRecordIterator mongoRecordIterator = new MongoRecordIterator(iterables, this, cursorCounter.incrementAndGet(), tableName);
		return mongoRecordIterator;
	}

	@Override
	public	SearchingRecordIterator getRecordIterator(String tableName, byte[] mustStartWith, byte[] startSearchingAt, DatabaseSession databaseSession) throws BimserverLockConflictException,
			BimserverDatabaseException{

//		LOGGER.info("Fuck SearchingRecord :" + tableName);
		MongoCollection<Document> mongoCollection = mongoDatabase.getCollection(tableName);
		FindIterable<Document> iterables = mongoCollection.find();
		MongoSearchingRecordIterator mongoSearchingRecordIterator = new MongoSearchingRecordIterator(iterables, this, cursorCounter.incrementAndGet(), mustStartWith, startSearchingAt, tableName);
		return mongoSearchingRecordIterator;
	}

	@Override
	public	void storeNoOverwrite(String tableName, byte[] key, byte[] value, DatabaseSession databaseSession) throws BimserverDatabaseException, BimserverLockConflictException, BimserverConcurrentModificationDatabaseException{
		storeNoOverwrite(tableName, key, value, 0, value.length, databaseSession);
	}

	public Document getDocument(byte[] key, byte[] value){//要插入的记录
		ByteBuffer keyBuffer = ByteBuffer.wrap(key);
		int pid, rid = 0; long oid = 0;
		pid = keyBuffer.getInt();
		if(key.length >= 12)
			oid = keyBuffer.getLong();
		if(key.length >= 16)
			rid = keyBuffer.getInt();		
		Document document = new Document().append("pid", pid).append("oid", oid).append("rid", rid).append("value", new BsonBinary(value));
		return document;
	}
	
	public Document getLastDocument(byte[] key){//Key->ByteToDocument
		ByteBuffer keyBuffer = ByteBuffer.wrap(key);
		int pid, rid = 0; long oid = 0;
		pid = keyBuffer.getInt();
		if(key.length >= 12)
			oid = keyBuffer.getLong();
		if(key.length >= 16)
			rid = keyBuffer.getInt();		
		Document document = new Document().append("pid", pid).append("oid", oid).append("rid", rid);
		return document;
	}

	@Override
	public	void storeNoOverwrite(String tableName, byte[] key, byte[] value, int offset, int length, DatabaseSession databaseSession) throws BimserverDatabaseException, BimserverLockConflictException{

//		LOGGER.info("Fuck StoreNoWrite :" + tableName);

		Document document = getDocument(key, value);

		MongoCollection<Document> mongoCollection = mongoDatabase.getCollection(tableName);
		MongoCursor<Document> mongocursor = mongoCollection.find(FindKeyeq(document)).iterator();
		if(mongocursor.hasNext()){
			ByteBuffer keyBuffer = ByteBuffer.wrap(key);
			if (key.length == 16) {
				int pid = keyBuffer.getInt();
				long oid = keyBuffer.getLong();
				int rid = -keyBuffer.getInt();
				throw new BimserverConcurrentModificationDatabaseException("Key exists: pid: " + pid + ", oid: " + oid + ", rid: " + rid);
			} else {
				throw new BimserverConcurrentModificationDatabaseException("Key exists: " );
			}
			//mongoCollection.updateMany(Filters.eq("key", new BsonBinary(key)), new Document("$set", new Document().append("value", new BsonBinary(value))), options);
		}else{
			mongoCollection.insertOne(document);			
		}
	}
	
	public Bson FindKeygte(Document document){//查询条件
		return Filters.or(
				Filters.and(Filters.gt("pid", document.getInteger("pid"))),
				Filters.and(Filters.gte("pid", document.getInteger("pid")), Filters.eq("oid", document.getLong("oid"))),
				Filters.and(Filters.gte("pid", document.getInteger("pid")), Filters.gte("oid", document.getLong("oid")), Filters.gte("rid", document.getInteger("rid")))
		);
	}
	
	public Bson FindKeyeq(Document document){//查询条件
		return Filters.and(Filters.eq("pid", document.getInteger("pid")), Filters.eq("oid", document.getLong("oid")), Filters.eq("rid", document.getInteger("rid")));
	}

	@Override
	public	void store(String tableName, byte[] key, byte[] value, int offset, int length, DatabaseSession databaseSession) throws BimserverDatabaseException, BimserverLockConflictException{
//		LOGGER.info("Fuck StoreOffLen :" + tableName);
		
		Document document = getDocument(key, value);
		Document lastDocument = getLastDocument(key);

		MongoCollection<Document> mongoCollection = mongoDatabase.getCollection(tableName);
		MongoCursor<Document> mongocursor = mongoCollection.find(FindKeyeq(lastDocument)).iterator();
		
		if(mongocursor.hasNext()){
			UpdateOptions options = new UpdateOptions(); options.upsert(true);
			mongoCollection.updateOne(lastDocument, new Document("$set", document), options);
		}else{
			mongoCollection.insertOne(document);			
		}
	}
	

	@Override
	public	byte[] getFirstStartingWith(String tableName, byte[] key, DatabaseSession databaseSession) throws BimserverLockConflictException, BimserverDatabaseException{
//		LOGGER.info("Fuck Firstget :" + tableName);
		Document lastDocument = getLastDocument(key);
		MongoCollection<Document> mongoCollection = mongoDatabase.getCollection(tableName);
		MongoCursor<Document> mongoCursor = mongoCollection.find(FindKeyeq(lastDocument)).iterator();
		while(mongoCursor.hasNext()){
			Document document = mongoCursor.next();
			return document.get("value", Binary.class).getData();
		}
		return null;		
	}

	@Override
	public	byte[] get(String tableName, byte[] key, DatabaseSession databaseSession) throws BimserverLockConflictException, BimserverDatabaseException{
		if(tableName == ban1 || tableName == ban2) return MongoBothByte.get(tableName, key, mongoDatabase);
//		LOGGER.info("Fuck JustGet :" + tableName + ", keylength = " + key.length);
		Document lastDocument = getLastDocument(key);
		MongoCollection<Document> mongoCollection = mongoDatabase.getCollection(tableName);
		MongoCursor<Document> mongoCursor = mongoCollection.find(FindKeyeq(lastDocument)).iterator();
		while(mongoCursor.hasNext()){
			Document document = mongoCursor.next();
			return document.get("value", Binary.class).getData();
		}
		return null;			
	}

	@Override
	public	boolean createTable(String tableName, DatabaseSession databaseSession) throws BimserverDatabaseException{
		if(tables.containsKey(tableName)){
			throw new BimserverDatabaseException("Table " + tableName + " already created");			
		}
		if(tableName == ban1 || tableName == ban2) {
			MongoCollection<Document> mongoCollection = MongoBothByte.createTable(tableName, mongoDatabase);
			tables.put(tableName, mongoCollection);
			return true;
		}
		try{
			mongoDatabase.createCollection(tableName);
		}catch(MongoCommandException e){			
		}
		BasicDBObject data = new BasicDBObject();
		data.append("pid", 1);
		data.append("oid", 1);
		data.append("rid", 1);
		MongoCollection<Document> mongoCollection = mongoDatabase.getCollection(tableName);
		mongoCollection.createIndex(data);	
		tables.put(tableName, mongoCollection);
		return true;
		
	}


	@Override
	public	void store(String tableName, byte[] key, byte[] value, DatabaseSession databaseSession) throws BimserverLockConflictException, BimserverDatabaseException{
//		LOGGER.info("Fuck OnlyStore :" + tableName);
		if(tableName == ban1 || tableName == ban2) {
			MongoBothByte.store(tableName, key, value, mongoDatabase);
			return ;
		}
		Document document = getDocument(key, value);
		Document lastDocument = getLastDocument(key);

		MongoCollection<Document> mongoCollection = mongoDatabase.getCollection(tableName);
		MongoCursor<Document> mongocursor = mongoCollection.find(FindKeyeq(lastDocument)).iterator();
		
		if(mongocursor.hasNext()){
			UpdateOptions options = new UpdateOptions(); options.upsert(true);
			mongoCollection.updateOne(lastDocument, new Document("$set", document), options);
		}else{
			mongoCollection.insertOne(document);			
		}
	}

	@Override
	public	void delete(String tableName, byte[] key, DatabaseSession databaseSession) throws BimserverLockConflictException{
//		LOGGER.info("Fuck delete :" + tableName);
		MongoCollection<Document> mongoCollection = mongoDatabase.getCollection(tableName);
		Document document = getLastDocument(key);
		mongoCollection.deleteMany(FindKeyeq(document));
	}



	
/*
	@Override
	public	void sync(){
		return;
	}

	@Override
	public	String getLocation(){
		return null;
	}

	@Override
	public	String getStats(){
		return null;
	}

	@Override
	public	BimTransaction startTransaction(){
		return null;
	}

	@Override
	public	void commit(DatabaseSession databaseSession) throws BimserverDatabaseException, BimserverLockConflictException{
		return;
	}

	@Override
	public	String getType(){
		return null;
	}

	@Override
	public	long getDatabaseSizeInBytes(){
		return 0;
	}


	@Override
	public void dumpOpenCursors(){
		return ;
	}
	*/
}