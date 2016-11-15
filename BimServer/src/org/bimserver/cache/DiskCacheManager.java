package org.bimserver.cache;

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
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.activation.DataSource;

import org.bimserver.BimServer;
import org.bimserver.longaction.DownloadParameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiskCacheManager {

	private static final Logger LOGGER = LoggerFactory.getLogger(DiskCacheManager.class);
	private final File cacheDir;
	private final BimServer bimServer;
	private final Set<String> cachedFileNames = new HashSet<String>();
	private final Map<DownloadParameters, DiskCacheOutputStream> busyCaching = new HashMap<DownloadParameters, DiskCacheOutputStream>();

	public DiskCacheManager(BimServer bimServer, File cacheDir) {
		this.bimServer = bimServer;
		this.cacheDir = cacheDir;
		if (!cacheDir.exists()) {
			cacheDir.mkdir();
		}
		for (File file : this.cacheDir.listFiles()) {
			if (file.getName().endsWith(".__tmp")) {
				file.delete();
			} else {
				cachedFileNames.add(file.getName());
			}
		}
	}
	
	public boolean contains(DownloadParameters downloadParameters) {
		if (isEnabled()) {
			synchronized (busyCaching) {
				if (busyCaching.containsKey(downloadParameters)) {
					return true;
				}
			}
			synchronized (cachedFileNames) {
				return cachedFileNames.contains(downloadParameters.getId());
			}
		} else {
			return false;
		}
	}
	
	public boolean isEnabled() {
		return bimServer.getServerSettingsCache().getServerSettings().getCacheOutputFiles();
	}

	public DataSource get(DownloadParameters downloadParameters) {
		if (isEnabled()) {
			DiskCacheOutputStream diskCacheOutputStream = null;
			synchronized (busyCaching) {
				diskCacheOutputStream = busyCaching.get(downloadParameters);
			}
			if (diskCacheOutputStream != null) {
				try {
					LOGGER.info("Waiting for " + downloadParameters.getFileName());
					diskCacheOutputStream.waitForFinish();
				} catch (InterruptedException e) {
					LOGGER.error("", e);
				}
			}
			File file = new File(cacheDir, downloadParameters.getId());
			if (!file.exists()) {
				LOGGER.error("File " + file.getName() + " not found in cache");
			} else {
				LOGGER.info("Reading from cache " + downloadParameters.getFileName());
				FileInputStreamDataSource fileInputStreamDataSource = new FileInputStreamDataSource(file);
				fileInputStreamDataSource.setName(downloadParameters.getFileNameWithoutExtension());
				return fileInputStreamDataSource;
			}
		}
		return null;
	}

	public DiskCacheOutputStream startCaching(DownloadParameters downloadParameters) {
		try {
			LOGGER.info("Start caching " + downloadParameters.getFileName());
			DiskCacheOutputStream out = new DiskCacheOutputStream(this, new File(cacheDir, downloadParameters.getId()), downloadParameters);
			synchronized (busyCaching) {
				busyCaching.put(downloadParameters, out);
			}
			return out;
		} catch (FileNotFoundException e) {
			LOGGER.error("", e);
		}
		return null;
	}

	public synchronized Integer cleanup() {
		int removed = 0;
		for (File file : cacheDir.listFiles()) {
			if (file.delete()) {
				removed++;
			}
		}
		cachedFileNames.clear();
		return removed;
	}

	public void doneGenerating(DiskCacheOutputStream diskCacheOutputStream) {
		synchronized (busyCaching) {
			LOGGER.info("Done caching " + diskCacheOutputStream.getDownloadParameters().getFileName());
			busyCaching.remove(diskCacheOutputStream.getDownloadParameters());
			cachedFileNames.add(diskCacheOutputStream.getDownloadParameters().getId());
		}
	}

	public void remove(DiskCacheOutputStream diskCacheOutputStream) {
		LOGGER.info("Removing cache " + diskCacheOutputStream.getDownloadParameters().getFileName());
		cachedFileNames.remove(diskCacheOutputStream.getDownloadParameters().getId());
		synchronized (busyCaching) {
			busyCaching.remove(diskCacheOutputStream.getDownloadParameters());
		}
	}
}