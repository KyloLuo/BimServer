package org.bimserver.longaction;

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

import javax.activation.DataHandler;
import javax.activation.DataSource;

import org.bimserver.cache.DiskCacheManager;

public class CachingDataHandler extends DataHandler {

	private DownloadParameters downloadParameters;
	private DiskCacheManager diskCacheManager;
	private DataSource dataSource;

	public CachingDataHandler(DiskCacheManager diskCacheManager, DownloadParameters downloadParameters) {
		super((DataSource)null);
		this.diskCacheManager = diskCacheManager;
		this.downloadParameters = downloadParameters;
	}
	
	@Override
	public DataSource getDataSource() {
		if (dataSource == null) {
			dataSource = diskCacheManager.get(downloadParameters);
		}
		return dataSource;
	}
}