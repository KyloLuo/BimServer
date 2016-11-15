package org.bimserver.webservices.impl;

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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.bimserver.database.BimserverDatabaseException;
import org.bimserver.database.DatabaseSession;
import org.bimserver.database.Query;
import org.bimserver.database.actions.AddDeserializerDatabaseAction;
import org.bimserver.database.actions.AddInternalServiceDatabaseAction;
import org.bimserver.database.actions.AddModelCompareDatabaseAction;
import org.bimserver.database.actions.AddModelMergerDatabaseAction;
import org.bimserver.database.actions.AddObjectIDMDatabaseAction;
import org.bimserver.database.actions.AddQueryEngineDatabaseAction;
import org.bimserver.database.actions.AddRenderEngineDatabaseAction;
import org.bimserver.database.actions.AddSerializerDatabaseAction;
import org.bimserver.database.actions.BimDatabaseAction;
import org.bimserver.database.actions.DeleteDeserializerDatabaseAction;
import org.bimserver.database.actions.DeleteInternalServiceDatabaseAction;
import org.bimserver.database.actions.DeleteModelCompareDatabaseAction;
import org.bimserver.database.actions.DeleteModelMergerDatabaseAction;
import org.bimserver.database.actions.DeleteObjectIDMDatabaseAction;
import org.bimserver.database.actions.DeleteQueryEngineDatabaseAction;
import org.bimserver.database.actions.DeleteRenderEngineDatabaseAction;
import org.bimserver.database.actions.DeleteSerializerDatabaseAction;
import org.bimserver.database.actions.GetByIdDatabaseAction;
import org.bimserver.database.actions.GetMessagingSerializerByPluginClassNameDatabaseAction;
import org.bimserver.database.actions.GetModelCompareByIdDatabaseAction;
import org.bimserver.database.actions.GetModelCompareByNameDatabaseAction;
import org.bimserver.database.actions.GetModelMergerByIdDatabaseAction;
import org.bimserver.database.actions.GetModelMergerByNameDatabaseAction;
import org.bimserver.database.actions.GetObjectIDMByIdDatabaseAction;
import org.bimserver.database.actions.GetObjectIDMByNameDatabaseAction;
import org.bimserver.database.actions.GetRenderEngineByIdDatabaseAction;
import org.bimserver.database.actions.GetRenderEngineByNameDatabaseAction;
import org.bimserver.database.actions.GetSerializerByPluginClassNameDatabaseAction;
import org.bimserver.database.actions.GetWebModuleByIdDatabaseAction;
import org.bimserver.database.actions.GetWebModuleByNameDatabaseAction;
import org.bimserver.database.actions.SetPluginSettingsDatabaseAction;
import org.bimserver.database.actions.SetUserSettingDatabaseAction;
import org.bimserver.database.actions.UpdateDatabaseAction;
import org.bimserver.database.actions.UpdateDeserializerDatabaseAction;
import org.bimserver.database.actions.UpdateModelCompareDatabaseAction;
import org.bimserver.database.actions.UpdateModelMergerDatabaseAction;
import org.bimserver.database.actions.UpdateObjectIDMDatabaseAction;
import org.bimserver.database.actions.UpdateQueryEngineDatabaseAction;
import org.bimserver.database.actions.UpdateRenderEngineDatabaseAction;
import org.bimserver.database.actions.UpdateSerializerDatabaseAction;
import org.bimserver.database.actions.UserSettingsSetter;
import org.bimserver.emf.IdEObject;
import org.bimserver.emf.Schema;
import org.bimserver.interfaces.objects.SDeserializerPluginConfiguration;
import org.bimserver.interfaces.objects.SDeserializerPluginDescriptor;
import org.bimserver.interfaces.objects.SInternalServicePluginConfiguration;
import org.bimserver.interfaces.objects.SMessagingSerializerPluginConfiguration;
import org.bimserver.interfaces.objects.SModelCheckerPluginDescriptor;
import org.bimserver.interfaces.objects.SModelComparePluginConfiguration;
import org.bimserver.interfaces.objects.SModelComparePluginDescriptor;
import org.bimserver.interfaces.objects.SModelMergerPluginConfiguration;
import org.bimserver.interfaces.objects.SModelMergerPluginDescriptor;
import org.bimserver.interfaces.objects.SObjectDefinition;
import org.bimserver.interfaces.objects.SObjectIDMPluginConfiguration;
import org.bimserver.interfaces.objects.SObjectIDMPluginDescriptor;
import org.bimserver.interfaces.objects.SObjectType;
import org.bimserver.interfaces.objects.SPluginDescriptor;
import org.bimserver.interfaces.objects.SQueryEnginePluginConfiguration;
import org.bimserver.interfaces.objects.SQueryEnginePluginDescriptor;
import org.bimserver.interfaces.objects.SRenderEnginePluginConfiguration;
import org.bimserver.interfaces.objects.SRenderEnginePluginDescriptor;
import org.bimserver.interfaces.objects.SSerializerPluginConfiguration;
import org.bimserver.interfaces.objects.SSerializerPluginDescriptor;
import org.bimserver.interfaces.objects.SServicePluginDescriptor;
import org.bimserver.interfaces.objects.SWebModulePluginConfiguration;
import org.bimserver.interfaces.objects.SWebModulePluginDescriptor;
import org.bimserver.models.store.ConcreteRevision;
import org.bimserver.models.store.DeserializerPluginConfiguration;
import org.bimserver.models.store.InternalServicePluginConfiguration;
import org.bimserver.models.store.ModelComparePluginConfiguration;
import org.bimserver.models.store.ModelMergerPluginConfiguration;
import org.bimserver.models.store.ObjectType;
import org.bimserver.models.store.PluginConfiguration;
import org.bimserver.models.store.PluginDescriptor;
import org.bimserver.models.store.Project;
import org.bimserver.models.store.QueryEnginePluginConfiguration;
import org.bimserver.models.store.RenderEnginePluginConfiguration;
import org.bimserver.models.store.Revision;
import org.bimserver.models.store.SerializerPluginConfiguration;
import org.bimserver.models.store.StorePackage;
import org.bimserver.models.store.UserSettings;
import org.bimserver.models.store.WebModulePluginConfiguration;
import org.bimserver.plugins.deserializers.DeserializerPlugin;
import org.bimserver.plugins.objectidms.ObjectIDMPlugin;
import org.bimserver.plugins.serializers.SerializerPlugin;
import org.bimserver.plugins.services.ServicePlugin;
import org.bimserver.schemaconverter.SchemaConverterFactory;
import org.bimserver.shared.exceptions.ServerException;
import org.bimserver.shared.exceptions.UserException;
import org.bimserver.shared.interfaces.PluginInterface;
import org.bimserver.webservices.SPluginConfigurationComparator;
import org.bimserver.webservices.ServiceMap;
import org.eclipse.emf.common.util.EList;

