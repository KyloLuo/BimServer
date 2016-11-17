package org.bimserver.database;

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

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import org.bimserver.ServerEStore;
import org.bimserver.database.actions.BimDatabaseAction;
import org.bimserver.database.mongo.BimserverConcurrentModificationDatabaseException;
import org.bimserver.database.query.conditions.Condition;
import org.bimserver.database.query.conditions.IsOfTypeCondition;
import org.bimserver.emf.BimServerEStore;
import org.bimserver.emf.IdEObject;
import org.bimserver.emf.IdEObjectImpl;
import org.bimserver.emf.IdEObjectImpl.State;
import org.bimserver.emf.IfcModelInterface;
import org.bimserver.emf.IfcModelInterfaceException;
import org.bimserver.emf.LazyLoader;
import org.bimserver.emf.MetaDataException;
import org.bimserver.emf.MetaDataManager;
import org.bimserver.emf.OidProvider;
import org.bimserver.emf.PackageMetaData;
import org.bimserver.emf.QueryInterface;
import org.bimserver.ifc.IfcModel;
import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcGloballyUniqueId;
import org.bimserver.models.ifc2x3tc1.Tristate;
import org.bimserver.models.store.Checkout;
import org.bimserver.models.store.ConcreteRevision;
import org.bimserver.models.store.DatabaseInformation;
import org.bimserver.models.store.DatabaseInformationCategory;
import org.bimserver.models.store.DatabaseInformationItem;
import org.bimserver.models.store.Project;
import org.bimserver.models.store.StoreFactory;
import org.bimserver.models.store.StorePackage;
import org.bimserver.models.store.User;
import org.bimserver.shared.exceptions.ServerException;
import org.bimserver.shared.exceptions.ServiceException;
import org.bimserver.shared.exceptions.UserException;
import org.bimserver.utils.BinUtils;
import org.eclipse.emf.common.util.AbstractEList;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EEnumImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Charsets;

