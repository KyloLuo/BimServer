package org.bimserver.database.migrations;

/******************************************************************************
 * Copyright (C) 2009-2015  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import java.nio.ByteBuffer;

import org.bimserver.database.BimserverDatabaseException;
import org.bimserver.database.BimserverLockConflictException;
import org.bimserver.database.Database;
import org.bimserver.database.DatabaseSession;
import org.bimserver.database.KeyValueStore;
import org.bimserver.database.Record;
import org.bimserver.database.RecordIterator;
import org.bimserver.utils.BinUtils;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewAttributeChange implements Change {

	private static final Logger LOGGER = LoggerFactory.getLogger(NewAttributeChange.class);
	private final EAttribute eAttribute;
	private final Schema schema;
	private int nrFeaturesBefore;

	public NewAttributeChange(Schema schema, int nrFeaturesBefore, EAttribute eAttribute) {
		this.schema = schema;
		this.nrFeaturesBefore = nrFeaturesBefore;
		this.eAttribute = eAttribute;
	}

	@Override
	public void change(Database database, DatabaseSession databaseSession) throws NotImplementedException, BimserverDatabaseException {
		EClass eClass = eAttribute.getEContainingClass();
		KeyValueStore keyValueStore = database.getKeyValueStore();
		for (EClass subClass : schema.getSubClasses(eClass)) {
			try {
				// No data migration if the database is new
				if (subClass.getEAnnotation("nodatabase") == null) {
					RecordIterator recordIterator = keyValueStore.getRecordIterator(subClass.getEPackage().getName() + "_" + subClass.getName(), databaseSession);
					try {
						Record record = recordIterator.next();
						while (record != null) {
							ByteBuffer buffer = ByteBuffer.wrap(record.getValue());

							int nrStartBytesBefore = (int) Math.ceil(nrFeaturesBefore / 8.0);
							int nrStartBytesAfter = (int) Math.ceil((nrFeaturesBefore + 1) / 8.0);
							
							byte x = buffer.get();
							LOGGER.info(subClass.getEPackage().getName() + "_" + subClass.getName());
							
							if (x != nrStartBytesBefore) {
								throw new BimserverDatabaseException("Size does not match");
							}
							
							byte[] unsetted = new byte[(int)x];
							buffer.get(unsetted, 0, x);
							
							
							unsetted[(nrFeaturesBefore) / 8] |= (1 << ((nrFeaturesBefore) % 8));
							
							int extra = 0;

							ByteBuffer newBuffer = ByteBuffer.allocate(record.getValue().length + (nrStartBytesAfter - nrStartBytesBefore) + extra);
							//ByteBuffer newBuffer = ByteBuffer.allocate(record.getValue().length + x+1 + extra);
							newBuffer.put((byte)nrStartBytesAfter);
							newBuffer.put(unsetted);
							buffer.position(1 + nrStartBytesBefore);
							newBuffer.put(buffer);
							
							keyValueStore.store(subClass.getEPackage().getName() + "_" + subClass.getName(), record.getKey(), newBuffer.array(), databaseSession);
							record = recordIterator.next();
						}
					} catch (BimserverDatabaseException e) {
						LOGGER.error("", e);
					} finally {
						recordIterator.close();
					}
				}
			} catch (BimserverLockConflictException e) {
				LOGGER.error("", e);
			}
		}
	}
}