public class PluginServiceImpl extends GenericServiceImpl implements PluginInterface {
	public PluginServiceImpl(ServiceMap serviceMap) {
		super(serviceMap);
	}

	@Override
	public void addDeserializer(SDeserializerPluginConfiguration deserializer) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			DeserializerPluginConfiguration convert = getBimServer().getSConverter().convertFromSObject(deserializer, session);
			session.executeAndCommitAction(new AddDeserializerDatabaseAction(session, getInternalAccessMethod(), getAuthorization(), convert));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public void updateSerializer(SSerializerPluginConfiguration serializer) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			SerializerPluginConfiguration convert = getBimServer().getSConverter().convertFromSObject(serializer, session);
			session.executeAndCommitAction(new UpdateSerializerDatabaseAction(session, getInternalAccessMethod(), convert));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public void updateDeserializer(SDeserializerPluginConfiguration deserializer) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			DeserializerPluginConfiguration convert = getBimServer().getSConverter().convertFromSObject(deserializer, session);
			session.executeAndCommitAction(new UpdateDeserializerDatabaseAction(session, getInternalAccessMethod(), convert));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public List<SObjectIDMPluginConfiguration> getAllObjectIDMs(Boolean onlyEnabled) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			UserSettings userSettings = getUserSettings(session);
			List<SObjectIDMPluginConfiguration> objectIdms = getBimServer().getSConverter().convertToSListObjectIDMPluginConfiguration(userSettings.getObjectIDMs());
			Collections.sort(objectIdms, new SPluginConfigurationComparator());
			return objectIdms;
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public void addObjectIDM(SObjectIDMPluginConfiguration objectIDM) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			session.executeAndCommitAction(new AddObjectIDMDatabaseAction(session, getInternalAccessMethod(), getAuthorization(), getBimServer().getSConverter().convertFromSObject(objectIDM, session)));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public void updateObjectIDM(SObjectIDMPluginConfiguration objectIDM) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			session.executeAndCommitAction(new UpdateObjectIDMDatabaseAction(session, getInternalAccessMethod(), getBimServer().getSConverter().convertFromSObject(objectIDM, session)));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public SObjectIDMPluginConfiguration getObjectIDMById(Long oid) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			return getBimServer().getSConverter().convertToSObject(session.executeAndCommitAction(new GetObjectIDMByIdDatabaseAction(session, getInternalAccessMethod(), oid)));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public List<SSerializerPluginDescriptor> getAllSerializerPluginDescriptors() throws UserException {
		requireRealUserAuthentication();
		return getBimServer().getSerializerFactory().getAllSerializerPluginDescriptors();
	}

	@Override
	public List<SWebModulePluginDescriptor> getAllWebModulePluginDescriptors() throws UserException {
		requireRealUserAuthentication();
		return getBimServer().getSerializerFactory().getAllWebModulePluginDescriptors();
	}
	
