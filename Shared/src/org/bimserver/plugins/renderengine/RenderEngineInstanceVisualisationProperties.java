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

public class RenderEngineInstanceVisualisationProperties {
	private final float[] vertices;
	private final int[] indices;
	private final float[] normals;
	private int[] materialIndices;
	private float[] materials;

	public RenderEngineInstanceVisualisationProperties(int[] indices, float[] vertices, float[] normals, int[] materialIndices, float[] materials) {
		this.indices = indices;
		this.vertices = vertices;
		this.normals = normals;
		this.materialIndices = materialIndices;
		this.materials = materials;
	}
	
	public float[] getVertices() {
		return vertices;
	}

	public int[] getIndices() {
		return indices;
	}

	public float[] getMaterials() {
		return materials;
	}

	public int[] getMaterialIndices() {
		return materialIndices;
	}

	public float[] getNormals() {
		return normals;
	}
}