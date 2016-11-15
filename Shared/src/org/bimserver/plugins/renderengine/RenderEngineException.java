package org.bimserver.plugins.renderengine;

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

import java.io.IOException;

import org.bimserver.plugins.PluginException;

public class RenderEngineException extends PluginException {
	private static final long serialVersionUID = 4485210826117178542L;

	public RenderEngineException(String message) {
		super(message);
	}
	
	public RenderEngineException(Exception e) {
		super(e);
	}

	public RenderEngineException(String message, IOException e) {
		super(message, e);
	}
}