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

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.bimserver.database.BimserverDatabaseException;
import org.bimserver.database.DatabaseRestartRequiredException;
import org.bimserver.database.mongo.DatabaseInitException;
import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.store.ServerState;
import org.bimserver.plugins.OptionsParser;
import org.bimserver.plugins.PluginException;
import org.bimserver.shared.LocalDevelopmentResourceFetcher;
import org.bimserver.shared.exceptions.ServiceException;
import org.bimserver.shared.interfaces.AdminInterface;
import org.bimserver.shared.interfaces.SettingsInterface;
import org.bimserver.webservices.authorization.SystemAuthorization;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LocalDevBimServerStarter {
	private static final Logger LOGGER = LoggerFactory.getLogger(LocalDevBimServerStarter.class);
	private BimServer bimServer;
	
	public static void main(String[] args) {
		new LocalDevBimServerStarter().start(1, "localhost", 8080, 8085, new OptionsParser(args).getPluginDirectories());
//		new LocalDevBimServerStarter().start(2, "localhost", 8081, 8086, gitDir);
	}

	public void start(int id, String address, int port, int pbport, File[] pluginDirectories) {
		BimServerConfig config = new BimServerConfig();
		config.setHomeDir(new File("home" + id));
		config.setResourceFetcher(new LocalDevelopmentResourceFetcher(new File("../")));
		config.setStartEmbeddedWebServer(true);
		config.setClassPath(System.getProperty("java.class.path"));
		config.setInitialProtocolBuffersPort(pbport);
		config.setLocalDev(true);
		config.setPort(port);
		//@added by Ning
		config.setAutoMigrate(true);
		config.setStartCommandLine(true);
		bimServer = new BimServer(config);
		bimServer.getVersionChecker().getLocalVersion().setDate(new Date());
		try {
	 		// LocalDevPluginLoader.loadPlugins(bimServer.getPluginManager(), new File(".."), pluginDirectories);
			
			bimServer.getPluginManager().loadPluginsFromEclipseProject(new File("../BIMviews"));
	//		bimServer.getPluginManager().loadPluginsFromEclipseProject(new File("../AdminGui"));
			bimServer.getPluginManager().loadPluginsFromEclipseProject(new File("../BuildingSMARTLibrary"));
			bimServer.getPluginManager().loadPluginsFromEclipseProject(new File("../IfcPlugins"));
	//		bimServer.getPluginManager().loadPluginsFromEclipseProject(new File("../DefaultWebModulePlugin"));
			bimServer.getPluginManager().loadPluginsFromEclipseProject(new File("../Charting"));
			bimServer.getPluginManager().loadPluginsFromEclipseProject(new File("../IfcOpenShellPlugin"));
			bimServer.getPluginManager().loadPluginsFromEclipseProject(new File("../Mergers"));
			bimServer.getPluginManager().loadPluginsFromEclipseProject(new File("../MiscSerializers"));
			bimServer.getPluginManager().loadPluginsFromEclipseProject(new File("../DemoPlugins"));
			
			
			bimServer.start();
			if (bimServer.getServerInfo().getServerState() == ServerState.NOT_SETUP) {
				AdminInterface adminInterface = bimServer.getServiceFactory().get(new SystemAuthorization(1, TimeUnit.HOURS), AccessMethod.INTERNAL).get(AdminInterface.class);
				adminInterface.setup("http://localhost:" + port, "localhost", "no-reply@bimserver.org", "Administrator", "admin@bimserver.org", "admin");
				SettingsInterface settingsInterface = bimServer.getServiceFactory().get(new SystemAuthorization(1, TimeUnit.HOURS), AccessMethod.INTERNAL).get(SettingsInterface.class);
				settingsInterface.setCacheOutputFiles(false);
			}
		} catch (PluginException e) {
			LOGGER.error("", e);
		} catch (ServiceException e) {
			LOGGER.error("", e);
		} catch (DatabaseInitException e) {
			LOGGER.error("", e);
		} catch (BimserverDatabaseException e) {
			LOGGER.error("", e);
		} catch (DatabaseRestartRequiredException e) {
			LOGGER.error("", e);
		}
	}

	public BimServer getBimServer() {
		return bimServer;
	}
}