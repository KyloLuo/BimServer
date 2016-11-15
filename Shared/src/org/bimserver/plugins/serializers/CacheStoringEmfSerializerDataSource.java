package org.bimserver.plugins.serializers;

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
import java.io.OutputStream;

import org.bimserver.utils.MultiplexingOutputStream;

public class CacheStoringEmfSerializerDataSource extends EmfSerializerDataSource {

	private RemovableFileOutputStream diskCacheOutputStream;

	public CacheStoringEmfSerializerDataSource(Serializer serializer, RemovableFileOutputStream diskCacheOutputStream) {
		super(serializer);
		this.diskCacheOutputStream = diskCacheOutputStream;
	}
	
	@Override
	public void writeToOutputStream(OutputStream outputStream, ProgressReporter progressReporter) throws SerializerException, IOException {
		try {
			super.writeToOutputStream(new MultiplexingOutputStream(outputStream, diskCacheOutputStream), progressReporter);
		} catch (Exception e) {
			diskCacheOutputStream.remove();
			throw e;
		}
	}
}