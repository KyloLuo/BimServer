package org.bimserver.database.mongo;

import java.nio.ByteBuffer;
import java.util.Arrays;

import org.bimserver.database.Record;
import org.bson.Document;

import com.mongodb.client.MongoCursor;

public class MongoRealIterator {
	
	private final MongoCursor<Document> mongoCursor;
	private final byte[] mustStartWith;

	public MongoRealIterator(MongoCursor<Document> cursor, byte[] mustStartWith) {
		// TODO Auto-generated constructor stub
		mongoCursor = cursor;
		this.mustStartWith = mustStartWith;
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

	public MongoRecord getFirstNext(byte[] startSearchingAt) {
		MongoRecord mongoRecord = null;
		while(mongoCursor.hasNext()){
			Document document = mongoCursor.next();
			byte[] keys = getKey(document);

			byte[] firstBytes = new byte[mustStartWith.length];
			System.arraycopy(keys, 0, firstBytes, 0, mustStartWith.length);
			if (Arrays.equals(firstBytes, mustStartWith)) {
				mongoRecord = new MongoRecord( document );
				return mongoRecord;
			}
		}
		return mongoRecord;
	}

	public Record last() {
		MongoRecord mongoRecord = null;
		while(mongoCursor.hasNext()){
			Document document = mongoCursor.next();
			byte[] keys = getKey(document);
			
			byte[] firstBytes = new byte[mustStartWith.length];
			System.arraycopy(keys, 0, firstBytes, 0, mustStartWith.length);
			if (Arrays.equals(firstBytes, mustStartWith)) {
				mongoRecord = new MongoRecord(document);
			}
		}
		// TODO Auto-generated method stub
		return mongoRecord;
	}

	public Record next() {
		MongoRecord mongoRecord = null;
		while(mongoCursor.hasNext()){
			Document document = mongoCursor.next();
			byte[] keys = getKey(document);

			byte[] firstBytes = new byte[mustStartWith.length];
			System.arraycopy(keys, 0, firstBytes, 0, mustStartWith.length);
			if (Arrays.equals(firstBytes, mustStartWith)) {
				return new MongoRecord( document);
			}
		}
		return mongoRecord;		
		// TODO Auto-generated method stub
		
	}



}