	@Override
	public void deleteObjectIDM(Long ifid) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			BimDatabaseAction<Void> action = new DeleteObjectIDMDatabaseAction(session, getInternalAccessMethod(), ifid);
			session.executeAndCommitAction(action);
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public void deleteSerializer(Long sid) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			BimDatabaseAction<Void> action = new DeleteSerializerDatabaseAction(session, getInternalAccessMethod(), sid);
			session.executeAndCommitAction(action);
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public void deleteDeserializer(Long sid) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			BimDatabaseAction<Void> action = new DeleteDeserializerDatabaseAction(session, getInternalAccessMethod(), sid);
			session.executeAndCommitAction(action);
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public SWebModulePluginConfiguration getWebModuleByName(String name) throws ServerException, UserException {
		requireAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			return getBimServer().getSConverter().convertToSObject(session.executeAndCommitAction(new GetWebModuleByNameDatabaseAction(session, getInternalAccessMethod(), name)));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public SObjectIDMPluginConfiguration getObjectIDMByName(String ObjectIDMName) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			return getBimServer().getSConverter().convertToSObject(session.executeAndCommitAction(new GetObjectIDMByNameDatabaseAction(session, getInternalAccessMethod(), ObjectIDMName)));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
		return null;
	}
	
	@Override
	public List<SDeserializerPluginDescriptor> getAllDeserializerPluginDescriptors() throws ServerException, UserException {
		requireRealUserAuthentication();
		List<SDeserializerPluginDescriptor> descriptors = new ArrayList<SDeserializerPluginDescriptor>();
		for (DeserializerPlugin deserializerPlugin : getBimServer().getPluginManager().getAllDeserializerPlugins(true)) {
			SDeserializerPluginDescriptor descriptor = new SDeserializerPluginDescriptor();
			descriptor.setDefaultName(deserializerPlugin.getDefaultName());
			descriptor.setPluginClassName(deserializerPlugin.getClass().getName());
			descriptors.add(descriptor);
		}
		return descriptors;
	}
	
	@Override
	public List<SRenderEnginePluginDescriptor> getAllRenderEnginePluginDescriptors() throws ServerException, UserException {
		requireRealUserAuthentication();
		return getBimServer().getSerializerFactory().getAllRenderEnginePluginDescriptors();
	}

	@Override
	public List<SQueryEnginePluginDescriptor> getAllQueryEnginePluginDescriptors() throws ServerException, UserException {
		requireRealUserAuthentication();
		return getBimServer().getSerializerFactory().getAllQueryEnginePluginDescriptors();
	}

	@Override
	public List<SServicePluginDescriptor> getAllServicePluginDescriptors() throws ServerException, UserException {
		requireRealUserAuthentication();
		return getBimServer().getSerializerFactory().getAllServicePluginDescriptors();
	}

	@Override
	public List<SModelComparePluginDescriptor> getAllModelComparePluginDescriptors() throws ServerException, UserException {
		requireRealUserAuthentication();
		return getBimServer().getSerializerFactory().getAllModelComparePluginDescriptors();
	}

	@Override
	public List<SModelCheckerPluginDescriptor> getAllModelCheckerPluginDescriptors() throws ServerException, UserException {
		requireRealUserAuthentication();
		return getBimServer().getSerializerFactory().getAllModelCheckerPluginDescriptors();
	}

	@Override
	public List<SModelMergerPluginDescriptor> getAllModelMergerPluginDescriptors() throws ServerException, UserException {
		requireRealUserAuthentication();
		return getBimServer().getSerializerFactory().getAllModelMergerPluginDescriptors();
	}

