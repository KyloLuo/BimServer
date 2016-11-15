package org.bimserver.database.mongo;

import java.nio.ByteBuffer;

import org.bimserver.database.BimserverDatabaseException;
import org.bimserver.database.BimserverLockConflictException;
import org.bimserver.database.DatabaseSession;
import org.bson.BsonBinary;
import org.bson.Document;
import org.bson.types.Binary;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.UpdateOptions;

public class MongoBothByte {	
	public static MongoCollection<Document> createTable(String tableName, MongoDatabase mongoDatabase) throws BimserverDatabaseException{
		MongoCollection<Document> mongoCollection = mongoDatabase.getCollection(tableName);
		return mongoCollection;
	}
	
	public static	void store(String tableName, byte[] key, byte[] value, MongoDatabase mongoDatabase) throws BimserverLockConflictException, BimserverDatabaseException{
		MongoCollection<Document> mongoCollection = mongoDatabase.getCollection(tableName);
		Document document = new Document().append("key", new BsonBinary(key)).append("value", new BsonBinary(value));
		MongoCursor<Document> mongoCursor = mongoCollection.find(Filters.eq("key", new BsonBinary(key))).iterator();
		if(mongoCursor.hasNext()){
			UpdateOptions options = new UpdateOptions(); options.upsert(true);
			mongoCollection.updateOne(new Document().append("key", new BsonBinary(key)), new Document("$set", document), options);
		}else{
			mongoCollection.insertOne(document);
		}
	}
	
	public static byte[] get(String tableName, byte[] key, MongoDatabase mongoDatabase) throws BimserverLockConflictException, BimserverDatabaseException{
		MongoCollection<Document> mongoCollection = mongoDatabase.getCollection(tableName);
		MongoCursor<Document> mongoCursor = mongoCollection.find(Filters.eq("key", new BsonBinary(key))).iterator();
		while(mongoCursor.hasNext()){
			Document document = mongoCursor.next();
			Binary value = document.get("value", Binary.class);			
			return value.getData();
		}
		return null;		
	}	
}