public class DatabaseSession implements LazyLoader, OidProvider<Long> {
	public static final int DEFAULT_CONFLICT_RETRIES = 10;
	private static final boolean DEVELOPER_DEBUG = false;
	private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseSession.class);
	private static final EcorePackage ECORE_PACKAGE = EcorePackage.eINSTANCE;
	private final Database database;
	private final Set<PostCommitAction> postCommitActions = new LinkedHashSet<PostCommitAction>();
	private final ObjectsToCommit objectsToCommit = new ObjectsToCommit();
	private final ObjectsToDelete objectsToDelete = new ObjectsToDelete();
	private StackTraceElement[] stackTrace;
	private final ObjectCache objectCache = new ObjectCache();
	private int reads;
	private BimServerEStore eStore;

	private enum SessionState {
		OPEN, CLOSED
	}

	private SessionState state = SessionState.OPEN;
	private boolean overwriteEnabled;

	public DatabaseSession(Database database, BimTransaction bimTransaction) {
		this.database = database;
		this.stackTrace = Thread.currentThread().getStackTrace();
		if (DEVELOPER_DEBUG) {
			LOGGER.info("");
			LOGGER.info("NEW SESSION");
		}
		this.eStore = new ServerEStore(this);
	}

	public void setOverwriteEnabled(boolean overwriteEnabled) {
		this.overwriteEnabled = overwriteEnabled;
	}

	public EClass getEClassForName(String packageName, String className) {
		return database.getEClassForName(packageName, className);
	}

	public void addPostCommitAction(PostCommitAction postCommitAction) {
		postCommitActions.add(postCommitAction);
	}

	public void addToObjectsToCommit(IdEObject idEObject)
			throws BimserverDatabaseException {
		if (idEObject.getOid() == -1) {
			throw new BimserverDatabaseException(
					"Cannot store object with oid -1");
		}
		objectsToCommit.put(idEObject);
	}

	public void close() {
		state = SessionState.CLOSED;
		database.unregisterSession(this);
		database.incrementReads(reads);
		if (DEVELOPER_DEBUG) {
			LOGGER.info("END SESSION");
		}
	}

	public boolean validateOidInNeedList(ArrayList<ArrayList<Long>> list,
			long input) {// ��֤Oid�Ƿ�����������
		for (ArrayList<Long> tt : list) {
			if (tt.contains(input)) {
				return true;
			}
		}
		return false;
	}

	public boolean validateOidInNeedFloor(ArrayList<ArrayList<Long>> list,
			long input, int floor) {// ��֤Oid�Ƿ����������
		if (floor > list.size() - 1) {
			if (list.get(list.size() - 1).contains(input)) {
				return true;
			}
		} else {
			if (list.get(floor).contains(input)) {
				return true;
			}
		}
		return false;
	}

	// floor��ʾ��Ҫ��ʾ��¥��,����-1ʱ�����ʾ�����иò���
	public boolean validateOidByNeedFloor(ArrayList<ArrayList<Long>> list,
			long input, int floor) {// ��֤Oid������ڷ���Ҫ��floor���������У��򷵻�true
									// ���粻���򷵻�false
		if (floor != -1) {
			if (floor > list.size() - 1) {
				floor = list.size() - 1;
			}
			for (int i = 0; i < list.size(); i++) {
				if (i != floor) {
					if (list.get(i).contains(input)) {
						return true;
					}
				} else {
					if (list.get(i).contains(input)) {
						return false;
					}
				}
			}
		}
		return false;
	}

	public void commit(ProgressHandler progressHandler)
			throws BimserverDatabaseException, ServiceException {
		checkOpen();
		try {
			if (progressHandler != null) {
				progressHandler.progress(0, objectsToCommit.size());
			}
			int current = 0;
			int writes = 0;
			ByteBuffer keyBuffer = ByteBuffer.wrap(new byte[16]);
			for (RecordIdentifierPlusType recordIdentifier : objectsToDelete) {
				fillKeyBuffer(keyBuffer, recordIdentifier);
				database.getKeyValueStore().storeNoOverwrite(
						recordIdentifier.getPackageName() + "_"
								+ recordIdentifier.getClassName(),
						keyBuffer.array(), new byte[] { -1 }, this);
				writes++;// @ch tabname = packageName+_+className
			}
			// This buffer is reused for the values, it's position must be reset
			// at the end of the loop, and the convertObjectToByteArray function
			// is responsible for setting the buffer's position to the end of
			// the (used part of the) buffer
			ByteBuffer reusableBuffer = ByteBuffer.allocate(32768);
			// int i = 1;
			ArrayList<ArrayList<Long>> containedStructureList = new ArrayList<ArrayList<Long>>();
			boolean b;
			boolean flag = false;// ����Ƿ�����ռ�ṹ
			if (flag == true) {
				for (IdEObject object : objectsToCommit) {// ������������ҵ��ռ�ṹ
					if (object.eClass().getName()
							.equals("IfcRelContainedInSpatialStructure")) {
						;// �ҵ��洢�ռ�ṹ�Ķ���
						if (object.validateSpaceContained()) {// �ռ�ṹ�������ʵ�����������
							EObjectResolvingEList<IdEObject> ob = (EObjectResolvingEList) object
									.getContainedList();
							ArrayList<Long> list = new ArrayList<Long>();
							for (int i = 0; i < ob.data().length; i++) {
								try {
									list.add(ob.get(i).getOid());
								} catch (Exception e) {
									continue;
								}
							}
							containedStructureList.add(list);
						}
					}
				}
			}
			for (IdEObject object : objectsToCommit) {// @ch
														// ����objects�е�IdEObject����
				// if(object.eClass().getName().equals("IfcWallStandardCase"))
				// {

				// String www= object.eClass().getName();// for test
				// }
				try {
					// ע:validateOidInNeedFloor��֤���Ƿ��ڸ�¥�����У���Ҫ�������Ļ��ǵ�!
					// b=!((this.validateOidInNeedFloor(containedStructureList,
					// object.getOid(),
					// 0))||(this.validateOidInNeedFloor(containedStructureList,
					// object.getOid(),4))||
					// (this.validateOidInNeedFloor(containedStructureList,
					// object.getOid(),
					// 1))||(this.validateOidInNeedFloor(containedStructureList,
					// object.getOid(), 2)));

					b = !this.validateOidByNeedFloor(containedStructureList,
							object.getOid(), -1);

				} catch (Exception e) {
					b = true;
				}
				if (b) {
					if (object.getOid() == -1) {
						throw new BimserverDatabaseException(
								"Cannot store object with oid -1");
					}

					fillKeyBuffer(keyBuffer, object);// ����object ����keybuffer
														// length(16)
					if (DEVELOPER_DEBUG) {
						LOGGER.info("Write: " + object.eClass().getName() + " "
								+ "pid=" + object.getPid() + " oid="
								+ object.getOid() + " rid=" + object.getRid());
					}
					ByteBuffer valueBuffer = convertObjectToByteArray(object,
							reusableBuffer);// convert object to
											// bytebuffer������������valuebuffer������ʲô��ȫ��ƴ�����
					// reusable �����õ�
					if (object.eClass().getEAnnotation("nolazyload") == null
							&& !overwriteEnabled) {
						database.getKeyValueStore().storeNoOverwrite(
								object.eClass().getEPackage().getName() + "_"
										+ object.eClass().getName(),
								keyBuffer.array(), valueBuffer.array(), 0,
								valueBuffer.position(), this);
					} else {
						database.getKeyValueStore().store(
								object.eClass().getEPackage().getName() + "_"
										+ object.eClass().getName(),
								keyBuffer.array(), valueBuffer.array(), 0,
								valueBuffer.position(), this);
					}
					if (progressHandler != null) {
						progressHandler.progress(++current,
								objectsToCommit.size());
					}
					writes++;
					reusableBuffer.position(0);
				}
			}
			database.incrementCommittedWrites(writes);
			close();
			for (PostCommitAction postCommitAction : postCommitActions) {
				postCommitAction.execute();
			}
		} catch (BimserverDatabaseException e) {
			throw e;
		} catch (ServiceException e) {
			throw e;
		}

	}

	private void fillKeyBuffer(ByteBuffer buffer,
			RecordIdentifierPlusType recordIdentifier) {
		fillKeyBuffer(buffer, recordIdentifier.getPid(),
				recordIdentifier.getOid(), recordIdentifier.getRid());
	}

	//����һ��Object���󣬰�estore��queryInterface����ȥ
	private IdEObjectImpl createInternal(EClass eClass,
			QueryInterface queryInterface) {
		IdEObjectImpl object = (IdEObjectImpl) eClass.getEPackage()
				.getEFactoryInstance().create(eClass);
		object.setBimserverEStore(eStore);
		object.setQueryInterface(queryInterface);
		return object;
	}

	private IdEObject convertByteArrayToObject(EClass originalQueryClass,
			EClass eClass, long oid, ByteBuffer buffer,
			IfcModelInterface model, int rid, QueryInterface query,
			TodoList todoList) throws BimserverDatabaseException {
		if (model.contains(oid)) {
			return model.get(oid);
		}//����Ѿ���ȡ��oid���ʵ�壬ֱ��ȡ��������
		
		RecordIdentifier recordIdentifier = new RecordIdentifier(
				query.getPid(), oid, rid);
		if (objectCache.contains(recordIdentifier.getOid())) {
			IdEObject idEObject = objectCache.get(recordIdentifier.getOid());
			if (!model.contains(oid)) {
				if (idEObject.eClass().getEAnnotation("wrapped") == null) {//����������
					try {
						model.addAllowMultiModel(oid, idEObject);
					} catch (IfcModelInterfaceException e) {
						throw new BimserverDatabaseException(e);
					}
				} else {
					try {
						model.add(oid, idEObject);
					} catch (IfcModelInterfaceException e) {
						LOGGER.error("", e);
					}
				}
			}
			return idEObject;
		}

		IdEObjectImpl object = createInternal(eClass, query);

		object.setOid(oid);
		object.setPid(query.getPid());
		object.setRid(rid);
		if (!query.isDeep()) {
			object.setLoading();
		}//����object����
		if (object.eClass().getEAnnotation("wrapped") == null) {
			try {
				model.addAllowMultiModel(oid, object);
			} catch (IfcModelInterfaceException e) {
				throw new BimserverDatabaseException(e);
			}
		}
		if (buffer.capacity() == 1 && buffer.get(0) == -1) {
			buffer.position(buffer.position() + 1);
			return null;
		}
		return convertByteArrayToObject(object, originalQueryClass, eClass,
				oid, buffer, model, rid, query, todoList);
	}

	@SuppressWarnings({ "unchecked", "unused" })
	private IdEObject convertByteArrayToObject(IdEObject idEObject,
			EClass originalQueryClass, EClass eClass, long oid,
			ByteBuffer buffer, IfcModelInterface model, int rid,
			QueryInterface query, TodoList todoList)
			throws BimserverDatabaseException {// @ch ��byte���鷴���л��ɶ���
		try {
			if (idEObject == null) {
				idEObject = createInternal(eClass, query);

				((IdEObjectImpl) idEObject).setOid(oid);
				((IdEObjectImpl) idEObject).setPid(query.getPid());
				if (rid == Integer.MAX_VALUE) {
					throw new BimserverDatabaseException(
							"Database corrupt, rid cannot be "
									+ Integer.MAX_VALUE);
				}
			}
			((IdEObjectImpl) idEObject).setRid(rid);
			((IdEObjectImpl) idEObject).useInverses(false);

			if (DEVELOPER_DEBUG
					&& StorePackage.eINSTANCE == idEObject.eClass()
							.getEPackage()) {
				LOGGER.info("Read: " + idEObject.eClass().getName() + " pid="
						+ query.getPid() + " oid=" + oid + " rid=" + rid);
			}

			((IdEObjectImpl) idEObject).setLoadingState(State.LOADING);

			objectCache.put(new RecordIdentifier(query.getPid(), oid, rid),
					idEObject);

			byte unsettedLength = buffer.get();
			byte[] unsetted = new byte[unsettedLength];
			buffer.get(unsetted);

			int fieldCounter = 0;
			for (EStructuralFeature feature : eClass
					.getEAllStructuralFeatures()) {
				boolean isUnsetted = (unsetted[fieldCounter / 8] & (1 << (fieldCounter % 8))) != 0;
				if (isUnsetted) {
					if (feature.isUnsettable()) {
						idEObject.eUnset(feature);
					} else if (feature.isMany()) {
						// do nothing
					} else if (feature.getDefaultValue() != null) {
						idEObject.eSet(feature, feature.getDefaultValue());
					}
				} else {
					if (!query.shouldFollowReference(originalQueryClass,
							eClass, feature)) {
						// we have to do some reading to maintain a correct
						// index
						fakeRead(buffer, feature);
					} else {
						Object newValue = null;
						if (feature.isMany()) {
							if (feature.getEType() instanceof EEnum) {
							} else if (feature.getEType() instanceof EClass) {
								if (buffer.capacity() == 1
										&& buffer.get(0) == -1) {
									buffer.position(buffer.position() + 1);
								} else {
									/*
									 * TODO There still is a problem with this,
									 * when readReference (and all calls beyond
									 * that call) alter (by opposites) this
									 * list, this list can potentially grow too
									 * large
									 * 
									 * Only can happen with non-unique
									 * references
									 */
									int listSize = buffer.getInt();

									AbstractEList<Object> list = (AbstractEList<Object>) idEObject
											.eGet(feature);
									for (int i = 0; i < listSize; i++) {
										IdEObject referencedObject = null;

										short cid = buffer.getShort();
										if (cid == -1) {
											// null, do nothing
										} else if (cid < 0) {
											// negative cid means value is
											// embedded
											// in record
											EClass referenceClass = database
													.getEClassForCid((short) (-cid));
											referencedObject = readWrappedValue(
													feature, buffer,
													referenceClass, query);
										} else if (cid > 0) {
											// positive cid means value is a
											// reference
											// to another record
											EClass referenceClass = database
													.getEClassForCid(cid);
											referencedObject = readReference(
													originalQueryClass, buffer,
													model, idEObject, feature,
													referenceClass, query,
													todoList);
										}
										if (referencedObject != null) {
											if (!feature.getEType().isInstance(
													referencedObject)) {
												throw new BimserverDatabaseException(
														referencedObject
																.getClass()
																.getSimpleName()
																+ " cannot be stored in list of "
																+ feature
																		.getName());
											}
											EReference eReference = (EReference) feature;
											if (feature.isUnique()) {
												list.add(referencedObject);
											} else {
												list.addUnique(referencedObject);
											}
										}
									}
								}
							} else if (feature.getEType() instanceof EDataType) {
								int listSize = buffer.getInt();
								BasicEList<Object> list = new BasicEList<Object>(
										listSize);
								for (int i = 0; i < listSize; i++) {
									Object reference = readPrimitiveValue(
											feature.getEType(), buffer);
									if (reference != null) {
										list.addUnique(reference);
									}
								}
								newValue = list;
							}
						} else {
							if (feature.getEType() instanceof EEnum) {
								int enumOrdinal = buffer.getInt();
								if (enumOrdinal == -1) {
									newValue = null;
								} else {
									EClassifier eType = feature.getEType();
									EEnumLiteral enumLiteral = ((EEnumImpl) eType)
											.getEEnumLiteral(enumOrdinal);
									if (enumLiteral != null) {
										newValue = enumLiteral.getInstance();
									}
								}
							} else if (feature.getEType() instanceof EClass) {
								// EReference eReference = (EReference) feature;
								short cid = buffer.getShort();
								if (cid == -1) {
									// null, do nothing
								} else if (cid < 0) {
									// negative cid means value is embedded in
									// record
									EClass referenceClass = database
											.getEClassForCid((short) (-cid));
									newValue = readWrappedValue(feature,
											buffer, referenceClass, query);
								} else if (cid > 0) {
									// positive cid means value is reference to
									// other record
									EClass referenceClass = database
											.getEClassForCid(cid);
									newValue = readReference(
											originalQueryClass, buffer, model,
											idEObject, feature, referenceClass,
											query, todoList);
									// if (eReference.getEOpposite() != null &&
									// ((IdEObjectImpl)
									// newValue).isLoadedOrLoading()) {
									// newValue = null;
									// }
								}
							} else if (feature.getEType() instanceof EDataType) {
								newValue = readPrimitiveValue(
										feature.getEType(), buffer);
							}
						}
						if (newValue != null) {
							idEObject.eSet(feature, newValue);
						}
					}
				}
				fieldCounter++;
			}
			((IdEObjectImpl) idEObject).setLoaded();
			((IdEObjectImpl) idEObject).useInverses(true);
			if (DEVELOPER_DEBUG && idEObject.getRid() > 100000
					|| idEObject.getRid() < -100000) {
				LOGGER.debug("Improbable rid " + idEObject.getRid() + " - "
						+ idEObject);
			}
			return idEObject;
		} catch (BufferUnderflowException e) {
			throw new BimserverDatabaseException("Reading " + eClass.getName(),
					e);
		} catch (BufferOverflowException e) {
			throw new BimserverDatabaseException("Reading " + eClass.getName(),
					e);
		}
	}

	private boolean useUnsetBit(EStructuralFeature feature, IdEObject object) {
		// TODO non-unsettable boolean values can also be stored in these bits
		Object value = object.eGet(feature);
		if (feature.isUnsettable()) {
			if (!object.eIsSet(feature)) {
				return true;
			}
		} else {
			if (feature.isMany() && ((List<?>) value).isEmpty()) {
				return true;
			}
			if (feature.getDefaultValue() == value
					|| (feature.getDefaultValue() != null && feature
							.getDefaultValue().equals(value))) {
				return true;
			}
		}
		return false;
	}

	private ByteBuffer convertObjectToByteArray(IdEObject object,
			ByteBuffer buffer) throws BimserverDatabaseException {
		int bufferSize = getExactSize(object);
		if (bufferSize > buffer.capacity()) {
			LOGGER.debug("Buffer too small (" + bufferSize + ")");
			buffer = ByteBuffer.allocate(bufferSize);
		}
		byte[] unsetted = new byte[(int) Math.ceil(object.eClass()
				.getEAllStructuralFeatures().size() / 8.0)];
		int fieldCounter = 0;
		for (EStructuralFeature feature : object.eClass()
				.getEAllStructuralFeatures()) {
			if (useUnsetBit(feature, object)) {
				unsetted[fieldCounter / 8] |= (1 << (fieldCounter % 8));
			}
			fieldCounter++;
		}
		buffer.put((byte) unsetted.length);
		buffer.put(unsetted);

		for (EStructuralFeature feature : object.eClass()
				.getEAllStructuralFeatures()) {
			if (!useUnsetBit(feature, object)) {
				if (feature.isMany()) {
					if (feature.getEType() instanceof EEnum) {
						// Aggregate relations to enums never occur... at this
						// moment
					} else if (feature.getEType() instanceof EClass) {
						EList<?> list = (EList<?>) object.eGet(feature);
						buffer.putInt(list.size());
						for (Object o : list) {
							if (o == null) {
								buffer.putShort((short) -1);
							} else {
								IdEObject listObject = (IdEObject) o;
								if (listObject.eClass().getEAnnotation(
										"wrapped") != null
										|| listObject.eClass()
												.getEStructuralFeature(
														"wrappedValue") != null) {
									writeWrappedValue(object.getPid(),
											object.getRid(), listObject, buffer);
								} else {
									writeReference(object, listObject, buffer,
											feature);
								}
							}
						}
					} else if (feature.getEType() instanceof EDataType) {
						EList<?> list = (EList<?>) object.eGet(feature);
						buffer.putInt(list.size());
						for (Object o : list) {
							writePrimitiveValue(feature, o, buffer);
						}
					}
				} else {
					Object value = object.eGet(feature);
					if (feature.getEType() instanceof EEnum) {
						if (value == null) {
							buffer.putInt(-1);
						} else {
							EEnum eEnum = (EEnum) feature.getEType();
							EEnumLiteral eEnumLiteral = eEnum
									.getEEnumLiteralByLiteral(((Enum<?>) value)
											.toString());
							if (eEnumLiteral != null) {
								buffer.putInt(eEnumLiteral.getValue());
							} else {
								LOGGER.error(((Enum<?>) value).toString()
										+ " not found");
								buffer.putInt(-1);
							}
						}
					} else if (feature.getEType() instanceof EClass) {
						if (value == null) {
							buffer.putShort((short) -1);
						} else {
							IdEObject referencedObject = (IdEObject) value;
							EClass referencedClass = referencedObject.eClass();
							if (referencedClass.getEAnnotation("wrapped") != null) {
								writeWrappedValue(object.getPid(),
										object.getRid(), value, buffer);
							} else {
								writeReference(object, value, buffer, feature);
							}
						}
					} else if (feature.getEType() instanceof EDataType) {
						writePrimitiveValue(feature, value, buffer);
					}
				}
			}
		}
		if (buffer.position() != bufferSize) {
			throw new BimserverDatabaseException(
					"Value buffer sizes do not match for "
							+ object.eClass().getName() + " "
							+ buffer.position() + "/" + bufferSize);
		}
		return buffer;
	}

	@SuppressWarnings("unused")
	private ByteBuffer fillKeyBuffer(ByteBuffer buffer, IdEObject object) {
		if (DEVELOPER_DEBUG && object.getRid() > 100000
				|| object.getRid() < -100000) {
			LOGGER.debug("Improbable rid: " + object.getRid() + " - " + object);
		}
		return fillKeyBuffer(buffer, object.getPid(), object.getOid(),
				object.getRid());
	}

	private ByteBuffer fillKeyBuffer(ByteBuffer buffer, int pid, long oid,
			int rid) {// ���keyֵ��ByteBuffer
		buffer.position(0);
		buffer.putInt(pid);
		buffer.putLong(oid);
		buffer.putInt(-rid);
		return buffer;
	}

	private ByteBuffer createKeyBuffer(int pid, long oid, int rid) {
		ByteBuffer keyBuffer = ByteBuffer.allocate(16);
		fillKeyBuffer(keyBuffer, pid, oid, rid);
		return keyBuffer;
	}

	private ByteBuffer createKeyBuffer(int pid, long oid) {
		ByteBuffer keyBuffer = ByteBuffer.allocate(12);
		fillKeyBuffer(keyBuffer, pid, oid);
		return keyBuffer;
	}

	private ByteBuffer fillKeyBuffer(ByteBuffer buffer, int pid, long oid) {
		buffer.position(0);
		buffer.putInt(pid);
		buffer.putLong(oid);
		return buffer;
	}

	public void delete(IdEObject object, Integer newRid)
			throws BimserverDatabaseException {
		checkOpen();
		// if (perRecordVersioning(object)) {
		objectsToDelete.put(object.eClass(), object.getPid(), newRid,
				object.getOid());
		if (objectsToCommit.containsObject(object)) {
			objectsToCommit.remove(object);
		}
		// } else {

		// TODO implement
		// throw new BimserverDatabaseException("This is not supported");
		// }
	}

	public <T> T executeAndCommitAction(BimDatabaseAction<T> action,
			ProgressHandler progressHandler) throws BimserverDatabaseException,
			ServiceException {
		checkOpen();
		return executeAndCommitAction(action, DEFAULT_CONFLICT_RETRIES,
				progressHandler);
	}

	public <T> T executeAndCommitAction(BimDatabaseAction<T> action)
			throws BimserverDatabaseException, UserException, ServerException {
		checkOpen();
		return executeAndCommitAction(action, DEFAULT_CONFLICT_RETRIES, null);// �ڶ���������Ĭ�ϳ�ͻ���Դ���
	}

	// @ch ִ��action
	public <T> T executeAndCommitAction(BimDatabaseAction<T> action,
			int retries, ProgressHandler progressHandler)
			throws BimserverDatabaseException, UserException, ServerException {
		checkOpen();
		for (int i = 0; i < retries; i++) {
			try {
				T result = action.execute();// @ch ִ��action
				if (objectsToCommit.size() > 0 || objectsToDelete.size() > 0) {
					commit(progressHandler);// @ch �������size>0������progresshandler
				}
				return result;
			} catch (BimserverConcurrentModificationDatabaseException e) {
				if (progressHandler != null) {
					progressHandler.retry(i + 1);
				}
				objectCache.clear();
				objectsToCommit.clear();
			} catch (BimserverLockConflictException e) {
				objectCache.clear();
				objectsToCommit.clear();
			} catch (UncheckedBimserverLockConflictException e) {
				objectCache.clear();
				objectsToCommit.clear();
			} catch (BimserverDatabaseException e) {
				throw e;
			} catch (ServiceException e) {
				if (e instanceof UserException) {
					throw ((UserException) e);
				} else if (e instanceof ServerException) {
					throw ((ServerException) e);
				} else {
					LOGGER.error("", e);
				}
			}
			if (i < retries - 1) {
				try {
					Thread.sleep(new Random().nextInt((i + 1) * 1000));
				} catch (InterruptedException e1) {
					LOGGER.error("", e1);
				}
			}
		}
		throw new BimserverDatabaseException("Too many conflicts, tried "
				+ retries + " times");
	}

	@SuppressWarnings("unchecked")
	public <T extends IdEObject> T get(EClass eClass, IfcModelInterface model,
			IdEObject idEObject, long oid, QueryInterface query,
			TodoList todoList) throws BimserverDatabaseException {
		checkOpen();
		return (T) get(idEObject, oid, model, query, todoList);
	}

	@SuppressWarnings("unchecked")
	public <T extends IdEObject> T get(long oid, QueryInterface query)
			throws BimserverDatabaseException {
		checkOpen();
		TodoList todoList = new TodoList();
		IfcModelInterface model = createModel(query);
		IdEObject idEObject = get(model, null, oid, query, todoList);
		processTodoList(model, todoList, query);
		return (T) idEObject;
	}

	@SuppressWarnings("unchecked")
	public <T extends IdEObject> T get(IfcModelInterface model, long oid,
			QueryInterface query) throws BimserverDatabaseException {
		checkOpen();
		TodoList todoList = new TodoList();
		IdEObject idEObject = get(model, null, oid, query, todoList);
		processTodoList(model, todoList, query);
		return (T) idEObject;
	}

	// @ch
	// get from db
	public <T extends IdEObject> T get(EClass eClass, long oid,
			QueryInterface query) throws BimserverDatabaseException {
		checkOpen();
		if (oid == -1) {
			return null;
		}
		TodoList todoList = new TodoList();
		IfcModelInterface model = createModel(query);// @ch createModel by query
		T t = get(model, null, oid, query, todoList);
		processTodoList(model, todoList, query);
		return t;
	}

	public <T extends IdEObject> T get(IfcModelInterface model, EClass eClass,
			long oid, QueryInterface query) throws BimserverDatabaseException {
		checkOpen();
		if (oid == -1) {
			return null;
		}
		TodoList todoList = new TodoList();
		T t = get(model, null, oid, query, todoList);
		processTodoList(model, todoList, query);
		return t;
	}

	private void checkOpen() throws BimserverDatabaseException {
		if (state == SessionState.CLOSED) {
			throw new BimserverDatabaseException("Database session is closed");
		}
	}

	@SuppressWarnings("unchecked")
	public <T extends IdEObject> T get(IfcModelInterface model,
			IdEObject idEObject, long oid, QueryInterface query,
			TodoList todoList) throws BimserverDatabaseException {
		checkOpen();
		return (T) get(idEObject, oid, model, query, todoList);
	}

	public <T extends IdEObject> T get(IdEObject idEObject, long oid,
			IfcModelInterface model, QueryInterface query)
			throws BimserverDatabaseException {
		checkOpen();
		TodoList todoList = new TodoList();
		T result = get(idEObject, oid, model, query, todoList);
		processTodoList(model, todoList, query);
		return result;
	}

	@SuppressWarnings("unchecked")
	public <T extends IdEObject> T get(IdEObject idEObject, long oid,
			IfcModelInterface model, QueryInterface query, TodoList todoList)
			throws BimserverDatabaseException {
		checkOpen();
		if (oid == -1) {
			throw new BimserverDatabaseException("Cannot get object for oid "
					+ oid);
		}
		if (objectsToCommit.containsOid(oid)) {
			return (T) objectsToCommit.getByOid(oid);
		}
		EClass eClass = getEClassForOid(oid);
		if (idEObject != null) {
			if (!eClass.isSuperTypeOf(idEObject.eClass())) {
				throw new BimserverDatabaseException("Object with oid " + oid
						+ " is a " + idEObject.eClass().getName()
						+ " but it's cid-part says it's a " + eClass.getName());
			}
		}
		RecordIdentifier recordIdentifier = new RecordIdentifier(
				query.getPid(), oid, query.getRid());
		IdEObjectImpl cachedObject = (IdEObjectImpl) objectCache
				.get(recordIdentifier);// @ch recordIdentifier ��¼��ʶ��
		if (cachedObject != null) {
			idEObject = cachedObject;
			if (cachedObject.getLoadingState() == State.LOADED
					&& cachedObject.getRid() != Integer.MAX_VALUE) {
				cachedObject.load();
				return (T) cachedObject;
			}
		}
		ByteBuffer mustStartWith = ByteBuffer.wrap(new byte[12]);
		mustStartWith.putInt(query.getPid());// @ch ����д�� int ֵ����� put
												// ��������ѡ��������putInt(int value)������
		mustStartWith.putLong(oid);// pid+oid
		ByteBuffer startSearchWith = ByteBuffer.wrap(new byte[16]);// @ch
																	// ���ֽ������װ���������С�
																	// �������޸Ľ����������޸ģ���֮��Ȼ
		startSearchWith.putInt(query.getPid());
		startSearchWith.putLong(oid);
		startSearchWith.putInt(-query.getRid());// ƴ�Ӵ�Ҫ��ѯ��keyֵ��pid+oid+(-rid)

		SearchingRecordIterator recordIterator = database
				.getKeyValueStore()
				.getRecordIterator(
						eClass.getEPackage().getName() + "_" + eClass.getName(),
						mustStartWith.array(), startSearchWith.array(), this);
		try {
			Record record = recordIterator.next();// @ch ����key��ȡvalue�Ĺ���
			if (record == null) {
				return null;
			}
			reads++;
			ByteBuffer keyBuffer = ByteBuffer.wrap(record.getKey());// @ch
																	// recordΪ��ȡ����byte���飬��key����ͬ������װ����������
			ByteBuffer valueBuffer = ByteBuffer.wrap(record.getValue());// @ch
																		// ����һ����record��ֵbuffer��ͬ��С��buffer
			keyBuffer.getInt(); // pid
			long keyOid = keyBuffer.getLong();// @ch ������long ����key�а�����objectID
			int keyRid = -keyBuffer.getInt();// @ch ������int ����key�а�����Rid
			if (keyRid <= query.getRid()) {// ���key�а汾�ϵͣ�����°汾
				if (idEObject != null
						&& idEObject.getRid() == Integer.MAX_VALUE) {
					((IdEObjectImpl) idEObject).setRid(keyRid);
				}
				if (model.contains(keyOid)
						&& ((IdEObjectImpl) model.get(keyOid))
								.getLoadingState() == State.LOADED) {
					return (T) model.get(keyOid);
				} else {
					if (valueBuffer.capacity() == 1 && valueBuffer.get(0) == -1) {// �����ȡ����valueBufferΪ��
																					// ��һλȱʡΪ-1
						valueBuffer.position(valueBuffer.position() + 1);
						return null;
						// deleted entity
					} else {
						T convertByteArrayToObject = (T) convertByteArrayToObject(
								idEObject, eClass, eClass, keyOid, valueBuffer,
								model, keyRid, query, todoList);// @ch convert
																// to object
						if (convertByteArrayToObject.getRid() == Integer.MAX_VALUE) {
							((IdEObjectImpl) convertByteArrayToObject)
									.setRid(keyRid);
						}
						objectCache.put(recordIdentifier,
								convertByteArrayToObject);// @ch ����¼�Ž����󻺴�
						return convertByteArrayToObject;
					}
				}
			} else {
				return null;
			}
		} finally {
			recordIterator.close();
		}
	}

	public IfcModelInterface getAllOfType(EClass eClass, QueryInterface query)
			throws BimserverDatabaseException {
		IfcModelInterface model = createModel(query);
		return getAllOfType(model, eClass, query);
	}

	public IfcModelInterface getAllOfType(IfcModelInterface model,
			EClass eClass, QueryInterface query)
			throws BimserverDatabaseException {
		checkOpen();
		TodoList todoList = new TodoList();
		getMap(eClass, model, query, todoList);
		processTodoList(model, todoList, query);
		return model;
	}

	public IfcModelInterface getAllOfTypes(Set<EClass> eClasses,
			QueryInterface query) throws BimserverDatabaseException {
		IfcModelInterface model = createModel(query);
		return getAllOfTypes(model, eClasses, query);
	}

	public IfcModelInterface getAllOfTypes(IfcModelInterface model,
			Set<EClass> eClasses, QueryInterface query)
			throws BimserverDatabaseException {
		checkOpen();
		TodoList todoList = new TodoList();
		for (EClass eClass : eClasses) {
			getMap(eClass, model, query, todoList);
		}
		processTodoList(model, todoList, query);
		return model;
	}

	public IfcModelInterface getAllOfType(String packageName, String className,
			QueryInterface query) throws BimserverDatabaseException {
		checkOpen();
		return getAllOfType(getEClass(packageName, className), query);
	}

	public IfcModelInterface getAllOfType(IfcModelInterface model,
			String packageName, String className, QueryInterface query)
			throws BimserverDatabaseException {
		checkOpen();
		return getAllOfType(model, getEClass(packageName, className), query);
	}

	public short getCid(EClass eClass) throws BimserverDatabaseException {
		Short cidOfEClass = database.getCidOfEClass(eClass);
		if (cidOfEClass == null) {
			throw new BimserverDatabaseException("EClass " + eClass.getName()
					+ " not registered");
		}
		return cidOfEClass;
	}

	public short getCidForClassName(String packageName, String className)
			throws BimserverDatabaseException {
		return database.getCidOfEClass(getEClass(packageName, className));
	}

	public short getCidOfEClass(EClass eClass) {
		return database.getCidOfEClass(eClass);
	}

	public Collection<EClass> getClasses() {
		return database.getClasses();
	}

	public List<String> getClassList() {
		return database.getAvailableClasses();
	}

	public int getCount(EClass eClass, IfcModelInterface model, int pid, int rid)
			throws BimserverDatabaseException {
		checkOpen();
		int count = 0;
		SearchingRecordIterator recordIterator = database
				.getKeyValueStore()
				.getRecordIterator(
						eClass.getEPackage().getName() + "_" + eClass.getName(),
						BinUtils.intToByteArray(pid),
						BinUtils.intToByteArray(pid), this);
		try {
			Record record = recordIterator.next();
			ByteBuffer nextKeyStart = ByteBuffer.allocate(12);
			byte[] nullReference = new byte[] { -1 };
			while (record != null) {
				reads++;
				ByteBuffer keyBuffer = ByteBuffer.wrap(record.getKey());
				int keyPid = keyBuffer.getInt();
				long oid = keyBuffer.getLong();
				int keyRid = -keyBuffer.getInt();
				int map = getCount(model, pid, rid, keyPid, keyRid);
				if (map == 1) {
					if (!Arrays.equals(record.getValue(), nullReference)) {
						count++;
					}
					nextKeyStart.position(0);
					nextKeyStart.putInt(pid);
					nextKeyStart.putLong(oid + 1);
					record = recordIterator.next(nextKeyStart.array());
				} else {
					record = recordIterator.next();
				}
			}
		} finally {
			recordIterator.close();
		}
		return count;
	}

	private int getCount(IfcModelInterface model, int pid, int rid, int keyPid,
			int keyRid) {
		if (keyPid == pid) {
			if (keyRid <= rid) {
				return 1;
			} else {
				return -1;
			}
		} else {
			return 0;
		}
	}

	public Date getCreatedDate() {
		return database.getCreated();
	}

	public DatabaseInformation getDatabaseInformation()
			throws BimserverDatabaseException {
		DatabaseInformation databaseInformation = StoreFactory.eINSTANCE
				.createDatabaseInformation();
		databaseInformation.setNumberOfProjects(getObjectCount(Project.class,
				Query.getDefault()));
		databaseInformation.setNumberOfUsers(getObjectCount(User.class,
				Query.getDefault()));
		databaseInformation.setNumberOfCheckouts(getObjectCount(Checkout.class,
				Query.getDefault()));
		databaseInformation.setNumberOfRevisions(getObjectCount(
				ConcreteRevision.class, Query.getDefault()));
		// databaseInformation.setType(database.getKeyValueStore().getType());
		databaseInformation.setCreated(database.getCreated());
		// databaseInformation.setDatabaseSizeInBytes(database.getKeyValueStore().getDatabaseSizeInBytes());
		databaseInformation.setSchemaVersion(database.getRegistry().readInt(
				Database.SCHEMA_VERSION, this));
		/*
		 * String stats = database.getKeyValueStore().getStats(); Scanner
		 * scanner = new Scanner(stats); try { DatabaseInformationCategory
		 * category =
		 * StoreFactory.eINSTANCE.createDatabaseInformationCategory(); while
		 * (scanner.hasNextLine()) { String line = scanner.nextLine(); if
		 * (line.contains("=")) { DatabaseInformationItem item =
		 * StoreFactory.eINSTANCE.createDatabaseInformationItem();
		 * category.getItems().add(item); item.setKey(line.substring(0,
		 * line.indexOf("="))); item.setValue(line.substring(line.indexOf("=") +
		 * 1)); } else { category =
		 * StoreFactory.eINSTANCE.createDatabaseInformationCategory();
		 * category.setTitle(line);
		 * databaseInformation.getCategories().add(category); } } } finally {
		 * scanner.close(); }
		 */
		// databaseInformation.setLocation(database.getKeyValueStore().getLocation());
		return databaseInformation;
	}

	public EClass getEClass(short cid) {
		return database.getEClassForCid(cid);
	}

	public EClass getEClass(String packageName, String className)
			throws BimserverDatabaseException {
		return database.getEClass(packageName, className);
	}

	private int getExactSize(IdEObject idEObject) {
		int size = 0;

		size += 1; // Length of unsetted bytes
		int bits = 0;

		for (EStructuralFeature eStructuralFeature : idEObject.eClass()
				.getEAllStructuralFeatures()) {
			bits++;
			if (!useUnsetBit(eStructuralFeature, idEObject)) {
				Object val = idEObject.eGet(eStructuralFeature);
				if (eStructuralFeature instanceof EAttribute) {
					EAttribute eAttribute = (EAttribute) eStructuralFeature;
					if (eAttribute.isMany()) {
						size += 4;
						for (Object v : ((List<?>) val)) {
							size += getPrimitiveSize(
									eAttribute.getEAttributeType(), v);
						}
					} else {
						size += getPrimitiveSize(
								eAttribute.getEAttributeType(), val);
					}
				} else if (eStructuralFeature instanceof EReference) {
					EReference eReference = (EReference) eStructuralFeature;
					if (eReference.isMany()) {
						size += 4;
						for (Object v : ((List<?>) val)) {
							size += getWrappedValueSize(v);
						}
					} else {
						if (val == null) {
							size += 2;
						} else {
							size += getWrappedValueSize(val);
						}
					}
				}
			}
		}

		size += (int) Math.ceil(bits / 8.0);

		return size;
	}

	private enum GetResult {
		STOP, CONTINUE_WITH_NEXT_RECORD, CONTINUE_WITH_NEXT_OID,
	}

	private GetResult getMap(EClass originalQueryClass, EClass eClass,
			IfcModelInterface model, ByteBuffer buffer, int keyPid,
			long keyOid, int keyRid, QueryInterface query, TodoList todoList)
			throws BimserverDatabaseException {
		checkOpen();
		if (keyPid == query.getPid()) {
			if (keyRid <= query.getRid() && keyRid >= query.getStopRid()) {
				RecordIdentifier recordIdentifier = new RecordIdentifier(
						query.getPid(), keyOid, keyRid);
				IdEObject cachedObject = objectCache.get(recordIdentifier);
				if (cachedObject != null) {
					cachedObject.load();
					if (!model.contains(keyOid)
							&& cachedObject.eClass().getEAnnotation("wrapped") == null) {
						try {
							model.addAllowMultiModel(keyOid, cachedObject);
						} catch (IfcModelInterfaceException e) {
							throw new BimserverDatabaseException(e);
						}
					}
					return GetResult.CONTINUE_WITH_NEXT_OID;
				} else {
					IdEObject object = null;
					if (model.contains(keyOid)) {
						object = model.get(keyOid);
					} else {
						if (buffer.capacity() == 1 && buffer.get(0) == -1) {
							buffer.position(buffer.position() + 1);
							return GetResult.CONTINUE_WITH_NEXT_OID;
							// deleted entity
						} else {
							object = convertByteArrayToObject(
									originalQueryClass, eClass, keyOid, buffer,
									model, keyRid, query, todoList);
						}
					}
					if (object != null) {
						objectCache.put(recordIdentifier, object);
						return GetResult.CONTINUE_WITH_NEXT_OID;
					}
				}
			} else {
				return GetResult.CONTINUE_WITH_NEXT_RECORD;
			}
		} else {
			return GetResult.STOP;
		}
		return GetResult.STOP;
	}

	public void getMap(EClass eClass, IfcModelInterface ifcModel,
			QueryInterface query, TodoList todoList)
			throws BimserverDatabaseException {
		SearchingRecordIterator recordIterator = database
				.getKeyValueStore()
				.getRecordIterator(
						eClass.getEPackage().getName() + "_" + eClass.getName(),
						BinUtils.intToByteArray(query.getPid()),
						BinUtils.intToByteArray(query.getPid()), this);
		checkOpen();
		try {
			Record record = recordIterator.next();
			ByteBuffer nextKeyStart = ByteBuffer.allocate(12);
			while (record != null) {
				if (Thread.currentThread().isInterrupted()) {
					throw new BimserverThreadInterruptedException(
							"Thread interrupted");
				}
				reads++;
				ByteBuffer keyBuffer = ByteBuffer.wrap(record.getKey());
				int keyPid = keyBuffer.getInt();
				long keyOid = keyBuffer.getLong();
				int keyRid = -keyBuffer.getInt();
			LOGGER.debug("Acmood = " + eClass.getEPackage().getName() + "_" + eClass.getName() + "pid = " + keyPid + ", Oid = " + keyOid + ", Rid = " + keyRid);
				ByteBuffer valueBuffer = ByteBuffer.wrap(record.getValue());
				GetResult map = getMap(eClass, eClass, ifcModel, valueBuffer,
						keyPid, keyOid, keyRid, query, todoList);
				if (map == GetResult.CONTINUE_WITH_NEXT_OID) {
					nextKeyStart.position(0);
					nextKeyStart.putInt(query.getPid());
					nextKeyStart.putLong(keyOid + 1);
					record = recordIterator.next(nextKeyStart.array());
				} else {
					record = recordIterator.next();
				}
			}
		} finally {
			recordIterator.close();
		}
	}

	public void getMap(IfcModelInterface ifcModel, QueryInterface query)
			throws BimserverDatabaseException {
		checkOpen();
		TodoList todoList = new TodoList();
		for (EClass eClass : database.getClasses()) {
			if (Thread.currentThread().isInterrupted()) {
				throw new BimserverDatabaseException("Thread interrupted");
			}
			if (eClass.getEAnnotation("nolazyload") == null
					&& eClass.getEAnnotation("nodatabase") == null) {
				if (query.shouldIncludeClass(eClass)) {
					getMap(eClass, ifcModel, query, todoList);
				}
			}
		}
		processTodoList(ifcModel, todoList, query);
	}

	public IfcModelInterface getMapWithObjectIdentifiers(
			IfcModelInterface model, Set<ObjectIdentifier> oids,
			QueryInterface query) throws BimserverDatabaseException {
		checkOpen();
		for (ObjectIdentifier objectIdentifier : oids) {
			getMapWithOid(query, objectIdentifier.getCid(),
					objectIdentifier.getOid(), model);
		}
		return model;
	}

	public IfcModelInterface getMapWithOid(QueryInterface query, short cid,
			long oid, IfcModelInterface model)
			throws BimserverDatabaseException {
		checkOpen();
		EClass eClass = database.getEClassForCid(cid);
		if (eClass == null) {
			return model;
		}
		// TODO check why clearCache??
		// objectCache.clear();

		TodoList todoList = new TodoList();
		ByteBuffer mustStartWith = createKeyBuffer(query.getPid(), oid);
		ByteBuffer key = createKeyBuffer(query.getPid(), oid,
				-query.getStopRid());
		SearchingRecordIterator recordIterator = database
				.getKeyValueStore()
				.getRecordIterator(
						eClass.getEPackage().getName() + "_" + eClass.getName(),
						mustStartWith.array(), key.array(), this);
		checkOpen();
		try {
			Record record = recordIterator.next();
			ByteBuffer nextKeyStart = ByteBuffer.allocate(12);
			while (record != null) {
				reads++;
				ByteBuffer keyBuffer = ByteBuffer.wrap(record.getKey());
				int keyPid = keyBuffer.getInt();
				long keyOid = keyBuffer.getLong();
				int keyRid = -keyBuffer.getInt();
				ByteBuffer valueBuffer = ByteBuffer.wrap(record.getValue());
				GetResult map = getMap(eClass, eClass, model, valueBuffer,
						keyPid, keyOid, keyRid, query, todoList);
				if (map == GetResult.CONTINUE_WITH_NEXT_OID) {
					nextKeyStart.position(0);
					nextKeyStart.putInt(query.getPid());
					nextKeyStart.putLong(keyOid + 1);
					record = recordIterator.next(nextKeyStart.array());
				} else {
					record = recordIterator.next();
				}
			}
		} finally {
			recordIterator.close();
		}
		reads++;
		processTodoList(model, todoList, query);
		return model;
	}

	// @ch ��������б�
	private void processTodoList(IfcModelInterface model, TodoList todoList,
			QueryInterface query) throws BimserverDatabaseException {
		IdEObject idEObject = todoList.poll();
		while (idEObject != null) {
			IdEObject result = get(model, idEObject, idEObject.getOid(), query,
					todoList);
			if (result == null) {
				throw new BimserverDatabaseException("Object not found: "
						+ query.getPid() + " " + query.getRid() + " "
						+ idEObject.getOid() + " "
						+ idEObject.eClass().getName());
			}
			if (!model.contains(result.getOid())) {
				try {
					model.addAllowMultiModel(result.getOid(), result);
				} catch (IfcModelInterfaceException e) {
					throw new BimserverDatabaseException(e);
				}
			}
			idEObject = todoList.poll();
		}
	}

	public void getMapWithOids(IfcModelInterface model, Set<Long> oids,
			QueryInterface query) throws BimserverDatabaseException {
		checkOpen();
		for (Long oid : oids) {
			EClass eClass = getEClassForOid(oid);
			if (eClass != null) {
				getMapWithOid(query, database.getCidOfEClass(eClass), oid,
						model);
			} else {
				throw new BimserverDatabaseException("No class found for oid "
						+ oid);
			}
		}
	}

	public MetaDataManager getMetaDataManager() {
		return database.getMetaDataManager();
	}

	private int getObjectCount(Class<? extends IdEObject> clazz,
			QueryInterface query) throws BimserverDatabaseException {
		Condition condition = new IsOfTypeCondition(
				(EClass) StorePackage.eINSTANCE.getEClassifier(clazz
						.getSimpleName()));
		return query(condition, clazz, query).size();
	}

	public ObjectIdentifier getOidOfGuid(String schema, String guid, int pid,
			int rid) throws BimserverDatabaseException {
		for (EClass eClass : getMetaDataManager().getPackageMetaData(schema)
				.getAllSubClasses(Ifc2x3tc1Package.eINSTANCE.getIfcRoot())) {
			RecordIterator recordIterator = database.getKeyValueStore()
					.getRecordIterator(
							eClass.getEPackage().getName() + "_"
									+ eClass.getName(),
							BinUtils.intToByteArray(pid),
							BinUtils.intToByteArray(pid), this);
			try {
				Record record = recordIterator.next();
				while (record != null) {
					reads++;
					ByteBuffer buffer = ByteBuffer.wrap(record.getKey());
					int pidOfRecord = buffer.getInt();
					long oid = buffer.getLong();
					int ridOfRecord = -buffer.getInt();
					if (ridOfRecord == rid && pid == pidOfRecord) {
						ByteBuffer value = ByteBuffer.wrap(record.getValue());

						// Skip the unsettable part
						byte unsettablesSize = value.get();
						value.position(value.position() + unsettablesSize);

						if (value.capacity() > 1) {
							int stringLength = value.getInt();
							if (stringLength == -1) {
								return null;
							} else {
								String s = BinUtils.readString(value,
										stringLength);
								if (s.equals(guid)) {
									return new ObjectIdentifier(oid,
											getCid(eClass));
								}
							}
						}
					}
					record = recordIterator.next();
				}
			} finally {
				recordIterator.close();
			}
		}
		return null;
	}

	public Set<ObjectIdentifier> getOidsOfName(String schema, String name,
			int pid, int rid) throws BimserverDatabaseException,
			MetaDataException {
		Set<ObjectIdentifier> result = new HashSet<ObjectIdentifier>();
		for (EClass eClass : getMetaDataManager().getPackageMetaData(schema)
				.getAllSubClasses(Ifc2x3tc1Package.eINSTANCE.getIfcRoot())) {
			RecordIterator recordIterator = database.getKeyValueStore()
					.getRecordIterator(
							eClass.getEPackage().getName() + "_"
									+ eClass.getName(),
							BinUtils.intToByteArray(pid),
							BinUtils.intToByteArray(pid), this);
			try {
				Record record = recordIterator.next();
				while (record != null) {
					reads++;
					ByteBuffer buffer = ByteBuffer.wrap(record.getKey());
					int pidOfRecord = buffer.getInt();
					long oid = buffer.getLong();
					int ridOfRecord = -buffer.getInt();
					if (ridOfRecord == rid && pid == pidOfRecord) {
						ByteBuffer value = ByteBuffer.wrap(record.getValue());

						// Skip the unsettable part
						byte unsettablesSize = value.get();
						value.position(value.position() + unsettablesSize);

						if (value.capacity() > 1) {
							int stringLength = value.getInt();
							if (stringLength == -1) {
								return null;
							} else {
								BinUtils.readString(value, stringLength); // GUID
								if (value.getShort() != -1) { // CID of
																// OwnerHistory
									value.getLong(); // OID of OwnerHistory
								}
								stringLength = value.getInt();
								if (stringLength != -1) {
									String foundName = BinUtils.readString(
											value, stringLength);
									if (name.equals(foundName)) {
										result.add(new ObjectIdentifier(oid,
												getCid(eClass)));
									}
								}
							}
						}
					}
					record = recordIterator.next();
				}
			} finally {
				recordIterator.close();
			}
		}
		return result;
	}

	private int getPrimitiveSize(EDataType eDataType, Object val) {
		if (eDataType == ECORE_PACKAGE.getEInt()
				|| eDataType == ECORE_PACKAGE.getEIntegerObject()) {
			return 4;
		} else if (eDataType == ECORE_PACKAGE.getEFloat()
				|| eDataType == ECORE_PACKAGE.getEFloatObject()) {
			return 4;
		} else if (eDataType == ECORE_PACKAGE.getEBoolean()
				|| eDataType == ECORE_PACKAGE.getEBooleanObject()) {
			return 1;
		} else if (eDataType == ECORE_PACKAGE.getEDate()) {
			return 8;
		} else if (eDataType == ECORE_PACKAGE.getELong()
				|| eDataType == ECORE_PACKAGE.getELongObject()) {
			return 8;
		} else if (eDataType == ECORE_PACKAGE.getEDouble()
				|| eDataType == ECORE_PACKAGE.getEDoubleObject()) {
			return 8;
		} else if (eDataType == ECORE_PACKAGE.getEString()) {
			if (val != null) {
				return 4 + ((String) val).getBytes(Charsets.UTF_8).length;
			}
			return 4;
		} else if (eDataType == ECORE_PACKAGE.getEByteArray()) {
			if (val != null) {
				return 4 + ((byte[]) val).length;
			}
			return 4;
		} else if (eDataType instanceof EEnum) {
			return 4;
		}
		throw new RuntimeException("Unimplemented: " + eDataType);
	}

	private int getWrappedValueSize(Object val) {
		if (val == null) {
			return 2;
		}
		if (val instanceof EObject) {
			EObject eObject = (EObject) val;
			int refSize = 10;
			if (eObject.eClass().getEAnnotation("wrapped") != null) {
				IdEObject wrappedValue = (IdEObject) val;
				EStructuralFeature wrappedValueFeature = wrappedValue.eClass()
						.getEStructuralFeature("wrappedValue");
				Object wrappedVal = eObject.eGet(wrappedValueFeature);
				refSize = 2 + getPrimitiveSize(
						(EDataType) wrappedValueFeature.getEType(), wrappedVal);
			}
			return refSize;
		}
		return 10;
	}

	public boolean perRecordVersioning(IdEObject idEObject) {
		return perRecordVersioning(idEObject.eClass());
	}

	public boolean perRecordVersioning(EClass eClass) {
		return eClass.getEPackage() != Ifc2x3tc1Package.eINSTANCE;
	}

	public IfcModelInterface createModel(PackageMetaData packageMetaData,
			Map<Integer, Long> pidRoidMap) {
		return new IfcModel(packageMetaData, pidRoidMap);
	}

	public IfcModelInterface createModel(QueryInterface queryInterface) {
		HashMap<Integer, Long> map = new HashMap<Integer, Long>();
		map.put(queryInterface.getPid(), queryInterface.getRoid());
		return new IfcModel(queryInterface.getPackageMetaData(), map);
	}

	@SuppressWarnings("unused")
	public IdEObject lazyLoad(IdEObject idEObject)
			throws BimserverDatabaseException {
		if (DEVELOPER_DEBUG) {
			LOGGER.info("Lazy loading " + idEObject.eClass().getName() + " "
					+ idEObject.getOid());
		}
		IfcModelInterface model = ((IdEObjectImpl) idEObject).getModel();
		if (model == null) {
			Map<Integer, Long> pidToRoid = new HashMap<Integer, Long>();
			model = createModel(
					getMetaDataManager().getPackageMetaData(
							idEObject.eClass().getEPackage().getName()),
					pidToRoid);
		}
		idEObject = get(model, idEObject, idEObject.getOid(),
				((IdEObjectImpl) idEObject).getQueryInterface(), new TodoList());
		if (idEObject != null) {
			if (DEVELOPER_DEBUG && idEObject.getRid() > 100000
					|| idEObject.getRid() < -100000) {
				LOGGER.debug("Improbable rid " + idEObject.getRid() + " - "
						+ idEObject);
			}
		}
		return idEObject;
	}

	@Override
	public void load(IdEObject idEObject) {
		try {
			lazyLoad(idEObject);
		} catch (BimserverLockConflictException e) {
			throw new UncheckedBimserverLockConflictException(e);
		} catch (BimserverDatabaseException e) {
			throw new UncheckedBimserverDatabaseException(e);
		}
	}

	public Long newOid(EClass eClass) {
		return database.newOid(eClass);
	}

	public int newPid() {
		return database.newPid();
	}

	public <T extends IdEObject> Map<Long, T> query(Condition condition,
			Class<T> clazz, QueryInterface query)
			throws BimserverDatabaseException {
		IfcModelInterface model = createModel(query);
		return query(model, condition, clazz, query);
	}

	public <T extends IdEObject> Map<Long, T> query(IfcModelInterface model,
			Condition condition, Class<T> clazz, QueryInterface query)
			throws BimserverDatabaseException {
		Map<Long, T> map = new HashMap<Long, T>();
		Set<EClass> eClasses = new HashSet<EClass>();
		condition.getEClassRequirements(eClasses);
		TodoList todoList = new TodoList();
		for (EClass eClass : eClasses) {
			getMap(eClass, model, query, todoList);
			for (Long oid : model.keySet()) {
				IdEObject object = model.get(oid);
				if (clazz.isInstance(object)) {
					if (condition.matches(object)) {
						map.put(oid, clazz.cast(object));
					}
				}
			}
		}
		processTodoList(model, todoList, query);
		return map;
	}

	public <T extends IdEObject> T querySingle(Condition condition,
			Class<T> clazz, QueryInterface query)
			throws BimserverDatabaseException {
		checkOpen();
		Collection<T> values = query(condition, clazz, query).values();
		if (values.size() == 0) {//
			return null;
		}
		return values.iterator().next();
	}

	private Object readPrimitiveValue(EClassifier classifier, ByteBuffer buffer) {
		if (classifier == ECORE_PACKAGE.getEString()) {
			int length = buffer.getInt();
			if (length != -1) {
				return BinUtils.readString(buffer, length);
			} else {
				return null;
			}
		} else if (classifier == ECORE_PACKAGE.getEInt()
				|| classifier == ECORE_PACKAGE.getEIntegerObject()) {
			return buffer.getInt();
		} else if (classifier == ECORE_PACKAGE.getELong()
				|| classifier == ECORE_PACKAGE.getELongObject()) {
			return buffer.getLong();
		} else if (classifier == ECORE_PACKAGE.getEFloat()
				|| classifier == ECORE_PACKAGE.getEFloatObject()) {
			return buffer.getFloat();
		} else if (classifier == ECORE_PACKAGE.getEDouble()
				|| classifier == ECORE_PACKAGE.getEDoubleObject()) {
			return buffer.getDouble();
		} else if (classifier == ECORE_PACKAGE.getEBoolean()
				|| classifier == ECORE_PACKAGE.getEBooleanObject()) {
			return buffer.get() == 1;
		} else if (classifier == ECORE_PACKAGE.getEDate()) {
			long val = buffer.getLong();
			if (val == -1L) {
				return null;
			}
			return new Date(val);
		} else if (classifier == EcorePackage.eINSTANCE.getEByteArray()) {
			int size = buffer.getInt();
			byte[] result = new byte[size];
			buffer.get(result);
			return result;
		} else if (classifier == Ifc2x3tc1Package.eINSTANCE.getTristate()) {
			int ordinal = buffer.getInt();
			return Tristate.get(ordinal);
		} else if (classifier instanceof EEnum) {
			int ordinal = buffer.getInt();
			EEnum eEnum = (EEnum) classifier;
			return eEnum.getEEnumLiteral(ordinal).getInstance();
		} else {
			throw new RuntimeException("Unsupported type "
					+ classifier.getName());
		}
	}

	private void fakeRead(ByteBuffer buffer, EStructuralFeature feature) {
		boolean wrappedValue = feature.getEType().getEAnnotation("wrapped") != null;
		if (feature.isMany()) {
			if (feature.getEType() instanceof EEnum) {
			} else if (feature.getEType() instanceof EClass) {
				if (buffer.capacity() == 1 && buffer.get(0) == -1) {
					buffer.position(buffer.position() + 1);
				} else {
					int listSize = buffer.getInt();
					for (int i = 0; i < listSize; i++) {
						short cid = buffer.getShort();
						if (cid != -1) {
							if (wrappedValue) {
								EClass eClass = (EClass) feature.getEType();
								fakePrimitiveRead(
										eClass.getEStructuralFeature(
												"wrappedValue").getEType(),
										buffer);
							} else {
								buffer.position(buffer.position() + 8);
							}
						}
					}
				}
			} else if (feature.getEType() instanceof EDataType) {
				int listSize = buffer.getInt();
				for (int i = 0; i < listSize; i++) {
					fakePrimitiveRead(feature.getEType(), buffer);
				}
			}
		} else {
			if (feature.getEType() instanceof EEnum) {
				buffer.position(buffer.position() + 4);
			} else if (feature.getEType() instanceof EClass) {
				if (buffer.capacity() == 1 && buffer.get(0) == -1) {
					buffer.position(buffer.position() + 1);
				} else {
					short cid = buffer.getShort();
					if (wrappedValue) {
						fakePrimitiveRead(feature.getEType(), buffer);
					} else {
						if (cid != -1) {
							buffer.position(buffer.position() + 8);
						}
					}
				}
			} else if (feature.getEType() instanceof EDataType) {
				fakePrimitiveRead(feature.getEType(), buffer);
			}
		}
	}

	private void fakePrimitiveRead(EClassifier classifier, ByteBuffer buffer) {
		if (classifier == EcorePackage.eINSTANCE.getEString()) {
			short length = buffer.getShort();
			buffer.position(buffer.position() + length);
		} else if (classifier == EcorePackage.eINSTANCE.getEInt()) {
			buffer.position(buffer.position() + 4);
		} else if (classifier == EcorePackage.eINSTANCE.getELong()) {
			buffer.position(buffer.position() + 8);
		} else if (classifier == EcorePackage.eINSTANCE.getEFloat()) {
			buffer.position(buffer.position() + 4);
		} else if (classifier == EcorePackage.eINSTANCE.getEDouble()) {
			buffer.position(buffer.position() + 8);
		} else if (classifier == EcorePackage.eINSTANCE.getEBoolean()) {
			buffer.position(buffer.position() + 1);
		} else if (classifier == EcorePackage.eINSTANCE.getEDate()) {
			buffer.position(buffer.position() + 8);
		}
	}

	private IdEObject readReference(EClass originalQueryClass,
			ByteBuffer buffer, IfcModelInterface model, IdEObject object,
			EStructuralFeature feature, EClass eClass, QueryInterface query,
			TodoList todoList) throws BimserverDatabaseException {
		if (buffer.capacity() == 1 && buffer.get(0) == -1) {
			buffer.position(buffer.position() + 1);
			return null;
		}
		long oid = buffer.getLong();
		RecordIdentifier recordIdentifier = new RecordIdentifier(
				query.getPid(), oid, query.getRid());
		IdEObject foundInCache = objectCache.get(oid);
		if (foundInCache != null) {
			return foundInCache;
		}
		if (model.contains(oid)) {
			return model.get(oid);
		}
		IdEObjectImpl newObject = createInternal(eClass, query);
		newObject.setOid(oid);
		if (perRecordVersioning(newObject)) {
			newObject.setPid(Database.STORE_PROJECT_ID);
		} else {
			newObject.setPid(query.getPid());
		}
		newObject.setRid(query.getRid());
		objectCache.put(recordIdentifier, newObject);
		if (query.isDeep() && object.eClass().getEAnnotation("wrapped") == null) {
			if (feature.getEAnnotation("nolazyload") == null) {
				todoList.add(newObject);
			}
		} else {
			if (object.eClass().getEAnnotation("wrapped") == null) {
				try {
					model.addAllowMultiModel(oid, newObject);
				} catch (IfcModelInterfaceException e) {
					throw new BimserverDatabaseException(e);
				}
			}
		}
		return newObject;
	}

	private IdEObject readWrappedValue(EStructuralFeature feature,
			ByteBuffer buffer, EClass eClass, QueryInterface query) {
		EStructuralFeature eStructuralFeature = eClass
				.getEStructuralFeature("wrappedValue");
		Object primitiveValue = readPrimitiveValue(
				eStructuralFeature.getEType(), buffer);
		IdEObject eObject = createInternal(eClass, query);
		((IdEObjectImpl) eObject).setLoaded(); // We don't want to go lazy load
												// this
		eObject.eSet(eStructuralFeature, primitiveValue);
		return eObject;
	}

	public void store(Collection<? extends IdEObject> values)
			throws BimserverDatabaseException {
		checkOpen();
		store(values, Database.STORE_PROJECT_ID, Integer.MAX_VALUE);
	}

	public void store(Collection<? extends IdEObject> values, int pid, int rid)
			throws BimserverDatabaseException {
		checkOpen();
		for (IdEObject object : values) {
			store(object, pid, rid);
		}
	}

	public void store(IdEObject object, boolean deep)
			throws BimserverDatabaseException {
		checkOpen();
		Set<IdEObject> done = new HashSet<IdEObject>();
		storeDeep(object, done);
	}

	private void storeDeep(IdEObject object, Set<IdEObject> done)
			throws BimserverDatabaseException {
		if (object == null || done.contains(object)) {
			return;
		}
		done.add(object);
		store(object);
		for (EReference eReference : object.eClass().getEAllReferences()) {
			if (eReference.isMany()) {
				List<?> list = (List<?>) object.eGet(eReference);
				for (Object v : list) {
					storeDeep((IdEObject) v, done);
				}
			} else {
				IdEObject reference = (IdEObject) object.eGet(eReference);
				storeDeep(reference, done);
			}
		}
	}

	public long store(IdEObject object) throws BimserverDatabaseException {
		checkOpen();
		return store(object, Database.STORE_PROJECT_ID, Integer.MAX_VALUE);
	}

	public long store(IdEObject object, int pid, int rid)
			throws BimserverDatabaseException {// @ch set new pid,oid to objects
		checkOpen();
		if (!objectsToCommit.containsObject(object)
				&& !objectsToDelete.contains(object)) {
			objectCache.put(new RecordIdentifier(pid, object.getOid(), rid),
					object);
			boolean wrappedValue = object.eClass().getEAnnotation("wrapped") != null;
			if (!wrappedValue) {
				if (object.getOid() == -1) {
					long newOid = newOid(object.eClass());
					((IdEObjectImpl) object).setOid(newOid);
				}
				object.load();
				((IdEObjectImpl) object).setPid(pid);
				LOGGER.debug("Acmood rid = "+ object.getRid() + ", oid = " + object.getOid() + ", rid = " + rid);
				if (rid == Integer.MAX_VALUE) {
					((IdEObjectImpl) object).setRid(object.getRid() + 1);
				} else {
					((IdEObjectImpl) object).setRid(rid);
				}
				addToObjectsToCommit(object);
			}
		}
		return object.getOid();
	}

	public void removeFromCommit(IdEObject idEObject) {
		objectsToCommit.remove(idEObject);
	}

	private void writePrimitiveValue(EStructuralFeature feature, Object value,
			ByteBuffer buffer) throws BimserverDatabaseException {
		EClassifier type = feature.getEType();
		if (type == ECORE_PACKAGE.getEString()) {
			if (value == null) {
				buffer.putInt(-1);
			} else {
				String stringValue = (String) value;
				byte[] bytes = stringValue.getBytes(Charsets.UTF_8);
				if (bytes.length > Integer.MAX_VALUE) {
					throw new BimserverDatabaseException(
							"String value too long (max length is "
									+ Integer.MAX_VALUE + ")");
				}
				buffer.putInt(bytes.length);
				buffer.put(bytes);
			}
		} else if (type == ECORE_PACKAGE.getEInt()
				|| type == ECORE_PACKAGE.getEIntegerObject()) {
			if (value == null) {
				buffer.putInt(0);
			} else {
				buffer.putInt((Integer) value);
			}
		} else if (type == ECORE_PACKAGE.getEDouble()
				|| type == ECORE_PACKAGE.getEDoubleObject()) {
			if (value == null) {
				buffer.putDouble(0D);
			} else {
				buffer.putDouble((Double) value);
			}
		} else if (type == ECORE_PACKAGE.getEFloat()
				|| type == ECORE_PACKAGE.getEFloatObject()) {
			if (value == null) {
				buffer.putFloat(0F);
			} else {
				buffer.putFloat((Float) value);
			}
		} else if (type == ECORE_PACKAGE.getELong()
				|| type == ECORE_PACKAGE.getELongObject()) {
			if (value == null) {
				buffer.putLong(0L);
			} else {
				buffer.putLong((Long) value);
			}
		} else if (type == ECORE_PACKAGE.getEBoolean()
				|| type == ECORE_PACKAGE.getEBooleanObject()) {
			if (value == null) {
				buffer.put((byte) 0);
			} else {
				buffer.put(((Boolean) value) ? (byte) 1 : (byte) 0);
			}
		} else if (type == ECORE_PACKAGE.getEDate()) {
			if (value == null) {
				buffer.putLong(-1L);
			} else {
				buffer.putLong(((Date) value).getTime());
			}
		} else if (type == Ifc2x3tc1Package.eINSTANCE.getTristate()) {
			Enumerator eEnumLiteral = (Enumerator) value;
			buffer.putInt(eEnumLiteral.getValue());
		} else if (value instanceof Enumerator) {
			Enumerator eEnumLiteral = (Enumerator) value;
			buffer.putInt(eEnumLiteral.getValue());
		} else if (type == EcorePackage.eINSTANCE.getEByteArray()) {
			if (value == null) {
				buffer.putInt(0);
			} else {
				byte[] bytes = (byte[]) value;
				buffer.putInt(bytes.length);
				buffer.put(bytes);
			}
		} else {
			throw new RuntimeException("Unsupported type " + type.getName());
		}
	}

	private void writeReference(IdEObject object, Object value,
			ByteBuffer buffer, EStructuralFeature feature)
			throws BimserverDatabaseException {
		Short cid = database.getCidOfEClass(((EObject) value).eClass());
		buffer.putShort(cid);
		IdEObject idEObject = (IdEObject) value;
		if (idEObject.getOid() < 0) {
			throw new BimserverDatabaseException(
					"Writing a reference with oid " + idEObject.getOid()
							+ ", this is not supposed to happen, referenced: "
							+ idEObject.getOid() + " " + value + " from "
							+ object.getOid() + " " + object);
		}
		buffer.putLong(idEObject.getOid());
	}

	private void writeWrappedValue(int pid, int rid, Object value,
			ByteBuffer buffer) throws BimserverDatabaseException {
		IdEObject wrappedValue = (IdEObject) value;
		EStructuralFeature eStructuralFeature = wrappedValue.eClass()
				.getEStructuralFeature("wrappedValue");
		Short cid = database.getCidOfEClass(wrappedValue.eClass());
		buffer.putShort((short) -cid);
		writePrimitiveValue(eStructuralFeature,
				wrappedValue.eGet(eStructuralFeature), buffer);
		if (wrappedValue instanceof IfcGloballyUniqueId) {
			if (wrappedValue.getOid() == -1) {
				((IdEObjectImpl) wrappedValue)
						.setOid(newOid(Ifc2x3tc1Package.eINSTANCE
								.getIfcGloballyUniqueId()));
			}
			ByteBuffer valueBuffer = convertObjectToByteArray(wrappedValue,
					ByteBuffer.allocate(getExactSize(wrappedValue)));
			ByteBuffer keyBuffer = createKeyBuffer(pid, wrappedValue.getOid(),
					rid);
			try {
				EClass ifcGloballyUniqueIdEClass = Ifc2x3tc1Package.eINSTANCE
						.getIfcGloballyUniqueId();
				database.getKeyValueStore().storeNoOverwrite(
						ifcGloballyUniqueIdEClass.getEPackage().getName() + "_"
								+ ifcGloballyUniqueIdEClass.getName(),
						keyBuffer.array(), valueBuffer.array(), this);
				database.incrementCommittedWrites(1);
			} catch (BimserverLockConflictException e) {
				LOGGER.error("", e);
			}
		}
	}

	public Set<String> getAvailableClassesInRevision(QueryInterface query)
			throws BimserverDatabaseException {
		IfcModelInterface model = createModel(query);
		return getAvailableClassesInRevision(model, query);
	}

	public Set<String> getAvailableClassesInRevision(
			IfcModelInterface ifcModel, QueryInterface query)
			throws BimserverDatabaseException {
		checkOpen();
		try {
			getMap(ifcModel, query);
			Set<String> classes = new HashSet<String>();
			for (IdEObject idEObject : ifcModel.getValues()) {
				classes.add(idEObject.eClass().getName());
			}
			return classes;
		} catch (BimserverDatabaseException e) {
			LOGGER.error("", e);
		}
		return null;
	}

	public StackTraceElement[] getStackTrace() {
		return stackTrace;
	}

	@SuppressWarnings("unchecked")
	public <T> T create(EClass eClass, int pid, int rid)
			throws BimserverDatabaseException {
		checkOpen();
		IdEObject idEObject = createInternal(eClass, null);
		store(idEObject, pid, rid);
		return (T) idEObject;
	}

	@SuppressWarnings("unchecked")
	public <T extends IdEObject> T getSingle(EClass eClass, QueryInterface query)
			throws BimserverDatabaseException {
		IfcModelInterface model = createModel(query);
		List<T> all = getAllOfType(model, eClass, query).getAll(
				(Class<T>) eClass.getInstanceClass());
		if (all.size() > 0) {
			return all.get(0);
		}
		return null;
	}

	/**
	 * Only call this method when you are sure no other processes are
	 * altering/using the same data. Basically only when the server is starting
	 * 
	 * @throws BimserverDatabaseException
	 * @throws ServiceException
	 */
	public void commit() throws BimserverDatabaseException, ServiceException {
		commit(null);
	}

	@SuppressWarnings("unchecked")
	public <T extends IdEObject> T create(Class<T> clazz)
			throws BimserverDatabaseException {
		return (T) create(database.getEClass(clazz.getPackage().getName(),
				clazz.getSimpleName()));
	}

	public EObject create(EClass eClass) {
		// checkOpen();
		IdEObjectImpl idEObject = createInternal(eClass, null);
		try {
			store(idEObject, Database.STORE_PROJECT_ID, Integer.MAX_VALUE);
		} catch (BimserverDatabaseException e) {
			LOGGER.error("", e);
		}
		return idEObject;
	}

	public <T extends IdEObject> List<T> getAllOfType(EClass eClass,
			Class<T> clazz, QueryInterface query)
			throws BimserverDatabaseException {
		IfcModelInterface allOfType = getAllOfType(eClass.getEPackage()
				.getName(), eClass.getName(), query);
		return allOfType.getAllWithSubTypes(clazz);
	}

	public EClass getEClassForOid(long oid) {
		return database.getEClassForOid(oid);
	}
}
