package org.bimserver.database.mongo;

import java.nio.ByteBuffer;

import org.bimserver.database.BimserverLockConflictException;
import org.bimserver.database.Record;
import org.bimserver.database.RecordIterator;
import org.bson.Document;
import org.bson.types.Binary;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCursor;

public class MongoRecordIterator implements RecordIterator{
	private long cursorId;

	private final MongoCursor<Document> mongoCursor;
	private MongoKeyValueStore mongoKeyValueStore;
	private static final String ban1 = "INT-Registry";
	private static final String ban2 = "INT-ClassLookup"; 
	private String tableName;
	
	MongoRecordIterator(FindIterable<Document> cursor, MongoKeyValueStore mongoKeyValueStore, long cursorId, String tableName){
		this.mongoCursor = cursor.iterator();
		this.cursorId = cursorId;
		this.mongoKeyValueStore = mongoKeyValueStore;
		this.tableName = tableName;
	}

	public byte[] getKey(Document document){
		int pid = document.getInteger("pid"), rid = document.getInteger("rid");
		long oid = document.getLong("oid");
		ByteBuffer buff = ByteBuffer.allocate(16);
		buff.putInt(pid);
		buff.putLong(oid);
		buff.putInt(rid);		
		return buff.array();
	}
	
	public long getcursorId(){
		return cursorId;
	}
	
	public Record nextBan(){
		MongoRecord mongoRecord = null;
		while(mongoCursor.hasNext()){
			Document document = mongoCursor.next();
			return new MongoRecord( document.get("key", Binary.class).getData(), document.get("value", Binary.class).getData());
		}
		return mongoRecord;		
	}
	
	public Record next() throws BimserverLockConflictException{
		if(tableName == ban1 || tableName == ban2) return nextBan();
		MongoRecord mongoRecord = null;
		while(mongoCursor.hasNext()){
			Document document = mongoCursor.next();
			return new MongoRecord( document);
		}
		return mongoRecord;		
	}

	public void close() {
	//	cursor.close();
		return;
		// TODO Auto-generated method stub
		
	}
	
	public Record lastBan(){
		MongoRecord mongoRecord = null ;
		while(mongoCursor.hasNext()){
			Document document = mongoCursor.next();
			mongoRecord = new MongoRecord( document.get("key", Binary.class).getData(), document.get("value", Binary.class).getData());		
		}
		// TODO Auto-generated method stub
		return mongoRecord;
		
	}

	public Record last() throws BimserverLockConflictException {
		if(tableName == ban1 || tableName == ban2) return lastBan();
		MongoRecord mongoRecord = null ;
		while(mongoCursor.hasNext()){
			Document document = mongoCursor.next();
			mongoRecord = new MongoRecord(document);		
		}
		// TODO Auto-generated method stub
		return mongoRecord;
	}

}

