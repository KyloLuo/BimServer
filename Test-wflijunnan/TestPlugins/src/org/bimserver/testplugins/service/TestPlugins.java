package org.bimserver.testplugins.service;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import org.bimserver.interfaces.objects.SInternalServicePluginConfiguration;
import org.bimserver.interfaces.objects.SObjectType;
import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.log.NewRevisionAdded;
import org.bimserver.models.store.ObjectDefinition;
import org.bimserver.models.store.ServiceDescriptor;
import org.bimserver.models.store.StoreFactory;
import org.bimserver.models.store.Trigger;
import org.bimserver.plugins.PluginConfiguration;
import org.bimserver.plugins.PluginException;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.services.BimServerClientInterface;
import org.bimserver.plugins.services.NewRevisionHandler;
import org.bimserver.plugins.services.ServicePlugin;
import org.bimserver.shared.exceptions.ServerException;
import org.bimserver.shared.exceptions.UserException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebService(name = "TestInterface", targetNamespace="org.bimserver")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public class TestPlugins extends ServicePlugin {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestPlugins.class);
	private boolean initialized;

	public void init(PluginManager pluginManager) throws PluginException {
		super.init(pluginManager);
		initialized = true;
	}
	
	public String getDescription() {
		return "Test Service";
	}

	public String getDefaultName() {
		return "Test Service";
	}

	public String getVersion() {
		return "1.0";
	}

	public ObjectDefinition getSettingsDefinition() {
		return null;
	}

	public boolean isInitialized() {
		return initialized;
	}

	public String getTitle() {
		return "Test Service";
	}

	@Override
	public void register(long uoid, SInternalServicePluginConfiguration internalServicePluginConfiguration, PluginConfiguration pluginConfiguration) {
		ServiceDescriptor serviceDescriptor = StoreFactory.eINSTANCE.createServiceDescriptor();
		serviceDescriptor.setProviderName("BIMserver");
		serviceDescriptor.setIdentifier("" + internalServicePluginConfiguration.getOid());
		serviceDescriptor.setName("Test Service");
		serviceDescriptor.setDescription("Test Service");
		serviceDescriptor.setNotificationProtocol(AccessMethod.INTERNAL);
		serviceDescriptor.setTrigger(Trigger.NEW_REVISION);
		registerNewRevisionHandler(uoid, serviceDescriptor, new NewRevisionHandler() {
			@Override
			public void newRevision(BimServerClientInterface bimServerClientInterface, long poid, long roid, String userToken, long soid, SObjectType settings) throws ServerException, UserException {
				String ss = getTitle();
				System.out.println(ss);
			}
		});
//		NewRevisionHandler.getId;
	}


	public void unregister(SInternalServicePluginConfiguration internalService) {
	}
	
}