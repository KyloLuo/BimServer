package org.bimserver;

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

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.bimserver.database.DatabaseSession;
import org.bimserver.emf.BimServerEStore;
import org.bimserver.emf.IdEObject;
import org.bimserver.emf.IdEObjectImpl;
import org.bimserver.emf.IdEObjectImpl.State;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

public class ServerEStore implements BimServerEStore {

	private final Map<IdEObject, Map<EStructuralFeature, Object>> map = new HashMap<>();
	private final DatabaseSession databaseSession;

	public ServerEStore(DatabaseSession databaseSession) {
		this.databaseSession = databaseSession;
	}

	@Override
	public void load(IdEObject idEObject) {
		((IdEObjectImpl)idEObject).setLoadingState(State.LOADING);//@ch ����ǰת��״̬��loading
		databaseSession.load(idEObject);
		((IdEObjectImpl)idEObject).setLoadingState(State.LOADED);//@ch ���غ�ת��״̬��loaded
	}

	@Override
	public void remove(IdEObject object) {
	}
	
	@SuppressWarnings({ "unchecked" })
	protected EList<Object> getList(final IdEObject idEObject, EStructuralFeature eStructuralFeature) {
		Map<EStructuralFeature, Object> objectMap = getObjectMap(idEObject);
		EList<Object> result = (EList<Object>)objectMap.get(eStructuralFeature);
		if (result == null) {
			if (eStructuralFeature.isUnique()) {
				result = new UniqueEList<Object>(){
					private static final long serialVersionUID = -1331649607984463166L;

					@Override
					public int size() {
						((IdEObject)idEObject).load();
						return super.size();
					}
					
					@Override
					public boolean isEmpty() {
						((IdEObject)idEObject).load();
						return super.isEmpty();
					}
					
					@Override
					public Iterator<Object> iterator() {
						((IdEObject)idEObject).load();
						return super.iterator();
					}
				};
			} else {
				result = new BasicEList<Object>(){
					private static final long serialVersionUID = -2646843411311359243L;

					@Override
					public int size() {
						((IdEObject)idEObject).load();
						return super.size();
					}
					
					@Override
					public boolean isEmpty() {
						((IdEObject)idEObject).load();
						return super.isEmpty();
					}
					
					@Override
					public Iterator<Object> iterator() {
						((IdEObject)idEObject).load();
						return super.iterator();
					}
				};
			}
			objectMap.put(eStructuralFeature, result);
		}
		return result;
	}

	private Map<EStructuralFeature, Object> getObjectMap(final IdEObject idEObject) {
		Map<EStructuralFeature, Object> objectMap = map.get(idEObject);
		if (objectMap == null) {
			objectMap = new HashMap<EStructuralFeature, Object>();
			map.put(idEObject, objectMap);
		}
		return objectMap;
	}

	public Object get(InternalEObject eObject, EStructuralFeature feature, int index) {
		((IdEObject) eObject).load();
		if (index == NO_INDEX) {
			return getObjectMap((IdEObject) eObject).get(feature);
		} else {
			return getList((IdEObject) eObject, feature).get(index);
		}
	}

	public Object set(InternalEObject eObject, EStructuralFeature feature, int index, Object value) {
		((IdEObject) eObject).load();
		if (index == NO_INDEX) {
			return getObjectMap((IdEObject) eObject).put(feature, value);
		} else {
			List<Object> list = getList((IdEObject) eObject, feature);
			return list.set(index, value);
		}
	}

	public void add(InternalEObject eObject, EStructuralFeature feature, int index, Object value) {
		((IdEObject) eObject).load();
		try {
			getList((IdEObject) eObject, feature).add(index, value);
		} catch (Exception e) {
			// DO NOTHING
		}
	}

	public Object remove(InternalEObject eObject, EStructuralFeature feature, int index) {
		((IdEObject) eObject).load();
		return getList((IdEObject) eObject, feature).remove(index);
	}

	public Object move(InternalEObject eObject, EStructuralFeature feature, int targetIndex, int sourceIndex) {
		((IdEObject) eObject).load();
		return getList((IdEObject) eObject, feature).move(targetIndex, sourceIndex);
	}

	public void clear(InternalEObject eObject, EStructuralFeature feature) {
		((IdEObject) eObject).load();
		getObjectMap((IdEObject) eObject).put(feature, null);
	}

	public boolean isSet(InternalEObject eObject, EStructuralFeature feature) {
		((IdEObject) eObject).load();
		return getObjectMap((IdEObject) eObject).containsKey(feature);
	}

	public void unset(InternalEObject eObject, EStructuralFeature feature) {
		((IdEObject) eObject).load();
		getObjectMap((IdEObject) eObject).remove(feature);
	}

	public int size(InternalEObject eObject, EStructuralFeature feature) {
		((IdEObject) eObject).load();
		return getList((IdEObject) eObject, feature).size();
	}

	public int indexOf(InternalEObject eObject, EStructuralFeature feature, Object value) {
		((IdEObject) eObject).load();
		return getList((IdEObject) eObject, feature).indexOf(value);
	}

	public int lastIndexOf(InternalEObject eObject, EStructuralFeature feature, Object value) {
		((IdEObject) eObject).load();
		return getList((IdEObject) eObject, feature).lastIndexOf(value);
	}

	public Object[] toArray(InternalEObject eObject, EStructuralFeature feature) {
		((IdEObject) eObject).load();
		return getList((IdEObject) eObject, feature).toArray();
	}

	public <T> T[] toArray(InternalEObject eObject, EStructuralFeature feature, T[] array) {
		((IdEObject) eObject).load();
		return getList((IdEObject) eObject, feature).toArray(array);
	}

	public boolean isEmpty(InternalEObject eObject, EStructuralFeature feature) {
		((IdEObject) eObject).load();
		return getList((IdEObject) eObject, feature).isEmpty();
	}

	public boolean contains(InternalEObject eObject, EStructuralFeature feature, Object value) {
		((IdEObject) eObject).load();
		return getList((IdEObject) eObject, feature).contains(value);
	}

	public int hashCode(InternalEObject eObject, EStructuralFeature feature) {
		((IdEObject) eObject).load();
		return getList((IdEObject) eObject, feature).hashCode();
	}

	public InternalEObject getContainer(InternalEObject eObject) {
		return null;
	}

	public EStructuralFeature getContainingFeature(InternalEObject eObject) {
		throw new UnsupportedOperationException();
	}

	public EObject create(EClass eClass) {
		return null;
//		InternalEObject result = new EStoreEObjectImpl(eClass, this);
//		return result;
	}
}