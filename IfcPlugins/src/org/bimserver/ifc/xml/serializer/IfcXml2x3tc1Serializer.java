package org.bimserver.ifc.xml.serializer;

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

import org.bimserver.emf.IfcModelInterface;
import org.bimserver.emf.PackageMetaData;
import org.bimserver.plugins.PluginException;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.renderengine.RenderEnginePlugin;
import org.bimserver.plugins.serializers.ProjectInfo;
import org.bimserver.plugins.serializers.SerializerException;

public class IfcXml2x3tc1Serializer extends IfcXmlSerializer {
	@Override
	public void init(IfcModelInterface model, ProjectInfo projectInfo, PluginManager pluginManager, RenderEnginePlugin renderEnginePlugin, PackageMetaData packageMetaData, boolean normalizeOids) throws SerializerException {
		try {
			setSchema(pluginManager.requireSchemaDefinition("ifc2x3tc1"));
		} catch (PluginException e) {
			throw new SerializerException(e);
		}
		super.init(model, projectInfo, pluginManager, renderEnginePlugin, packageMetaData, normalizeOids);
	}
}
