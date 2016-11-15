package org.bimserver.pb.server;

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

import org.bimserver.shared.interfaces.PublicInterface;
import org.bimserver.shared.interfaces.ServiceInterface;
import org.bimserver.shared.meta.SServicesMap;
import org.bimserver.shared.pb.ProtocolBuffersMetaData;
import org.bimserver.shared.pb.ReflectiveRpcChannel;

public abstract class ServiceReflectiveRpcChannel extends ReflectiveRpcChannel {

	public ServiceReflectiveRpcChannel(PublicInterface serviceFactory, ProtocolBuffersMetaData protocolBuffersMetaData, SServicesMap servicesMap) {
		super(ServiceInterface.class, serviceFactory, protocolBuffersMetaData, servicesMap);
	}
}