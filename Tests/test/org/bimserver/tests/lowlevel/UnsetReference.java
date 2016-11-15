package org.bimserver.tests.lowlevel;

import static org.junit.Assert.fail;

import org.bimserver.interfaces.objects.SProject;
import org.bimserver.plugins.services.BimServerClientInterface;
import org.bimserver.shared.UsernamePasswordAuthenticationInfo;
import org.bimserver.shared.interfaces.bimsie1.Bimsie1LowLevelInterface;
import org.bimserver.tests.utils.TestWithEmbeddedServer;
import org.junit.Test;

public class UnsetReference extends TestWithEmbeddedServer {

	@Test
	public void test() {
		try {
			// Create a new BimServerClient with authentication
			BimServerClientInterface bimServerClient = getFactory().create(new UsernamePasswordAuthenticationInfo("admin@bimserver.org", "admin"));
			
			Bimsie1LowLevelInterface lowLevelInterface = bimServerClient.getBimsie1LowLevelInterface();
			
			// Create a new project
			SProject newProject = bimServerClient.getBimsie1ServiceInterface().addProject("test" + Math.random(), "ifc2x3tc1");
			
			// Start a transaction
			Long tid = lowLevelInterface.startTransaction(newProject.getOid());
			
			Long ifcRelContainedInSpatialStructureOid = lowLevelInterface.createObject(tid, "IfcRelContainedInSpatialStructure", true);
			Long ifcBuildingOid = lowLevelInterface.createObject(tid, "IfcBuilding", true);
			lowLevelInterface.setReference(tid, ifcRelContainedInSpatialStructureOid, "RelatingStructure", ifcBuildingOid);
			
			lowLevelInterface.commitTransaction(tid, "Initial");
			
			tid = lowLevelInterface.startTransaction(newProject.getOid());
			lowLevelInterface.unsetReference(tid, ifcRelContainedInSpatialStructureOid, "RelatingStructure");
			lowLevelInterface.commitTransaction(tid, "unset reference");
			
			tid = lowLevelInterface.startTransaction(newProject.getOid());
			if (lowLevelInterface.getReference(tid, ifcRelContainedInSpatialStructureOid, "RelatingStructure") != -1) {
				fail("Relation should be unset");
			}
			lowLevelInterface.abortTransaction(tid);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}