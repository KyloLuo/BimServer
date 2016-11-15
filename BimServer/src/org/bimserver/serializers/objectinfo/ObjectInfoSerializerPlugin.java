package org.bimserver.serializers.objectinfo;

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

import java.util.Set;

import org.bimserver.emf.Schema;
import org.bimserver.models.store.ObjectDefinition;
import org.bimserver.plugins.PluginConfiguration;
import org.bimserver.plugins.PluginException;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.serializers.AbstractSerializerPlugin;
import org.bimserver.plugins.serializers.EmfSerializer;

public class ObjectInfoSerializerPlugin extends AbstractSerializerPlugin {

	private boolean initialized = false;

	@Override
	public String getDescription() {
		return "ObjectInfoSerializer";
	}

	@Override
	public String getVersion() {
		return "1.0";
	}

	@Override
	public void init(PluginManager pluginManager) throws PluginException {
		initialized = true;
	}
	
	@Override
	public boolean needsGeometry() {
		return false;
	}

	@Override
	public EmfSerializer createSerializer(PluginConfiguration pluginConfiguration) {
		return new ObjectInfoSerializer();
	}

	@Override
	public String getDefaultName() {
		return "ObjectInfo";
	}

	@Override
	public String getDefaultContentType() {
		return "text/html";
	}

	@Override
	public String getDefaultExtension() {
		return "html";
	}

	@Override
	public boolean isInitialized() {
		return initialized;
	}

	@Override
	public ObjectDefinition getSettingsDefinition() {
		return super.getSettingsDefinition();
	}

	@Override
	public Set<Schema> getSupportedSchemas() {
		return Schema.IFC2X3TC1.toSet();
	}
}