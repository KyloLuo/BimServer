package org.bimserver.tests.serviceinterface;

import static org.junit.Assert.fail;

import java.io.File;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;

import org.bimserver.interfaces.objects.SActionState;
import org.bimserver.interfaces.objects.SDeserializerPluginConfiguration;
import org.bimserver.interfaces.objects.SLongActionState;
import org.bimserver.interfaces.objects.SProject;
import org.bimserver.interfaces.objects.SSerializerPluginConfiguration;
import org.bimserver.plugins.services.BimServerClientInterface;
import org.bimserver.shared.UsernamePasswordAuthenticationInfo;
import org.bimserver.tests.utils.TestWithEmbeddedServer;
import org.junit.Test;

public class MultiCheckinAndDownload extends TestWithEmbeddedServer {
	@Test
	public void test() {
		try {
			// Create a new BimServerClient with authentication
			BimServerClientInterface bimServerClient = getFactory().create(new UsernamePasswordAuthenticationInfo("admin@bimserver.org", "admin"));

			long s = System.nanoTime();
			for (int i=0; i<3; i++) {
				// Create a new project
				SProject newProject = bimServerClient.getBimsie1ServiceInterface().addProject("test" + Math.random(), "ifc2x3tc1");
				
				// This is the file we will be checking in
				File ifcFile = new File("../TestData/data/AC11-FZK-Haus-IFC.ifc");
				
				// Find a deserializer to use
				SDeserializerPluginConfiguration deserializer = bimServerClient.getBimsie1ServiceInterface().getSuggestedDeserializerForExtension("ifc", newProject.getOid());
				
				// Checkin
				Long progressId = bimServerClient.getServiceInterface().checkin(newProject.getOid(), "test", deserializer.getOid(), ifcFile.length(), ifcFile.getName(), new DataHandler(new FileDataSource(ifcFile)), false, true);
				
				// Get the status
				SLongActionState longActionState = bimServerClient.getRegistry().getProgress(progressId);
				if (longActionState.getState() == SActionState.FINISHED) {
					// Find a serializer
					SSerializerPluginConfiguration serializer = bimServerClient.getBimsie1ServiceInterface().getSerializerByContentType("application/ifc");
					
					// Get the project details
					newProject = bimServerClient.getBimsie1ServiceInterface().getProjectByPoid(newProject.getOid());
					
					// Download the latest revision  (the one we just checked in)
					Long downloadId = bimServerClient.getBimsie1ServiceInterface().download(newProject.getLastRevisionId(), serializer.getOid(), true, true);
					SLongActionState downloadState = bimServerClient.getRegistry().getProgress(downloadId);
					if (downloadState.getState() == SActionState.FINISHED) {
						// Success
						System.out.println("Success");
					}
				}
			}
			long e = System.nanoTime();
			System.out.println(((e - s) / 1000000) + " ms");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}