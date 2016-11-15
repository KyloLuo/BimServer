package org.bimserver.testschemaplugin;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.bimserver.models.store.ObjectDefinition;
import org.bimserver.plugins.PluginConfiguration;
import org.bimserver.plugins.PluginContext;
import org.bimserver.plugins.PluginException;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.schema.SchemaDefinition;
import org.bimserver.plugins.schema.SchemaPlugin;

import nl.tue.buildingsmart.emf.DerivedReader;
import nl.tue.buildingsmart.express.parser.ExpressSchemaParser;

public class TestSchemaPlugin implements SchemaPlugin{
	private SchemaDefinition schemaDefinition;
	private boolean initialized = false;
	private File schemaFile;
	
	
	public void init(PluginManager pluginManager) throws PluginException {
		PluginContext pluginContext = pluginManager.getPluginContext(this);
		try {
			InputStream inputStream = pluginContext.getResourceAsInputStream("schema/IFC2X3_TC1.exp");
			try {
				if (!pluginManager.getTempDir().exists()) {
					pluginManager.getTempDir().mkdir();
				}
				schemaFile = new File(pluginManager.getTempDir(), "IFC2X3_TC1.exp");
				FileOutputStream fileOutputStream = new FileOutputStream(schemaFile);
				try {
					IOUtils.copy(inputStream, fileOutputStream);
				} finally {
					fileOutputStream.close();
				}
			} finally {
				inputStream.close();
			}
			schemaDefinition = loadIfcSchema(schemaFile);
			initialized = true;
		} catch (Exception e) {
			throw new PluginException(e);
		}
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "TestSchemaPlugin";
	}

	@Override
	public String getDefaultName() {
		// TODO Auto-generated method stub
		return "TestSchemaPlugin";
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return "1.0";
	}

	@Override
	public ObjectDefinition getSettingsDefinition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isInitialized() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public SchemaDefinition getSchemaDefinition(PluginConfiguration pluginConfiguration) {
		// TODO Auto-generated method stub
		return schemaDefinition;
	}

	@Override
	public File getExpressSchemaFile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSchemaVersion() {
		// TODO Auto-generated method stub
		return "1.0";
	}
	
	private SchemaDefinition loadIfcSchema(File schemaFile) {
		try {
			ExpressSchemaParser schemaParser = new ExpressSchemaParser(schemaFile);
			schemaParser.parse();
			SchemaDefinition schema = schemaParser.getSchema();
			new DerivedReader(schemaFile, schema);
			if (schema != null) {
				System.out.println("IFC-Schema successfully loaded from " + schemaFile.getAbsolutePath());
			} else {
				System.out.println("Error loading IFC-Schema");
			}
			return schema;
		} catch (IOException e) {
			
		}
		return null;
	}
}
