package org.bimserver.tests.emf;

import static org.junit.Assert.fail;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.bimserver.emf.IfcModelInterface;
import org.bimserver.emf.IfcModelInterfaceException;
import org.bimserver.interfaces.objects.SDeserializerPluginConfiguration;
import org.bimserver.interfaces.objects.SProject;
import org.bimserver.models.ifc2x3tc1.IfcBoolean;
import org.bimserver.models.ifc2x3tc1.IfcProperty;
import org.bimserver.models.ifc2x3tc1.IfcPropertySet;
import org.bimserver.models.ifc2x3tc1.IfcPropertySetDefinition;
import org.bimserver.models.ifc2x3tc1.IfcPropertySingleValue;
import org.bimserver.models.ifc2x3tc1.IfcRelDefines;
import org.bimserver.models.ifc2x3tc1.IfcRelDefinesByProperties;
import org.bimserver.models.ifc2x3tc1.IfcValue;
import org.bimserver.models.ifc2x3tc1.IfcWindow;
import org.bimserver.models.ifc2x3tc1.Tristate;
import org.bimserver.plugins.services.BimServerClientInterface;
import org.bimserver.shared.UsernamePasswordAuthenticationInfo;
import org.bimserver.tests.utils.TestWithEmbeddedServer;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateProperties extends TestWithEmbeddedServer  {
	private static final Logger LOGGER = LoggerFactory.getLogger(CreateProperties.class);
	@Test
	public void test() {
		try {
			// New client
			BimServerClientInterface bimServerClient = getFactory().create(new UsernamePasswordAuthenticationInfo("admin@bimserver.org", "admin"));
			
			// Create a project
			SProject project = bimServerClient.getBimsie1ServiceInterface().addProject("test" + Math.random(), "ifc2x3tc1");
			
			// Look for a deserializer
			SDeserializerPluginConfiguration deserializer = bimServerClient.getBimsie1ServiceInterface().getSuggestedDeserializerForExtension("ifc", project.getOid());
			
			bimServerClient.checkin(project.getOid(), "test", deserializer.getOid(), false, true, new File("../TestData/data/AC11-Institute-Var-2-IFC.ifc"));
			
			// Refresh project
			project = bimServerClient.getBimsie1ServiceInterface().getProjectByPoid(project.getOid());
			
			// Load model without lazy loading (complete model at once)
			IfcModelInterface model = bimServerClient.getModel(project, project.getLastRevisionId(), true, false);

			String propertyName = "BooleanProperty";

			int nrWindowsFirst = 0;
			// Iterate over all projects, there should be 1
			for (IfcWindow window : model.getAllWithSubTypes(IfcWindow.class)) {
				nrWindowsFirst++;
				createProperty(window, model, propertyName, "Description of property", true);
			}
			
			model.commit("Added boolean properties to " + nrWindowsFirst + " windows");
			
			project = bimServerClient.getBimsie1ServiceInterface().getProjectByPoid(project.getOid());
			model = bimServerClient.getModel(project, project.getLastRevisionId(), true, false);
			int foundOke = 0;
			int nrWindowsSecond = 0;
			Set<Long> counted = new HashSet<Long>();
			for (IfcWindow window : model.getAllWithSubTypes(IfcWindow.class)) {
				nrWindowsSecond++;
				for (IfcRelDefines ifcRelDefines : window.getIsDefinedBy()) {
					if (ifcRelDefines instanceof IfcRelDefinesByProperties) {
						IfcRelDefinesByProperties ifcRelDefinesByProperties  = (IfcRelDefinesByProperties)ifcRelDefines;
						IfcPropertySetDefinition relatingPropertyDefinition = ifcRelDefinesByProperties.getRelatingPropertyDefinition();
						if (relatingPropertyDefinition instanceof IfcPropertySet) {
							IfcPropertySet ifcPropertySet = (IfcPropertySet)relatingPropertyDefinition;
							for (IfcProperty ifcProperty : ifcPropertySet.getHasProperties()) {
								if (ifcProperty instanceof IfcPropertySingleValue) {
									IfcPropertySingleValue ifcPropertySingleValue = (IfcPropertySingleValue)ifcProperty;
									if (ifcPropertySingleValue.getName().equals(propertyName)) {
										IfcValue nominalValue = ifcPropertySingleValue.getNominalValue();
										if (nominalValue instanceof IfcBoolean) {
											if (((IfcBoolean)nominalValue).getWrappedValue() == Tristate.TRUE) {
												if (!counted.contains(ifcPropertySingleValue.getOid())) {
													foundOke++;
													counted.add(ifcPropertySingleValue.getOid());
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			LOGGER.info("Windows first: " + nrWindowsFirst);
			LOGGER.info("Windows second: " + nrWindowsSecond);
			LOGGER.info("Found Oke: " + foundOke);
			if (foundOke != nrWindowsFirst) {
				fail(foundOke + " / " + nrWindowsFirst);
			}
		} catch (Throwable e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	private void createProperty(IfcWindow window, IfcModelInterface model, String name, String description, Object value) throws IfcModelInterfaceException {
		IfcRelDefinesByProperties ifcRelDefinesByProperties = model.create(IfcRelDefinesByProperties.class);
		window.getIsDefinedBy().add(ifcRelDefinesByProperties);
		IfcPropertySet propertySet = model.create(IfcPropertySet.class);
		ifcRelDefinesByProperties.setRelatingPropertyDefinition(propertySet);
		IfcPropertySingleValue property = model.create(IfcPropertySingleValue.class);
		propertySet.getHasProperties().add(property);
		property.setName(name);
		property.setDescription(description);
		if (value instanceof Boolean) {
			IfcBoolean ifcValue = model.create(IfcBoolean.class);
			ifcValue.setWrappedValue(((Boolean)value) ? Tristate.TRUE : Tristate.FALSE);
			property.setNominalValue(ifcValue);
		} else {
			// Unimplemented
		}
	}
}