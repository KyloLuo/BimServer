package org.bimserver.interfaces.objects;

/******************************************************************************
 * Copyright (C) 2009-2014  BIMserver.org
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
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.bimserver.shared.meta.SClass;
import org.bimserver.shared.meta.SDataBase;
import org.bimserver.shared.meta.SField;


@XmlRootElement
public class SExtendedData implements SDataBase
{
	private long oid = -1;
	private int rid = 0;

	@XmlTransient
	private static SClass sClass;
	private java.lang.String url;
	private long fileId = -1;
	private long size;
	private java.lang.String title;
	private java.util.Date added;
	private long userId = -1;
	private long schemaId = -1;
	private long revisionId = -1;
	private long projectId = -1;

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public int getRid() {
		return rid;
	}
	
	public void setRid(int rid) {
		this.rid = rid;
	}
	
	@XmlTransient
	public SClass getSClass() {
		return sClass;
	}
	
	public static void setSClass(SClass sClass) {
		SExtendedData.sClass = sClass;
	}

	public Object sGet(SField sField) {
		if (sField.getName().equals("url")) {
			return getUrl();
		}
		if (sField.getName().equals("fileId")) {
			return getFileId();
		}
		if (sField.getName().equals("size")) {
			return getSize();
		}
		if (sField.getName().equals("title")) {
			return getTitle();
		}
		if (sField.getName().equals("added")) {
			return getAdded();
		}
		if (sField.getName().equals("userId")) {
			return getUserId();
		}
		if (sField.getName().equals("schemaId")) {
			return getSchemaId();
		}
		if (sField.getName().equals("revisionId")) {
			return getRevisionId();
		}
		if (sField.getName().equals("projectId")) {
			return getProjectId();
		}
		if (sField.getName().equals("oid")) {
			return getOid();
		}
		if (sField.getName().equals("rid")) {
			return getRid();
		}
		throw new RuntimeException("Field " + sField.getName() + " not found");
	}

	public void sSet(SField sField, Object val) {
		if (sField.getName().equals("url")) {
			setUrl((String)val);
			return;
		}
		if (sField.getName().equals("fileId")) {
			setFileId((Long)val);
			return;
		}
		if (sField.getName().equals("size")) {
			setSize((Long)val);
			return;
		}
		if (sField.getName().equals("title")) {
			setTitle((String)val);
			return;
		}
		if (sField.getName().equals("added")) {
			setAdded((Date)val);
			return;
		}
		if (sField.getName().equals("userId")) {
			setUserId((Long)val);
			return;
		}
		if (sField.getName().equals("schemaId")) {
			setSchemaId((Long)val);
			return;
		}
		if (sField.getName().equals("revisionId")) {
			setRevisionId((Long)val);
			return;
		}
		if (sField.getName().equals("projectId")) {
			setProjectId((Long)val);
			return;
		}
		if (sField.getName().equals("oid")) {
			setOid((Long)val);
			return;
		}
		if (sField.getName().equals("rid")) {
			setRid((Integer)val);
			return;
		}
		throw new RuntimeException("Field " + sField.getName() + " not found");
	}
	
	public java.lang.String getUrl() {
		return url;
	}

	public void setUrl(java.lang.String url) {
		this.url = url;
	}
	
	public long getFileId() {
		return fileId;
	}

	public void setFileId(long fileId) {
		this.fileId = fileId;
	}
	
	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}
	
	public java.lang.String getTitle() {
		return title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}
	
	public java.util.Date getAdded() {
		return added;
	}

	public void setAdded(java.util.Date added) {
		this.added = added;
	}
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	public long getSchemaId() {
		return schemaId;
	}

	public void setSchemaId(long schemaId) {
		this.schemaId = schemaId;
	}
	
	public long getRevisionId() {
		return revisionId;
	}

	public void setRevisionId(long revisionId) {
		this.revisionId = revisionId;
	}
	
	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (oid ^ (oid >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SExtendedData other = (SExtendedData) obj;
		if (oid != other.oid)
			return false;
		return true;
	}
}