package org.bimserver.ifc.xml.deserializer;

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

import java.util.Collections;
import java.util.Set;

import org.bimserver.emf.Schema;
import org.bimserver.plugins.PluginConfiguration;
import org.bimserver.plugins.deserializers.EmfDeserializer;

public class Ifc2x3tc1XmlDeserializerPlugin extends IfcXmlDeserializerPlugin  {
	@Override
	public String getDescription() {
		return "Ifc2x3tc1 Xml Deserializer";
	}

	@Override
	public String getDefaultName() {
		return "Ifc2x3tc1 Xml Deserializer";
	}
	
	@Override
	public EmfDeserializer createDeserializer(PluginConfiguration pluginConfiguration) {
		return new Ifc2x3tc1XmlDeserializer();
	}
	
	@Override
	public Set<Schema> getSupportedSchemas() {
		return Collections.singleton(Schema.IFC2X3TC1);
	}
}