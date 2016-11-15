package org.bimserver.tests.emf;

import static org.junit.Assert.fail;

import java.io.File;

import org.bimserver.emf.IfcModelInterface;
import org.bimserver.interfaces.objects.SDeserializerPluginConfiguration;
import org.bimserver.interfaces.objects.SProject;
import org.bimserver.models.ifc2x3tc1.IfcParameterValue;
import org.bimserver.models.ifc2x3tc1.IfcTrimmedCurve;
import org.bimserver.models.ifc2x3tc1.IfcTrimmingSelect;
import org.bimserver.plugins.services.BimServerClientInterface;
import org.bimserver.shared.UsernamePasswordAuthenticationInfo;
import org.bimserver.tests.utils.TestWithEmbeddedServer;
import org.junit.Test;

public class ReadTrim extends TestWithEmbeddedServer {

	@Test
	public void test() {
		try {
			// Create a new BimServerClient with authentication
			BimServerClientInterface bimServerClient = getFactory().create(new UsernamePasswordAuthenticationInfo("admin@bimserver.org", "admin"));
			
			// Create a new project
			SProject newProject = bimServerClient.getBimsie1ServiceInterface().addProject("test" + Math.random(), "ifc2x3tc1");
			
			// Get the appropriate deserializer
			SDeserializerPluginConfiguration deserializer = bimServerClient.getBimsie1ServiceInterface().getSuggestedDeserializerForExtension("ifc", newProject.getOid());
			
			// Checkin the file
			bimServerClient.checkin(newProject.getOid(), "test", deserializer.getOid(), false, true, new File("../TestData/data/TST.ifc"));
			
			// Refresh project info
			newProject = bimServerClient.getBimsie1ServiceInterface().getProjectByPoid(newProject.getOid());
			
			IfcModelInterface model = bimServerClient.getModel(newProject, newProject.getLastRevisionId(), true, false);
			for (IfcTrimmedCurve ifcTrimmedCurve : model.getAllWithSubTypes(IfcTrimmedCurve.class)) {
				for (IfcTrimmingSelect ifcTrimmingSelect : ifcTrimmedCurve.getTrim1()) {
					if (ifcTrimmingSelect instanceof IfcParameterValue) {
						IfcParameterValue ifcParameterValue = (IfcParameterValue)ifcTrimmingSelect;
						System.out.println("Trim1: " + ifcParameterValue.getWrappedValue());
					}
				}
				for (IfcTrimmingSelect ifcTrimmingSelect : ifcTrimmedCurve.getTrim2()) {
					if (ifcTrimmingSelect instanceof IfcParameterValue) {
						IfcParameterValue ifcParameterValue = (IfcParameterValue)ifcTrimmingSelect;
						System.out.println("Trim2: " + ifcParameterValue.getWrappedValue());
					}
				}
			}
		} catch (Throwable e) {
			e.printStackTrace();
			if (e instanceof AssertionError) {
				throw (AssertionError)e;
			}
			fail(e.getMessage());
		}
	}
}