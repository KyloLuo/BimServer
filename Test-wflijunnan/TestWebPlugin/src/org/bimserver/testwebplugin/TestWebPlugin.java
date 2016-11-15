package org.bimserver.testwebplugin;

import org.bimserver.plugins.PluginException;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.web.AbstractWebModulePlugin;

public class TestWebPlugin extends AbstractWebModulePlugin{
	private boolean initialized;

	@Override
	public void init(PluginManager pluginManager) throws PluginException {
		super.init(pluginManager);
		initialized = true;
	}
	
	@Override
	public String getDescription() {
		return "TestWebPlugin";
	}

	@Override
	public String getDefaultName() {
		return "TestWebPlugin";
	}

	@Override
	public String getVersion() {
		return "1.0";
	}

	@Override
	public boolean isInitialized() {
		return initialized;
	}
	
	@Override
	public String getSubDir() {
		return "";
	}
	
	@Override
	public String getDefaultContextPath() {
		return "";
	}

	@Override
	public String getIdentifier() {
		return "default";
	}
}
