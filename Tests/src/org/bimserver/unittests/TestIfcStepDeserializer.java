package org.bimserver.unittests;

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

import static org.junit.Assert.fail;

import java.io.File;

import org.bimserver.LocalDevPluginLoader;
import org.bimserver.emf.IfcModelInterface;
import org.bimserver.emf.MetaDataManager;
import org.bimserver.emf.PackageMetaData;
import org.bimserver.plugins.PluginConfiguration;
import org.bimserver.plugins.PluginException;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.deserializers.DeserializeException;
import org.bimserver.plugins.deserializers.Deserializer;
import org.bimserver.plugins.deserializers.DeserializerPlugin;
import org.bimserver.plugins.serializers.Serializer;
import org.bimserver.plugins.serializers.SerializerException;
import org.bimserver.plugins.serializers.SerializerPlugin;
import org.bimserver.tests.TestFile;
import org.junit.Test;

public class TestIfcStepDeserializer {
	@Test
	public void testSpaceEndOfLineBeforeSemiColon() {
		try {
			PluginManager pluginManager = LocalDevPluginLoader.createPluginManager(new File("home"));
			DeserializerPlugin deserializerPlugin = pluginManager.getFirstDeserializer("ifc", true);
			Deserializer deserializer = deserializerPlugin.createDeserializer(new PluginConfiguration());
			
			MetaDataManager metaDataManager = new MetaDataManager(pluginManager);
			PackageMetaData packageMetaData = metaDataManager.getPackageMetaData("ifc2x3tc1");
			
			deserializer.init(packageMetaData);
			IfcModelInterface modelInterface = deserializer.read(TestFile.AC11.getFile());
			
			SerializerPlugin serializerPlugin = pluginManager.getSerializerPlugin("org.bimserver.ifc.step.serializer.IfcStepSerializerPlugin", true);
			Serializer serializer = serializerPlugin.createSerializer(new PluginConfiguration());
			serializer.init(modelInterface, null, pluginManager, pluginManager.requireRenderEngine(), packageMetaData, false);
			serializer.writeToFile(new File("output/test.ifc"), null);
		} catch (PluginException e) {
			e.printStackTrace();
			fail(e.getMessage());
		} catch (DeserializeException e) {
			e.printStackTrace();
			fail(e.getMessage());
		} catch (SerializerException e) {
			e.printStackTrace();
		}
	}
}