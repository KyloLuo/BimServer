package org.bimserver.shared.jaxb;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.bimserver.interfaces.objects.SDataValue;

public class MapAdapter extends XmlAdapter<List<SDataValue>, Map<String, SDataValue>> {

	@Override
	public Map<String, SDataValue> unmarshal(List<SDataValue> list) throws Exception {
		Map<String, SDataValue> values = new HashMap<String, SDataValue>();
		for (SDataValue value : list) {
			values.put(value.getFieldName(), value);
		}
		return values;
	}

	@Override
	public List<SDataValue> marshal(Map<String, SDataValue> values) throws Exception {
		List<SDataValue> list = new ArrayList<SDataValue>();
		for (String key : values.keySet()) {
			list.add(values.get(key));
		}
		return list;
	}
}