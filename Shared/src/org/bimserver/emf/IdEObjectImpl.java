package org.bimserver.emf;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Internal.SettingDelegate;
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl.InternalSettingDelegateMany;
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl.InternalSettingDelegateSingleEObject;
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl.InternalSettingDelegateSingleEObjectUnsettable;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.jdt.core.dom.ThisExpression;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class IdEObjectImpl extends MinimalEObjectImpl implements IdEObject {

	public static enum State {
		NO_LAZY_LOADING, TO_BE_LOADED, LOADING, LOADED, OPPOSITE_SETTING
	}

	private long oid = -1;
	private int pid;
	private int rid;
	private int expressId = -1;
	private IfcModelInterface model;
	private State loadingState = State.NO_LAZY_LOADING;
	private QueryInterface queryInterface;
	private BimServerEStore bimServerEStore;
	private boolean useInverses = true;

	// @Override
	// public EStore eStore() {
	// if (this.eStore == null) {
	// this.eStore = new DefaultBimServerEStore();
	// }
	// return this.eStore;
	// }
	//
	// @Override
	// protected boolean eIsCaching() {
	// return false;
	// }

	@Override
	public long getOid() {
		return oid;
	}

	// @Override
	// protected EList<?> createList(EStructuralFeature eStructuralFeature) {
	// return (EList<?>) new SpecialList(this, eStructuralFeature);
	// }

	public void setOid(long oid) {
		this.oid = oid;
	}
	//@ch
	//这里是获取一个空间建构对象中的序列,并验证是否为空间结构
	public Object getContainedList(){
		Object eList = null;
		for (int i = 0; i < 100; i++) {
			try {
				if(this.dynamicGet(i).getClass().getSimpleName().equals("EObjectResolvingEList")){
					if(this.dynamicGet(i+1).getClass().getSimpleName().equals("IfcBuildingStoreyImpl")){
						eList= this.dynamicGet(i);
					}
				break;
				}
				else {
					continue;
				}
			} catch(Exception e) {
				continue;
			}
			
		}
		return eList;
	}
		//@ch
		//验证是否为空间结构序列
		public boolean validateSpaceContained(){
			boolean result=false;
			for (int i = 0; i < 100; i++) {
				try {
					if(this.dynamicGet(i).getClass().getSimpleName().equals("IfcBuildingStoreyImpl")){
							return true;
						}
					else {
						continue;
					}
				} catch(Exception e) {
					continue;
				}
				
			}
			return result;
		}
	@Override
	public Object dynamicGet(int dynamicFeatureID) {
		load();
		return super.dynamicGet(dynamicFeatureID);
	}

	@Override
	public void dynamicSet(int dynamicFeatureID, Object newValue) {
		super.dynamicSet(dynamicFeatureID, newValue);
	}

	public void useInverses(boolean useInverses) {
		this.useInverses = useInverses;
	}
	
	@Override
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		super.eSet(eFeature, newValue);//@ch 这里有次存的是Saving to database(1111.ifc)
	}

	protected EStructuralFeature.Internal.SettingDelegate eSettingDelegate(EStructuralFeature eFeature) {
		SettingDelegate eSettingDelegate = super.eSettingDelegate(eFeature);
		if (useInverses) {
			return eSettingDelegate;
		}
		if (eFeature instanceof EReference && ((EReference)eFeature).getEOpposite() != null) {
			if (eFeature.isMany()) {
				if (eFeature.isUnsettable()) {
					return new InternalSettingDelegateMany(InternalSettingDelegateMany.EOBJECT_UNSETTABLE, eFeature);
				} else {
					return new InternalSettingDelegateMany(InternalSettingDelegateMany.EOBJECT, eFeature);
				}
			} else {
				if (eFeature.isUnsettable()) {
					return new InternalSettingDelegateSingleEObjectUnsettable((EClass) eFeature.getEType(), eFeature);
				} else {
					return new InternalSettingDelegateSingleEObject((EClass) eFeature.getEType(), eFeature);
				}
			}
		} else {
			return eSettingDelegate;
		}
	}

	public void setModel(IfcModelInterface model) throws IfcModelInterfaceException {
		this.model = model;
	}

	@Override
	public int getPid() {
		return this.pid;
	}

	@Override
	public int getRid() {
		load();
		return this.rid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}
//@ch
	public void load() {
		if (loadingState == State.TO_BE_LOADED && oid != -1) {
			bimServerEStore.load(this);
		}
	}

	public void forceLoad() {
		if (loadingState != State.LOADED && loadingState != State.LOADING && oid != -1) {
			bimServerEStore.load(this);
		}
	}

	public void setLoaded() {
		setLoadingState(State.LOADED);
	}

	public IfcModelInterface getModel() {
		return model;
	}

	public boolean hasModel() {
		return getModel() != null;
	}

	public int getExpressId() {
		return expressId;
	}

	public void setExpressId(int expressId) {
		this.expressId = expressId;
	}

	public boolean isLoadedOrLoading() {
		return loadingState != State.TO_BE_LOADED;
	}

	public void setLoading() {
		setLoadingState(State.LOADING);
	}

	public void setQueryInterface(QueryInterface queryInterface) {
		this.queryInterface = queryInterface;
		if (queryInterface == null || queryInterface.isDeep()) {
			setLoadingState(State.NO_LAZY_LOADING);
		} else {
			setLoadingState(State.TO_BE_LOADED);
		}
	}

	public QueryInterface getQueryInterface() {
		return queryInterface;
	}

	public void remove() {
		((BimServerEStore) eStore()).remove(this);
	}

	public void setLoadingState(State state) {
		this.loadingState = state;
	}

	public State getLoadingState() {
		return loadingState;
	}
	//@ch test by ch
	public BimServerEStore getEStore(){	
		return this.bimServerEStore;
	}

	public void setBimserverEStore(BimServerEStore eStore) {
		this.bimServerEStore = eStore;
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		if (model != null) {
			model.set(this, eClass().getEStructuralFeature(featureID), newValue);
		}
		super.eSet(featureID, newValue);
	}
}