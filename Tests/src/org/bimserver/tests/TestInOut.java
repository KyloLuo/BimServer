package org.bimserver.tests;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.bimserver.BimServer;
import org.bimserver.BimServerConfig;
import org.bimserver.LocalDevPluginLoader;
import org.bimserver.LocalDevSetup;
import org.bimserver.database.BimserverDatabaseException;
import org.bimserver.database.DatabaseRestartRequiredException;
import org.bimserver.database.mongo.DatabaseInitException;
import org.bimserver.interfaces.objects.SDeserializerPluginConfiguration;
import org.bimserver.interfaces.objects.SProject;
import org.bimserver.interfaces.objects.SSerializerPluginConfiguration;
import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.store.ServerState;
import org.bimserver.plugins.OptionsParser;
import org.bimserver.plugins.PluginException;
import org.bimserver.plugins.services.BimServerClientInterface;
import org.bimserver.shared.LocalDevelopmentResourceFetcher;
import org.bimserver.shared.PublicInterfaceNotFoundException;
import org.bimserver.shared.exceptions.ServerException;
import org.bimserver.shared.exceptions.UserException;
import org.bimserver.shared.interfaces.AdminInterface;
import org.bimserver.shared.interfaces.SettingsInterface;
import org.bimserver.tests.diff.CompareException;
import org.bimserver.tests.diff.Diff;
import org.bimserver.webservices.authorization.SystemAuthorization;

public class TestInOut {
	public static void main(String[] args) {
		new TestInOut().start(args);
	}

	private void start(String[] args) {
		BimServerConfig config = new BimServerConfig();
		File homeDir = new File("home");
		try {
			if (homeDir.isDirectory()) {
				FileUtils.forceDelete(homeDir);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		config.setClassPath(System.getProperty("java.class.path"));
		config.setHomeDir(homeDir);
		config.setInitialProtocolBuffersPort(8020);
		config.setPort(8080);
		config.setStartEmbeddedWebServer(true);
		config.setResourceFetcher(new LocalDevelopmentResourceFetcher(new File("../")));

		BimServer bimServer = new BimServer(config);
		try {
			LocalDevPluginLoader.loadPlugins(bimServer.getPluginManager(), new File(".."), new OptionsParser(args).getPluginDirectories());
			bimServer.start();
			if (bimServer.getServerInfo().getServerState() == ServerState.NOT_SETUP) {
				AdminInterface adminInterface = bimServer.getServiceFactory().get(new SystemAuthorization(1, TimeUnit.HOURS), AccessMethod.INTERNAL).get(AdminInterface.class);
				adminInterface.setup("http://localhost:8080", "localhost", "no-reply@bimserver.org", "Administrator", "admin@bimserver.org", "admin");
				SettingsInterface settingsInterface = bimServer.getServiceFactory().get(new SystemAuthorization(1, TimeUnit.HOURS), AccessMethod.INTERNAL).get(SettingsInterface.class);
				settingsInterface.setCacheOutputFiles(false);
			}
			BimServerClientInterface client = LocalDevSetup.setupJson("http://localhost:8080");
			SProject project = client.getBimsie1ServiceInterface().addProject("test", "ifc2x3tc1");
			SDeserializerPluginConfiguration deserializer = client.getBimsie1ServiceInterface().getSuggestedDeserializerForExtension("ifc", project.getOid());
			File inputFile = new File("../TestData/data/AC11-Institute-Var-2-IFC.ifc");
			client.checkin(project.getOid(), "test", deserializer.getOid(), false, true, inputFile);
			project = client.getBimsie1ServiceInterface().getProjectByPoid(project.getOid());
			SSerializerPluginConfiguration serializer = client.getBimsie1ServiceInterface().getSerializerByContentType("application/ifc");
			File outputFile = new File("output.ifc");
			client.download(project.getLastRevisionId(), serializer.getOid(), outputFile);
			
			Diff diff = new Diff(false, false, false, inputFile, outputFile);
			diff.start();
		} catch (ServerException e) {
			e.printStackTrace();
		} catch (DatabaseInitException e) {
			e.printStackTrace();
		} catch (BimserverDatabaseException e) {
			e.printStackTrace();
		} catch (PluginException e) {
			e.printStackTrace();
		} catch (DatabaseRestartRequiredException e) {
			e.printStackTrace();
		} catch (UserException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (PublicInterfaceNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (CompareException e) {
			e.printStackTrace();
		}
	}
}