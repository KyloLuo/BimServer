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
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.bimserver.shared.meta.SClass;
import org.bimserver.shared.meta.SDataBase;
import org.bimserver.shared.meta.SField;


@XmlRootElement
public class SServiceType implements SDataBase
{
	private long oid = -1;
	private int rid = 0;

	@XmlTransient
	private static SClass sClass;
	private java.lang.String name;
	private java.lang.String simpleName;
	private List<SServiceField> fields = new ArrayList<SServiceField>();
	private SServiceSimpleType simpleType;

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
		SServiceType.sClass = sClass;
	}

	public Object sGet(SField sField) {
		if (sField.getName().equals("name")) {
			return getName();
		}
		if (sField.getName().equals("simpleName")) {
			return getSimpleName();
		}
		if (sField.getName().equals("fields")) {
			return getFields();
		}
		if (sField.getName().equals("simpleType")) {
			return getSimpleType();
		}
		if (sField.getName().equals("oid")) {
			return getOid();
		}
		if (sField.getName().equals("rid")) {
			return getRid();
		}
		throw new RuntimeException("Field " + sField.getName() + " not found");
	}
	@SuppressWarnings("unchecked")

	public void sSet(SField sField, Object val) {
		if (sField.getName().equals("name")) {
			setName((String)val);
			return;
		}
		if (sField.getName().equals("simpleName")) {
			setSimpleName((String)val);
			return;
		}
		if (sField.getName().equals("fields")) {
			setFields((List<SServiceField>)val);
			return;
		}
		if (sField.getName().equals("simpleType")) {
			setSimpleType((SServiceSimpleType)val);
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
	
	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}
	
	public java.lang.String getSimpleName() {
		return simpleName;
	}

	public void setSimpleName(java.lang.String simpleName) {
		this.simpleName = simpleName;
	}
	
	public List<SServiceField> getFields() {
		return fields;
	}

	public void setFields(List<SServiceField> fields) {
		this.fields = fields;
	}
	
	public SServiceSimpleType getSimpleType() {
		return simpleType;
	}

	public void setSimpleType(SServiceSimpleType simpleType) {
		this.simpleType = simpleType;
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
		SServiceType other = (SServiceType) obj;
		if (oid != other.oid)
			return false;
		return true;
	}
}