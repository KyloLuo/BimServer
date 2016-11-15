package org.bimserver.shared.interfaces.bimsie1;

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

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import org.bimserver.interfaces.objects.SLongActionState;
import org.bimserver.shared.exceptions.ServerException;
import org.bimserver.shared.exceptions.UserException;
import org.bimserver.shared.interfaces.PublicInterface;

@WebService(name = "Bimsie1NotificationInterface", targetNamespace="org.buildingsmart.bimsie1")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public interface Bimsie1NotificationInterface extends PublicInterface {

	@WebMethod(action = "newRevision")
	void newRevision(
		@WebParam(name = "poid", partName = "progress.poid") Long poid,
		@WebParam(name = "roid", partName = "progress.roid") Long roid) throws UserException, ServerException;

	@WebMethod(action = "newProgressOnProjectTopic")
	void newProgressOnProjectTopic(
		@WebParam(name = "poid", partName = "newProgressOnProjectTopic.poid") Long poid,
		@WebParam(name = "topicId", partName = "newProgressOnProjectTopic.topicId") Long topicId) throws UserException, ServerException;

	@WebMethod(action = "closedProgressOnProjectTopic")
	void closedProgressOnProjectTopic(
		@WebParam(name = "poid", partName = "closedProgressOnProjectTopic.poid") Long poid,
		@WebParam(name = "topicId", partName = "closedProgressOnProjectTopic.topicId") Long topicId) throws UserException, ServerException;

	@WebMethod(action = "newProgressOnServerTopic")
	void newProgressOnServerTopic(
		@WebParam(name = "topicId", partName = "newProgressOnServerTopic.topicId") Long topicId) throws UserException, ServerException;
	
	@WebMethod(action = "closedProgressOnServerTopic")
	void closedProgressOnServerTopic(
		@WebParam(name = "topicId", partName = "closedProgressOnServerTopic.topicId") Long topicId) throws UserException, ServerException;
	
	@WebMethod(action = "newProgressOnRevisionTopic")
	void newProgressOnRevisionTopic(
		@WebParam(name = "poid", partName = "newProgressOnRevisionTopic.poid") Long poid,
		@WebParam(name = "roid", partName = "newProgressOnRevisionTopic.roid") Long roid,
		@WebParam(name = "topicId", partName = "newProgressOnRevisionTopic.topicId") Long topicId) throws UserException, ServerException;

	@WebMethod(action = "closedProgressOnRevisionTopic")
	void closedProgressOnRevisionTopic(
		@WebParam(name = "poid", partName = "closedProgressOnRevisionTopic.poid") Long poid,
		@WebParam(name = "roid", partName = "closedProgressOnRevisionTopic.roid") Long roid,
		@WebParam(name = "topicId", partName = "closedProgressOnRevisionTopic.topicId") Long topicId) throws UserException, ServerException;
	
	@WebMethod(action = "newProgressTopic")
	void newProgressTopic(
		@WebParam(name = "topicId", partName = "newProgressTopic.topicId") Long topicId) throws UserException, ServerException;
	
	@WebMethod(action = "newExtendedData")
	void newExtendedData(
		@WebParam(name = "roid", partName = "newExtendedData.roid") Long roid,
		@WebParam(name = "edid", partName = "newExtendedData.edid") Long edid) throws UserException, ServerException;
	
	@WebMethod(action = "newProject")
	void newProject(
		@WebParam(name = "poid", partName = "newProject.poid") Long poid) throws UserException, ServerException;

	@WebMethod(action = "newUser")
	void newUser(
		@WebParam(name = "uoid", partName = "newUser.uoid") Long uoid) throws UserException, ServerException;
	
	@WebMethod(action = "progress")
	void progress(
		@WebParam(name = "topicId", partName = "progress.topicId") Long topicId, 
		@WebParam(name = "state", partName = "progress.state") SLongActionState state) throws UserException, ServerException;
}