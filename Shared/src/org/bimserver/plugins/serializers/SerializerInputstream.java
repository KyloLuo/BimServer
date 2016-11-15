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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SerializerInputstream extends InputStream {
	private static final Logger LOGGER = LoggerFactory.getLogger(SerializerInputstream.class);
	
	final ByteArrayOutputStream out = new ByteArrayOutputStream();
	int pos = 0;
	byte[] buffer;

	private EmfSerializer emfSerializer;

	public SerializerInputstream(EmfSerializer emfSerializer) {
		this.emfSerializer = emfSerializer;
	}
	
	public EmfSerializer getEmfSerializer() {
		return emfSerializer;
	}
	
	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		int read = 0;
		if (buffer != null && pos < buffer.length) {
			int nrToCopy = Math.min(buffer.length - pos, len);
			System.arraycopy(buffer, pos, b, off, nrToCopy);
			pos += nrToCopy;
			read += nrToCopy;
		}
		while (read < len) {
			out.reset();
			buffer = null;
			pos = 0;
			try {
				boolean write = emfSerializer.write(out, null);
				if (write) {
					buffer = out.toByteArray();
					if (buffer.length > 0) {
						int nrToCopy = Math.min(buffer.length, len - read);
						System.arraycopy(buffer, pos, b, off + read, nrToCopy);
						pos += nrToCopy;
						read += nrToCopy;
					}
				} else {
					if (read != 0) {
						return read;
					} else {
						return -1;
					}
				}
			} catch (SerializerException e) {
				LOGGER.error("", e);
			}
		}
		return read;
	}

	@Override
	public int read() throws IOException {
		try {
			if (buffer != null && pos < buffer.length) {
				return buffer[pos++];
			} else {
				buffer = null;
				while (buffer == null) {
					out.reset();
					boolean write = emfSerializer.write(out, null);
					byte[] newBuffer = out.toByteArray();
					if (newBuffer.length > 0) {
						buffer = newBuffer;
						pos = 1;
						return buffer[0];
					}
					if (!write) {
						return -1;
					}
				}
			}
		} catch (SerializerException e) {
			LOGGER.error("", e);
		}
		return 0;
	}
}