	@Override
	public List<SRenderEnginePluginConfiguration> getAllRenderEngines(Boolean onlyEnabled) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			UserSettings userSettings = getUserSettings(session);
			List<SRenderEnginePluginConfiguration> renderEngines = getBimServer().getSConverter().convertToSListRenderEnginePluginConfiguration(userSettings.getRenderEngines());
			Collections.sort(renderEngines, new SPluginConfigurationComparator());
			return renderEngines;
		} catch (Exception e) {
			return handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public List<SQueryEnginePluginConfiguration> getAllQueryEngines(Boolean onlyEnabled) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			UserSettings userSettings = getUserSettings(session);
			List<SQueryEnginePluginConfiguration> queryEngines = getBimServer().getSConverter().convertToSListQueryEnginePluginConfiguration(userSettings.getQueryengines());
			Collections.sort(queryEngines, new SPluginConfigurationComparator());
			return queryEngines;
		} catch (Exception e) {
			return handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public List<SModelComparePluginConfiguration> getAllModelCompares(Boolean onlyEnabled) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			UserSettings userSettings = getUserSettings(session);
			List<SModelComparePluginConfiguration> modelCompares = getBimServer().getSConverter().convertToSListModelComparePluginConfiguration(userSettings.getModelcompares());
			Collections.sort(modelCompares, new SPluginConfigurationComparator());
			return modelCompares;
		} catch (Exception e) {
			return handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public List<SModelMergerPluginConfiguration> getAllModelMergers(Boolean onlyEnabled) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			UserSettings userSettings = getUserSettings(session);
			List<SModelMergerPluginConfiguration> modelMergers = getBimServer().getSConverter().convertToSListModelMergerPluginConfiguration(userSettings.getModelmergers());
			Collections.sort(modelMergers, new SPluginConfigurationComparator());
			return modelMergers;
		} catch (Exception e) {
			return handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public void updateRenderEngine(SRenderEnginePluginConfiguration renderEngine) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			RenderEnginePluginConfiguration convert = getBimServer().getSConverter().convertFromSObject(renderEngine, session);
			session.executeAndCommitAction(new UpdateRenderEngineDatabaseAction(session, getInternalAccessMethod(), convert));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public void updateQueryEngine(SQueryEnginePluginConfiguration queryEngine) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			QueryEnginePluginConfiguration convert = getBimServer().getSConverter().convertFromSObject(queryEngine, session);
			session.executeAndCommitAction(new UpdateQueryEngineDatabaseAction(session, getInternalAccessMethod(), convert));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public void updateModelCompare(SModelComparePluginConfiguration modelCompare) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			ModelComparePluginConfiguration convert = getBimServer().getSConverter().convertFromSObject(modelCompare, session);
			session.executeAndCommitAction(new UpdateModelCompareDatabaseAction(session, getInternalAccessMethod(), convert));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}
	
	@Override
	public void updateModelMerger(SModelMergerPluginConfiguration modelMerger) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			ModelMergerPluginConfiguration convert = getBimServer().getSConverter().convertFromSObject(modelMerger, session);
			session.executeAndCommitAction(new UpdateModelMergerDatabaseAction(session, getInternalAccessMethod(), convert));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public void deleteRenderEngine(Long iid) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			BimDatabaseAction<Void> action = new DeleteRenderEngineDatabaseAction(session, getInternalAccessMethod(), iid);
			session.executeAndCommitAction(action);
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public void deleteQueryEngine(Long iid) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			BimDatabaseAction<Void> action = new DeleteQueryEngineDatabaseAction(session, getInternalAccessMethod(), iid);
			session.executeAndCommitAction(action);
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}
	
	@Override
	public void deleteModelCompare(Long iid) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			BimDatabaseAction<Void> action = new DeleteModelCompareDatabaseAction(session, getInternalAccessMethod(), iid);
			session.executeAndCommitAction(action);
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public void deleteModelChecker(Long iid) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			BimDatabaseAction<Void> action = new DeleteModelCompareDatabaseAction(session, getInternalAccessMethod(), iid);
			session.executeAndCommitAction(action);
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public void deleteModelMerger(Long iid) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			BimDatabaseAction<Void> action = new DeleteModelMergerDatabaseAction(session, getInternalAccessMethod(), iid);
			session.executeAndCommitAction(action);
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public SRenderEnginePluginConfiguration getRenderEngineByName(String name) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			return getBimServer().getSConverter().convertToSObject(session.executeAndCommitAction(new GetRenderEngineByNameDatabaseAction(session, getInternalAccessMethod(), name)));
		} catch (Exception e) {
			return handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public SModelMergerPluginConfiguration getModelMergerById(Long oid) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			return getBimServer().getSConverter().convertToSObject(session.executeAndCommitAction(new GetModelMergerByIdDatabaseAction(session, getInternalAccessMethod(), oid)));
		} catch (Exception e) {
			return handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public SModelComparePluginConfiguration getModelCompareById(Long oid) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			return getBimServer().getSConverter().convertToSObject(session.executeAndCommitAction(new GetModelCompareByIdDatabaseAction(session, getInternalAccessMethod(), oid)));
		} catch (Exception e) {
			return handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public SModelComparePluginConfiguration getModelCompareByName(String name) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			return getBimServer().getSConverter().convertToSObject(session.executeAndCommitAction(new GetModelCompareByNameDatabaseAction(session, getInternalAccessMethod(), name)));
		} catch (Exception e) {
			return handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public SModelMergerPluginConfiguration getModelMergerByName(String name) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			return getBimServer().getSConverter().convertToSObject(session.executeAndCommitAction(new GetModelMergerByNameDatabaseAction(session, getInternalAccessMethod(), name)));
		} catch (Exception e) {
			return handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public SRenderEnginePluginConfiguration getRenderEngineById(Long oid) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			return getBimServer().getSConverter().convertToSObject(session.executeAndCommitAction(new GetRenderEngineByIdDatabaseAction(session, getInternalAccessMethod(), oid)));
		} catch (Exception e) {
			return handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public void addRenderEngine(SRenderEnginePluginConfiguration renderEngine) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			RenderEnginePluginConfiguration convert = getBimServer().getSConverter().convertFromSObject(renderEngine, session);
			session.executeAndCommitAction(new AddRenderEngineDatabaseAction(session, getInternalAccessMethod(), getAuthorization(), convert));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public void addQueryEngine(SQueryEnginePluginConfiguration queryEngine) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			QueryEnginePluginConfiguration convert = getBimServer().getSConverter().convertFromSObject(queryEngine, session);
			session.executeAndCommitAction(new AddQueryEngineDatabaseAction(session, getInternalAccessMethod(), getAuthorization(), convert));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public void addModelCompare(SModelComparePluginConfiguration modelCompare) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			ModelComparePluginConfiguration convert = getBimServer().getSConverter().convertFromSObject(modelCompare, session);
			session.executeAndCommitAction(new AddModelCompareDatabaseAction(session, getInternalAccessMethod(), getAuthorization(), convert));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public void addModelMerger(SModelMergerPluginConfiguration modelMerger) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			ModelMergerPluginConfiguration convert = getBimServer().getSConverter().convertFromSObject(modelMerger, session);
			session.executeAndCommitAction(new AddModelMergerDatabaseAction(session, getInternalAccessMethod(), getAuthorization(), convert));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}
	
	@Override
	public SObjectDefinition getPluginObjectDefinition(Long oid) throws ServerException, UserException {
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			PluginDescriptor pluginDescriptor = session.get(oid, Query.getDefault());
			if (pluginDescriptor == null) {
				throw new UserException("No PluginDescriptor found with oid " + oid);
			}
			return getBimServer().getSConverter().convertToSObject(getBimServer().getPluginManager().getPlugin(pluginDescriptor.getPluginClassName(), false).getSettingsDefinition());
		} catch (Exception e) {
			return handleException(e);
		} finally {
			session.close();
		}
	}
	
	@Override
	public void setPluginSettings(Long poid, SObjectType settings) throws ServerException, UserException {
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			ObjectType convertedSettings = getBimServer().getSConverter().convertFromSObject(settings, session);
			SetPluginSettingsDatabaseAction action = new SetPluginSettingsDatabaseAction(session, getInternalAccessMethod(), poid, convertedSettings);
			session.executeAndCommitAction(action);
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}

		session = getBimServer().getDatabase().createSession();
		try {
			PluginConfiguration pluginConfiguration = session.get(StorePackage.eINSTANCE.getPluginConfiguration(), poid, Query.getDefault());
			ServicePlugin servicePlugin = getBimServer().getPluginManager().getServicePlugin(pluginConfiguration.getPluginDescriptor().getPluginClassName(), true);
			SInternalServicePluginConfiguration sInternalService = (SInternalServicePluginConfiguration) getBimServer().getSConverter().convertToSObject(pluginConfiguration);
	
			servicePlugin.unregister(sInternalService);
			servicePlugin.register(getAuthorization().getUoid(), sInternalService, new org.bimserver.plugins.PluginConfiguration(settings));
		} catch (BimserverDatabaseException e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public List<SSerializerPluginConfiguration> getAllSerializers(Boolean onlyEnabled) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			UserSettings userSettings = getUserSettings(session);
			List<SSerializerPluginConfiguration> sSerializers = new ArrayList<SSerializerPluginConfiguration>();
			for (SerializerPluginConfiguration serializerPluginConfiguration : userSettings.getSerializers()) {
				if (!onlyEnabled || (serializerPluginConfiguration.getEnabled() && serializerPluginConfiguration.getPluginDescriptor().getEnabled())) {
					sSerializers.add(getBimServer().getSConverter().convertToSObject(serializerPluginConfiguration));
				}
			}
			Collections.sort(sSerializers, new SPluginConfigurationComparator());
			return sSerializers;
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
		return null;
	}
	
	@Override
	public List<SWebModulePluginConfiguration> getAllWebModules(Boolean onlyEnabled) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			EList<WebModulePluginConfiguration> webModules = getBimServer().getServerSettingsCache().getServerSettings().getWebModules();
			List<SWebModulePluginConfiguration> serializers = getBimServer().getSConverter().convertToSListWebModulePluginConfiguration(webModules);
			Collections.sort(serializers, new SPluginConfigurationComparator());
			return serializers;
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
		return null;
	}
	
	@Override
	public void addSerializer(SSerializerPluginConfiguration serializer) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			SerializerPluginConfiguration convert = getBimServer().getSConverter().convertFromSObject(serializer, session);
			session.executeAndCommitAction(new AddSerializerDatabaseAction(session, getInternalAccessMethod(), getAuthorization(), convert));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}
	
	public SRenderEnginePluginConfiguration getDefaultRenderEngine() throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			UserSettings settings = getUserSettings(session);
			return getBimServer().getSConverter().convertToSObject(settings.getDefaultRenderEngine());
		} catch (Exception e) {
			return handleException(e);
		} finally {
			session.close();
		}
	}

	public SQueryEnginePluginConfiguration getDefaultQueryEngine() throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			UserSettings settings = getUserSettings(session);
			return getBimServer().getSConverter().convertToSObject(settings.getDefaultQueryEngine());
		} catch (Exception e) {
			return handleException(e);
		} finally {
			session.close();
		}
	}

	public SModelComparePluginConfiguration getDefaultModelCompare() throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			UserSettings settings = getUserSettings(session);
			return getBimServer().getSConverter().convertToSObject(settings.getDefaultModelCompare());
		} catch (Exception e) {
			return handleException(e);
		} finally {
			session.close();
		}
	}

	public SModelMergerPluginConfiguration getDefaultModelMerger() throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			UserSettings settings = getUserSettings(session);
			return getBimServer().getSConverter().convertToSObject(settings.getDefaultModelMerger());
		} catch (Exception e) {
			return handleException(e);
		} finally {
			session.close();
		}
	}

	public SSerializerPluginConfiguration getDefaultSerializer() throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			UserSettings settings = getUserSettings(session);
			return getBimServer().getSConverter().convertToSObject(settings.getDefaultSerializer());
		} catch (Exception e) {
			return handleException(e);
		} finally {
			session.close();
		}
	}

	public SWebModulePluginConfiguration getDefaultWebModule() throws ServerException, UserException {
		requireRealUserAuthentication();
		WebModulePluginConfiguration defaultWebModule = getBimServer().getServerSettingsCache().getServerSettings().getWebModule();
		return getBimServer().getSConverter().convertToSObject(defaultWebModule);
	}

	public SObjectIDMPluginConfiguration getDefaultObjectIDM() throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			UserSettings settings = getUserSettings(session);
			return getBimServer().getSConverter().convertToSObject(settings.getDefaultObjectIDM());
		} catch (BimserverDatabaseException e) {
			return handleException(e);
		} finally {
			session.close();
		}
	}
	
	public SObjectType getPluginSettings(Long poid) throws ServerException, UserException {
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			PluginConfiguration pluginConfiguration = session.get(StorePackage.eINSTANCE.getPluginConfiguration(), poid, Query.getDefault());
			ObjectType settings = pluginConfiguration.getSettings();
			return getBimServer().getSConverter().convertToSObject(settings);
		} catch (Exception e) {
			return handleException(e);
		} finally {
			session.close();
		}
	}
	
	public void setDefaultRenderEngine(final Long oid) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			SetUserSettingDatabaseAction action = new SetUserSettingDatabaseAction(session, getInternalAccessMethod(), getAuthorization(), new UserSettingsSetter() {
				@Override
				public void set(UserSettings userSettings) {
					userSettings.setDefaultRenderEngine(find(userSettings.getRenderEngines(), oid));
				}});
			session.executeAndCommitAction(action);
		} catch (BimserverDatabaseException e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	public void setDefaultQueryEngine(final Long oid) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			SetUserSettingDatabaseAction action = new SetUserSettingDatabaseAction(session, getInternalAccessMethod(), getAuthorization(), new UserSettingsSetter() {
				@Override
				public void set(UserSettings userSettings) {
					userSettings.setDefaultQueryEngine(find(userSettings.getQueryengines(), oid));
				}});
			session.executeAndCommitAction(action);
		} catch (BimserverDatabaseException e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	public void setDefaultWebModule(final Long oid) throws ServerException, UserException {
		requireRealUserAuthentication();
		try {
			getBimServer().getWebModuleManager().setDefault(oid);
		} catch (Exception e) {
			handleException(e);
		}
	}

	@Override
	public List<SSerializerPluginConfiguration> getAllSerializersForRoids(Boolean onlyEnabled, Set<Long> roids) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			Set<Schema> uniqueSchemas = new HashSet<>();
			for (Long roid : roids) {
				Revision revision = session.get(roid, Query.getDefault());
				for (ConcreteRevision concreteRevision : revision.getConcreteRevisions()) {
					uniqueSchemas.add(Schema.valueOf(concreteRevision.getProject().getSchema().toUpperCase()));
				}
			}

			Set<Schema> schemaOr = new HashSet<>();
			
			if (uniqueSchemas.size() == 0) {
				// Wierd, no schemas
			} else if (uniqueSchemas.size() == 1) {
				// Easy, just add it, and see if there are converter targets and add those too
				Schema schema = uniqueSchemas.iterator().next();
				schemaOr.add(schema);
				// TODO make recursive
				for (Schema target : getBimServer().getSchemaConverterManager().getSchemaTargets(schema)) {
					schemaOr.add(target);
				}
			} else if (uniqueSchemas.size() == 2) {
				// This is harder, if we have 2 schema, we must figure out a way to convert to 1 schema, and then filter the allowed source schemas
				Iterator<Schema> iterator = uniqueSchemas.iterator();
				Schema schema1 = iterator.next();
				Schema schema2 = iterator.next();
				SchemaConverterFactory converter1 = getBimServer().getSchemaConverterManager().getSchemaConverterFactory(schema1, schema2);
				SchemaConverterFactory converter2 = getBimServer().getSchemaConverterManager().getSchemaConverterFactory(schema2, schema1);
				if (converter1 != null) {
					schemaOr.add(schema1);
				}
				if (converter2 != null) {
					schemaOr.add(schema2);
				}
			} else {
				throw new ServerException("Unimplemented, no support for > 2 schemas");
			}
			
			UserSettings userSettings = getUserSettings(session);
			List<SSerializerPluginConfiguration> sSerializers = new ArrayList<SSerializerPluginConfiguration>();
			for (SerializerPluginConfiguration serializerPluginConfiguration : userSettings.getSerializers()) {
				SerializerPlugin plugin = getBimServer().getPluginManager().getSerializerPlugin(serializerPluginConfiguration.getPluginDescriptor().getPluginClassName(), true);
				if (plugin != null) {
					for (Schema schema : plugin.getSupportedSchemas()) {
						if (schemaOr.contains(schema)) {
							if (!onlyEnabled || (serializerPluginConfiguration.getEnabled() && serializerPluginConfiguration.getPluginDescriptor().getEnabled())) {
								sSerializers.add(getBimServer().getSConverter().convertToSObject(serializerPluginConfiguration));
								break;
							}
						}
					}
				}
			}
			Collections.sort(sSerializers, new SPluginConfigurationComparator());
			return sSerializers;
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
		return null;
	}
	
	public void setDefaultModelCompare(final Long oid) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			SetUserSettingDatabaseAction action = new SetUserSettingDatabaseAction(session, getInternalAccessMethod(), getAuthorization(), new UserSettingsSetter() {
				@Override
				public void set(UserSettings userSettings) {
					userSettings.setDefaultModelCompare(find(userSettings.getModelcompares(), oid));
				}});
			session.executeAndCommitAction(action);
		} catch (BimserverDatabaseException e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	public void setDefaultModelMerger(final Long oid) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			SetUserSettingDatabaseAction action = new SetUserSettingDatabaseAction(session, getInternalAccessMethod(), getAuthorization(), new UserSettingsSetter() {
				@Override
				public void set(UserSettings userSettings) {
					userSettings.setDefaultModelMerger(find(userSettings.getModelmergers(), oid));
				}});
			session.executeAndCommitAction(action);
		} catch (BimserverDatabaseException e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	private <T extends IdEObject> T find(List<T> list, long oid) {
		for (T t : list) {
			if (t.getOid() == oid) {
				return t;
			}
		}
		return null;
	}

	public void setDefaultSerializer(final Long oid) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			SetUserSettingDatabaseAction action = new SetUserSettingDatabaseAction(session, getInternalAccessMethod(), getAuthorization(), new UserSettingsSetter() {
				@Override
				public void set(UserSettings userSettings) {
					userSettings.setDefaultSerializer(find(userSettings.getSerializers(), oid));
				}});
			session.executeAndCommitAction(action);
		} catch (BimserverDatabaseException e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	public void setDefaultObjectIDM(final Long oid) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			SetUserSettingDatabaseAction action = new SetUserSettingDatabaseAction(session, getInternalAccessMethod(), getAuthorization(), new UserSettingsSetter() {
				@Override
				public void set(UserSettings userSettings) {
					userSettings.setDefaultObjectIDM(find(userSettings.getObjectIDMs(), oid));
				}});
			session.executeAndCommitAction(action);
		} catch (BimserverDatabaseException e) {
			handleException(e);
		} finally {
			session.close();
		}
	}
	
	@Override
	public List<SDeserializerPluginConfiguration> getAllDeserializers(Boolean onlyEnabled) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			UserSettings userSettings = getUserSettings(session);
			EList<DeserializerPluginConfiguration> deserializers = userSettings.getDeserializers();
			List<SDeserializerPluginConfiguration> sDeserializers = new ArrayList<SDeserializerPluginConfiguration>();
			for (DeserializerPluginConfiguration deserializerPluginConfiguration : deserializers) {
				if (!onlyEnabled || (deserializerPluginConfiguration.getEnabled() && deserializerPluginConfiguration.getPluginDescriptor().getEnabled())) {
					sDeserializers.add(getBimServer().getSConverter().convertToSObject(deserializerPluginConfiguration));
				}
			}
			Collections.sort(sDeserializers, new SPluginConfigurationComparator());
			return sDeserializers;
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public SWebModulePluginConfiguration getWebModuleById(Long oid) throws ServerException, UserException {
		requireAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			return getBimServer().getSConverter().convertToSObject(session.executeAndCommitAction(new GetWebModuleByIdDatabaseAction(session, getInternalAccessMethod(), oid)));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public SSerializerPluginConfiguration getSerializerByPluginClassName(String pluginClassName) throws ServerException, UserException {
		// Not checking for real authentication here because a remote service should be able to use a serializer for download call
		requireAuthenticationAndRunningServer();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			return getBimServer().getSConverter().convertToSObject(session.executeAndCommitAction(new GetSerializerByPluginClassNameDatabaseAction(session, getAuthorization(), getInternalAccessMethod(), pluginClassName)));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
		return null;
	}
	
	@Override
	public SMessagingSerializerPluginConfiguration getMessagingSerializerByPluginClassName(String pluginClassName) throws ServerException, UserException {
		// Not checking for real authentication here because a remote service should be able to use a serializer for download call
		requireAuthenticationAndRunningServer();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			return getBimServer().getSConverter().convertToSObject(session.executeAndCommitAction(new GetMessagingSerializerByPluginClassNameDatabaseAction(session, getAuthorization(), getInternalAccessMethod(), pluginClassName)));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
		return null;
	}
	
	@Override
	public Boolean hasActiveSerializer(String contentType) throws ServerException, UserException {
		requireRealUserAuthentication();
		try {
			SSerializerPluginConfiguration serializer = getServiceMap().getBimsie1ServiceInterface().getSerializerByContentType(contentType);
			if (serializer != null) {
				if (serializer.getEnabled()) {
					SPluginDescriptor pluginDescriptor = getServiceMap().getPluginInterface().getPluginDescriptor(serializer.getPluginDescriptorId());
					if (pluginDescriptor.getEnabled()) {
						return getBimServer().getPluginManager().isEnabled(pluginDescriptor.getPluginClassName());
					}
				}
			}
		} catch (Exception e) {
		}
		return false;
	}

	@Override
	public SSerializerPluginDescriptor getSerializerPluginDescriptor(String type) throws UserException {
		requireRealUserAuthentication();
		return getBimServer().getSerializerFactory().getSerializerPluginDescriptor(type);
	}
	

	@Override
	public SInternalServicePluginConfiguration getInternalServiceById(Long oid) throws ServerException, UserException {
		requireAuthenticationAndRunningServer();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			SInternalServicePluginConfiguration convertToSObject = getBimServer().getSConverter().convertToSObject(session.executeAndCommitAction(new GetByIdDatabaseAction<InternalServicePluginConfiguration>(session, getInternalAccessMethod(), oid, StorePackage.eINSTANCE.getInternalServicePluginConfiguration())));
			return convertToSObject;
		} catch (Exception e) {
			return handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public void updateInternalService(SInternalServicePluginConfiguration internalService) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			InternalServicePluginConfiguration convertFromSObject = getBimServer().getSConverter().convertFromSObject(internalService, session);
			session.executeAndCommitAction(new UpdateDatabaseAction<InternalServicePluginConfiguration>(session, getInternalAccessMethod(), convertFromSObject));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public void addInternalService(SInternalServicePluginConfiguration internalService) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			session.executeAndCommitAction(new AddInternalServiceDatabaseAction(session, getInternalAccessMethod(), getAuthorization(), getBimServer().getSConverter().convertFromSObject(internalService, session)));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public void deleteInternalService(Long oid) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			session.executeAndCommitAction(new DeleteInternalServiceDatabaseAction(session, getInternalAccessMethod(), oid));
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public List<SInternalServicePluginConfiguration> getAllInternalServices(Boolean onlyEnabled) throws UserException, ServerException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			UserSettings userSettings = getUserSettings(session);
			EList<InternalServicePluginConfiguration> services2 = userSettings.getServices();
			List<SInternalServicePluginConfiguration> services = getBimServer().getSConverter().convertToSListInternalServicePluginConfiguration(services2);
			Collections.sort(services, new SPluginConfigurationComparator());
			return services;
		} catch (Exception e) {
			return handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public List<SObjectIDMPluginDescriptor> getAllObjectIDMPluginDescriptors() throws UserException {
		requireRealUserAuthentication();
		Collection<ObjectIDMPlugin> allObjectIDMs = getBimServer().getPluginManager().getAllObjectIDMPlugins(true);
		List<SObjectIDMPluginDescriptor> descriptors = new ArrayList<SObjectIDMPluginDescriptor>();
		for (ObjectIDMPlugin ObjectIDMPlugin : allObjectIDMs) {
			SObjectIDMPluginDescriptor descriptor = new SObjectIDMPluginDescriptor();
			descriptor.setClassName(ObjectIDMPlugin.getClass().getName());
			descriptors.add(descriptor);
		}
		return descriptors;
	}
	
	@Override
	public SPluginDescriptor getPluginDescriptor(Long oid) throws ServerException, UserException {
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			PluginDescriptor pluginDescriptor = session.get(oid, Query.getDefault());
			return getBimServer().getSConverter().convertToSObject(pluginDescriptor);
		} catch (Exception e) {
			return handleException(e);
		} finally {
			session.close();
		}
	}
	
	@Override
	public List<SDeserializerPluginConfiguration> getAllDeserializersForProject(Boolean onlyEnabled, Long poid) throws ServerException, UserException {
		requireRealUserAuthentication();
		DatabaseSession session = getBimServer().getDatabase().createSession();
		try {
			Project project = session.get(poid, Query.getDefault());

			UserSettings userSettings = getUserSettings(session);
			EList<DeserializerPluginConfiguration> deserializers = userSettings.getDeserializers();
			List<SDeserializerPluginConfiguration> sDeserializers = new ArrayList<SDeserializerPluginConfiguration>();
			for (DeserializerPluginConfiguration deserializerPluginConfiguration : deserializers) {
				DeserializerPlugin plugin = getBimServer().getPluginManager().getDeserializerPlugin(deserializerPluginConfiguration.getPluginDescriptor().getPluginClassName(), true);
				if (plugin.getSupportedSchemas().contains(Schema.valueOf(project.getSchema().toUpperCase()))) {
					if (!onlyEnabled || (deserializerPluginConfiguration.getEnabled() && deserializerPluginConfiguration.getPluginDescriptor().getEnabled())) {
						sDeserializers.add(getBimServer().getSConverter().convertToSObject(deserializerPluginConfiguration));
					}
				}
			}
			Collections.sort(sDeserializers, new SPluginConfigurationComparator());
			return sDeserializers;
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
		return null;
	}
}