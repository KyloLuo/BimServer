package org.bimserver.tests;

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
import java.io.FileOutputStream;
import java.io.IOException;

import org.bimserver.LocalDevPluginLoader;
import org.bimserver.emf.IfcModelInterface;
import org.bimserver.plugins.PluginConfiguration;
import org.bimserver.plugins.PluginException;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.deserializers.DeserializeException;
import org.bimserver.plugins.deserializers.Deserializer;
import org.bimserver.plugins.deserializers.DeserializerPlugin;
import org.bimserver.plugins.serializers.Serializer;
import org.bimserver.plugins.serializers.SerializerException;
import org.bimserver.plugins.serializers.SerializerPlugin;

public class CityGmlTest {
	public static void main(String[] args) {
		try {
			PluginManager pluginManager = LocalDevPluginLoader.createPluginManager(new File("home"));
			DeserializerPlugin deserializerPlugin = pluginManager.requireDeserializer("ifc");
			Deserializer deserializer = deserializerPlugin.createDeserializer(new PluginConfiguration());
			deserializer.init(pluginManager.getMetaDataManager().getPackageMetaData("ifc2x3tc1"));
			IfcModelInterface model = deserializer.read(TestFile.AC11.getFile());
			SerializerPlugin serializerPlugin = pluginManager.getSerializerPlugin("org.bimserver.citygml.CityGmlSerializerPlugin", true);
			Serializer serializer = serializerPlugin.createSerializer(new PluginConfiguration());
			serializer.init(model, null, pluginManager, pluginManager.requireRenderEngine(), null, false);
			FileOutputStream fos = new FileOutputStream(new File("out.gml"));
			serializer.writeToOutputStream(fos, null);
			fos.close();
		} catch (PluginException e2) {
			e2.printStackTrace();
		} catch (DeserializeException e) {
			e.printStackTrace();
		} catch (SerializerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}