package org.bimserver.test;

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
import java.io.IOException;

import org.bimserver.LocalDevSetup;
import org.bimserver.interfaces.objects.SDeserializerPluginConfiguration;
import org.bimserver.interfaces.objects.SProject;
import org.bimserver.interfaces.objects.SSerializerPluginConfiguration;
import org.bimserver.plugins.services.BimServerClientInterface;
import org.bimserver.shared.PublicInterfaceNotFoundException;
import org.bimserver.shared.exceptions.ServiceException;
import org.bimserver.shared.interfaces.bimsie1.Bimsie1ServiceInterface;

public class ImportLargeProject {
	public static void main(String[] args) {
		BimServerClientInterface client = LocalDevSetup.setupJson("http://localhost:8080");
		try {
			File baseFolder = new File("C:\\Users\\Ruben de Laat\\Documents\\ttt");
			
			Bimsie1ServiceInterface serviceInterface = client.getBimsie1ServiceInterface();
			SProject mainProject = serviceInterface.addProject("Tekla Demo Model", "ifc2x3tc1");
			SProject architectural = serviceInterface.addProjectAsSubProject("Architectural", mainProject.getOid(), "ifc2x3tc1");
			SProject teklaHouseArchitectural = serviceInterface.addProjectAsSubProject("Tekla House Architectural", architectural.getOid(), "ifc2x3tc1");
			SProject structuralSteal = serviceInterface.addProjectAsSubProject("Structural Steal", mainProject.getOid(), "ifc2x3tc1");
			SProject teklaHouseStructural = serviceInterface.addProjectAsSubProject("Tekla House Structural", structuralSteal.getOid(), "ifc2x3tc1");
			SProject foundation = serviceInterface.addProjectAsSubProject("Foundation", mainProject.getOid(), "ifc2x3tc1");
			SProject teklaHouseFoundationFootings = serviceInterface.addProjectAsSubProject("Tekla Hose Foundation Footings", foundation.getOid(), "ifc2x3tc1");
			SProject teklaHouseFoundationPiles = serviceInterface.addProjectAsSubProject("Tekla Hose Foundation Piles", foundation.getOid(), "ifc2x3tc1");
			SProject teklaHouseFoundationRebars = serviceInterface.addProjectAsSubProject("Tekla Hose Foundation Rebars", foundation.getOid(), "ifc2x3tc1");
			SProject teklaHouseFoundationEmbedments = serviceInterface.addProjectAsSubProject("Tekla Hose Foundation Embedments", foundation.getOid(), "ifc2x3tc1");
			SProject cipConcreteContractor = serviceInterface.addProjectAsSubProject("CIP Concrete Contractor", mainProject.getOid(), "ifc2x3tc1");
			serviceInterface.addProjectAsSubProject("Tekla House CIP Pours", cipConcreteContractor.getOid(), "ifc2x3tc1");
			SProject teklaHouseCIPRebars = serviceInterface.addProjectAsSubProject("Tekla House CIP Rebars", cipConcreteContractor.getOid(), "ifc2x3tc1");
			SProject teklaHouseCIPColumns = serviceInterface.addProjectAsSubProject("Tekla House CIP Columns", cipConcreteContractor.getOid(), "ifc2x3tc1");
			SProject formWork = serviceInterface.addProjectAsSubProject("Formwork", mainProject.getOid(), "ifc2x3tc1");
			serviceInterface.addProjectAsSubProject("Column Formwork", formWork.getOid(), "ifc2x3tc1");
			SProject precast = serviceInterface.addProjectAsSubProject("Precast", mainProject.getOid(), "ifc2x3tc1");
			SProject teklaHousePrecastRebars = serviceInterface.addProjectAsSubProject("Tekla House Precast Rebars", precast.getOid(), "ifc2x3tc1");
			SProject teklaHousePrecastConcrete = serviceInterface.addProjectAsSubProject("Tekla House Precast Concrete", precast.getOid(), "ifc2x3tc1");
			SProject mep = serviceInterface.addProjectAsSubProject("MEP", mainProject.getOid(), "ifc2x3tc1");
			SProject teklaHouseMEPGround = serviceInterface.addProjectAsSubProject("Teklas House MEP, Ground", mep.getOid(), "ifc2x3tc1");
			SProject teklaHouseMEP1 = serviceInterface.addProjectAsSubProject("Tekla House MEP, 1st", mep.getOid(), "ifc2x3tc1");
			SProject teklaHouseMEP2 = serviceInterface.addProjectAsSubProject("Tekla House MEP, 2nd", mep.getOid(), "ifc2x3tc1");
			SProject teklaHouseMEP3 = serviceInterface.addProjectAsSubProject("Tekla House MEP, 3rd", mep.getOid(), "ifc2x3tc1");
			SProject teklaHouseMEPRoof = serviceInterface.addProjectAsSubProject("Tekla House MEP, Roof", mep.getOid(), "ifc2x3tc1");
			SProject site = serviceInterface.addProjectAsSubProject("Site", mainProject.getOid(), "ifc2x3tc1");
			serviceInterface.addProjectAsSubProject("Site.skp", site.getOid(), "ifc2x3tc1");
			serviceInterface.addProjectAsSubProject("Tower crane", site.getOid(), "ifc2x3tc1");
			serviceInterface.addProjectAsSubProject("Caterpillar", site.getOid(), "ifc2x3tc1");
			serviceInterface.addProjectAsSubProject("Excavator", site.getOid(), "ifc2x3tc1");
			SProject grid = serviceInterface.addProjectAsSubProject("Grid", mainProject.getOid(), "ifc2x3tc1");
			SProject teklaHouseGrids = serviceInterface.addProjectAsSubProject("Tekla House Grids", grid.getOid(), "ifc2x3tc1");
			
			SDeserializerPluginConfiguration deserializer = client.getBimsie1ServiceInterface().getSuggestedDeserializerForExtension("ifc", grid.getOid());
			
			client.checkin(teklaHouseStructural.getOid(), "Initial", deserializer.getOid(), false, true, new File(baseFolder, "Tekla House Structural.ifcZIP"));
			client.checkin(teklaHouseGrids.getOid(), "Initial", deserializer.getOid(), false, true, new File(baseFolder, "Tekla House Grids.ifc"));
			client.checkin(teklaHouseFoundationFootings.getOid(), "Initial", deserializer.getOid(), false, true, new File(baseFolder, "Tekla House Foundation Footings.ifcZIP"));
			client.checkin(teklaHouseFoundationPiles.getOid(), "Initial", deserializer.getOid(), false, true, new File(baseFolder, "Tekla House Foundation Piles.ifcZIP"));
			client.checkin(teklaHouseFoundationRebars.getOid(), "Initial", deserializer.getOid(), false, true, new File(baseFolder, "Tekla House Foundation Rebars.ifcZIP"));
			client.checkin(teklaHouseFoundationEmbedments.getOid(), "Initial", deserializer.getOid(), false, true, new File(baseFolder, "Tekla House Foundation Embedments.ifcZIP"));
			client.checkin(teklaHousePrecastRebars.getOid(), "Initial", deserializer.getOid(), false, true, new File(baseFolder, "Tekla House Precast Rebars.ifcZIP"));
			client.checkin(teklaHousePrecastConcrete.getOid(), "Initial", deserializer.getOid(), false, true, new File(baseFolder, "Tekla House Precast Concrete.ifcZIP"));
//			client.checkin(teklaHouseCIPPours.getOid(), "Initial", deserializer.getOid(), false, true, new File(baseFolder, "Tekla House CIP Pours.ifc"));
			client.checkin(teklaHouseCIPRebars.getOid(), "Initial", deserializer.getOid(), false, true, new File(baseFolder, "Tekla House CIP Rebars.ifcZIP"));
			client.checkin(teklaHouseCIPColumns.getOid(), "Initial", deserializer.getOid(), false, true, new File(baseFolder, "Tekla House CIP Columns.ifcZIP"));
			client.checkin(teklaHouseArchitectural.getOid(), "Initial", deserializer.getOid(), false, true, new File(baseFolder, "Tekla House Architectural.ifczip"));
			client.checkin(teklaHouseMEPGround.getOid(), "Initial", deserializer.getOid(), false, true, new File(baseFolder, "Tekla House MEP, Ground.ifc"));
			client.checkin(teklaHouseMEP1.getOid(), "Initial", deserializer.getOid(), false, true, new File(baseFolder, "Tekla House MEP, 1st.ifc"));
			client.checkin(teklaHouseMEP2.getOid(), "Initial", deserializer.getOid(), false, true, new File(baseFolder, "Tekla House MEP, 2nd.ifc"));
			client.checkin(teklaHouseMEP3.getOid(), "Initial", deserializer.getOid(), false, true, new File(baseFolder, "Tekla House MEP, 3rd.ifc"));
			client.checkin(teklaHouseMEPRoof.getOid(), "Initial", deserializer.getOid(), false, true, new File(baseFolder, "Tekla House MEP, Roof.ifc"));

			mainProject = serviceInterface.getProjectByPoid(mainProject.getOid());
			SSerializerPluginConfiguration serializer = client.getBimsie1ServiceInterface().getSerializerByContentType("application/ifc");
			client.download(mainProject.getLastRevisionId(), serializer.getOid(), new File("output.ifc"));
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (PublicInterfaceNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}