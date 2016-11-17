package org.bimserver.database.mongo;

import java.nio.ByteBuffer;

import org.bimserver.database.Record;
import org.bson.Document;
import org.bson.types.Binary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MongoRecord implements Record{
	

//	private static final Logger LOGGER = LoggerFactory.getLogger(MongoRecord.class);


	final byte[] key;
	final byte[] value;
	
	public byte[] getKey(Document document){
		int pid = document.getInteger("pid"), rid = document.getInteger("rid");
		long oid = document.getLong("oid");
		ByteBuffer buff = ByteBuffer.allocate(16);
		buff.putInt(pid);
		buff.putLong(oid);
		buff.putInt(rid);		
//		LOGGER.info("showdata pid = " + pid + ", oid = " + oid + ", rid = " + rid);
		return buff.array();
	}
	
	public MongoRecord(Document document) {
		this.key = getKey(document);
		this.value = document.get("value", Binary.class).getData();
	}

	public MongoRecord(byte[] key, byte[] value) {
		this.key = key;
		this.value = value;
		// TODO Auto-generated constructor stub
	}

	@Override
	public byte[] getKey() {
		return key;
	}

	@Override
	public byte[] getValue() {
		return value;
	}
}
