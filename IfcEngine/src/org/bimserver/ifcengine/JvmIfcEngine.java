package org.bimserver.ifcengine;

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
 * 
 * BIMserver software uses the IFC Engine DLL library build.
 * This binary Engine DLL is NOT open source. The IFC Engine DLL is a closed source product owned by the Netherlands Organisation for Applied Scientifc Research TNO.
 * The latest versions are available for download from http://ifcengine.com.
 * In case of none commercial use there is no license fee and redistribution of the binary is allowed as long as clearly mentioned that the IFC Engine DLL is used. The BIMserver.org software is non-commercial so users of the BIMserver software can use it free of charge.
 * Within the Open Source BIMserver software there is one exception to the normal conditions: A special version of the IFC Engine DLL is used that includes Clashdetection functionality, this version is not commercially available. For more information, please contact the owner at info@ifcengine.com
 *****************************************************************************/

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import org.apache.commons.io.IOUtils;
import org.bimserver.ifcengine.jvm.IfcEngineServer;
import org.bimserver.plugins.renderengine.RenderEngine;
import org.bimserver.plugins.renderengine.RenderEngineException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JvmIfcEngine implements RenderEngine {
	private static final Logger LOGGER = LoggerFactory.getLogger(JvmIfcEngine.class);
	private Process process;
	private DataInputStream in;
	private DataOutputStream out;
	private InputStream err;
	private final File schemaFile;
	private final File nativeBaseDir;
	private boolean useSecondJvm = true;
	private final String classPath;
	private final File tempDir;
	private volatile RenderEngineException lastException;

	public JvmIfcEngine(File schemaFile, File nativeBaseDir, File tempDir, String classPath) throws RenderEngineException {
		this.schemaFile = schemaFile;
		this.nativeBaseDir = nativeBaseDir;
		this.tempDir = tempDir;
		this.classPath = classPath;
	}

	public void init() throws RenderEngineException {
		if (useSecondJvm) {
			startJvm();
		} else {
			startLocal();
		}
	}
	
	private void startLocal() {
		try {
			PipedInputStream pipedInputStream = new PipedInputStream();
			PipedOutputStream pipedOutputStream = new PipedOutputStream(pipedInputStream);
			IfcEngineServer ifcEngineServer = new IfcEngineServer(schemaFile.getAbsolutePath(), pipedInputStream, pipedOutputStream, null);
			in = new DataInputStream(new BufferedInputStream(pipedInputStream));
			out = new DataOutputStream(new BufferedOutputStream(pipedOutputStream));
			ifcEngineServer.start();
		} catch (IOException e) {
			LOGGER.error("", e);
		}
	}

	public void startJvm() throws RenderEngineException {
		try {
			if (!tempDir.exists()) {
				tempDir.mkdir();
			}
			StringBuilder command = new StringBuilder("java");
			if (nativeBaseDir.toString().contains(" ")) {
				command.append(" -Djna.library.path=\"" + nativeBaseDir.toString() + "\"");
			} else {
				command.append(" -Djna.library.path=" + nativeBaseDir.toString());
			}
			if (tempDir.getAbsolutePath().toString().contains(" ")) {
				command.append(" -Djava.io.tmpdir=\"" + tempDir.getAbsolutePath().toString() + "\"");
			} else {
				command.append(" -Djava.io.tmpdir=" + tempDir.getAbsolutePath().toString());
			}
			command.append(" -classpath ");
			command.append("\"");
			if (classPath != null) {
				File file = new File(classPath);
				if (file.isDirectory()) {
					for (File subFile : file.listFiles()) {
						if (subFile.getName().endsWith(".jar")) {
							command.append(subFile.getAbsolutePath() + File.pathSeparator);
						}
					}
				}
				command.append(classPath + File.pathSeparator);
			}
			command.append("\"");
			String mem = "512m";
			if (Runtime.getRuntime().maxMemory() == Long.MAX_VALUE) {
			} else {
				int megs = (int) (Runtime.getRuntime().maxMemory() / 2000000);
				if (megs > 1024) {
					megs = 1024;
				}
				mem = String.valueOf(megs + "m");
			}
			command.append(" -Xmx" + mem);
			command.append(" -Xms" + mem);
			
			command.append(" org.bimserver.ifcengine.jvm.IfcEngineServer");
			if (schemaFile.getAbsolutePath().contains(" ")) {
				command.append(" \"" + schemaFile.getAbsolutePath() + "\"");
			} else {
				command.append(" " + schemaFile.getAbsolutePath());
			}
//			LOGGER.info(command.toString());
			process = Runtime.getRuntime().exec(command.toString());
			in = new DataInputStream(new BufferedInputStream(process.getInputStream()));
			out = new DataOutputStream(new BufferedOutputStream(process.getOutputStream()));
			err = process.getErrorStream();
			startErrorHandler();
			Thread thread = new Thread("JvmIfcEngine"){
				@Override
				public void run() {
					int result;
					try {
						result = process.waitFor();
						if (result != 0) {
							lastException = new RenderEngineException("Process ended with errorcode: " + result);
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			thread.start();
		} catch (Exception e) {
			throw new RenderEngineException(e);
		}
	}
	
	private void startErrorHandler() {
		Runnable runnable = new Runnable(){
			@Override
			public void run() {
				byte[] buffer = new byte[1024];
				int red;
				try {
					red = err.read(buffer);
					while (red != -1) {
						LOGGER.error(new String(buffer, 0, red));
						red = err.read(buffer);
					}
				} catch (IOException e) {
					LOGGER.error("", e);
				}
			}};
		Thread thread = new Thread(runnable, "FailSafeIfcEngine ErrorHandler");
		thread.start();
	}

	public synchronized JvmIfcEngineModel openModel(File ifcFile) throws RenderEngineException {
		checkRunning();
		writeCommand(Command.OPEN_MODEL);
		writeUTF(ifcFile.getAbsolutePath());
		flush();
		int modelId = readInt();
		return new JvmIfcEngineModel(this, modelId);
	}

	public synchronized JvmIfcEngineModel openModel(InputStream inputStream, int size) throws RenderEngineException {
		checkRunning();
		writeCommand(Command.OPEN_MODEL_STREAMING);
		try {
			out.writeInt(size);
			IOUtils.copy(inputStream, out);
		} catch (IOException e) {
			throw new RenderEngineException(e);
		}
		flush();
		int modelId = readInt();
		return new JvmIfcEngineModel(this, modelId);
	}

	public synchronized JvmIfcEngineModel openModel(InputStream inputStream) throws RenderEngineException {
		checkRunning();
		writeCommand(Command.OPEN_MODEL_STREAMING_PARTS);
		try {
			byte[] buffer = new byte[4096];
			int read = inputStream.read(buffer, 0, 4096);
			while (read != -1) {
				out.writeInt(read);
				out.write(buffer, 0, read);
				read = inputStream.read(buffer, 0, 4096);
			}
			out.writeInt(-1);
		} catch (IOException e) {
			throw new RenderEngineException(e);
		}
		flush();
		int modelId = readInt();
		return new JvmIfcEngineModel(this, modelId);
	}
	
	private void checkRunning() throws RenderEngineException {
		if (lastException != null) {
			throw lastException;
		}
	}
	
	public int readInt() throws RenderEngineException {
		checkRunning();
		try {
			return in.readInt();
		} catch (IOException e) {
			throw new RenderEngineException("Unknown IFC Engine error");
		}
	}

	public void flush() throws RenderEngineException {
		checkRunning();
		try {
			out.flush();
		} catch (IOException e) {
//			throw new IfcEngineException("Unknown IFC Engine error");
		}
	}

	void writeUTF(String value) throws RenderEngineException {
		checkRunning();
		try {
			out.writeUTF(value);
		} catch (IOException e) {
			throw new RenderEngineException("Unknown IFC Engine error");
		}
	}

	public void writeCommand(Command command) throws RenderEngineException {
		checkRunning();
		try {
			out.writeByte(command.getId());
		} catch (IOException e) {
			throw new RenderEngineException("Unknown IFC Engine error", e);
		}
	}

	public synchronized void close() throws RenderEngineException {
		checkRunning();
		if (process != null) {
			try {
				writeCommand(Command.CLOSE);
				flush();
			} catch (RenderEngineException e) {
				LOGGER.error("", e);
			}
			process.destroy();
		}
	}

	public void writeInt(int value) throws RenderEngineException {
		checkRunning();
		try {
			out.writeInt(value);
		} catch (IOException e) {
			throw new RenderEngineException("Unknown IFC Engine error");
		}
	}

	public void writeBoolean(boolean value) throws RenderEngineException {
		checkRunning();
		try {
			out.writeBoolean(value);
		} catch (IOException e) {
			throw new RenderEngineException("Unknown IFC Engine error");
		}
	}

	public float readFloat() throws RenderEngineException {
		checkRunning();
		try {
			return in.readFloat();
		} catch (IOException e) {
			throw new RenderEngineException("Unknown IFC Engine error");
		}
	}

	public String readString() throws RenderEngineException {
		checkRunning();
		try {
			return in.readUTF();
		} catch (IOException e) {
			throw new RenderEngineException("Unknown IFC Engine error");
		}
	}

	public void writeDouble(double d) throws RenderEngineException {
		checkRunning();
		try {
			out.writeDouble(d);
		} catch (IOException e) {
			throw new RenderEngineException("Unknown IFC Engine error");
		}
	}

	public long readLong() throws RenderEngineException {
		checkRunning();
		try {
			return in.readLong();
		} catch (IOException e) {
			throw new RenderEngineException("Unknown IFC Engine error");
		}
	}

	public JvmIfcEngineModel openModel(byte[] bytes) throws RenderEngineException {
		checkRunning();
		return openModel(new ByteArrayInputStream(bytes), bytes.length);
	}

	public void writeLong(long value) throws RenderEngineException {
		checkRunning();
		try {
			out.writeLong(value);
		} catch (IOException e) {
			throw new RenderEngineException("Unknown IFC Engine error");
		}
	}
}