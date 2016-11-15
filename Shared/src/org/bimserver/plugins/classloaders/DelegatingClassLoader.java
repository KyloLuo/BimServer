package org.bimserver.plugins.classloaders;

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

import java.net.URL;
import java.util.LinkedHashSet;
import java.util.Set;

import org.bimserver.utils.StringUtils;

public class DelegatingClassLoader extends ClassLoader {
	private final Set<PublicFindClassClassLoader> jarClassLoaders = new LinkedHashSet<PublicFindClassClassLoader>();
	
	public DelegatingClassLoader(ClassLoader parentClassLoader) {
		super(parentClassLoader);
	}

	public void add(PublicFindClassClassLoader jarClassLoader) {
		jarClassLoaders.add(jarClassLoader);
	}

	@Override
	protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
		try {
			Class<?> loadClass = super.loadClass(name, resolve);
			if (loadClass != null) {
				return loadClass;
			}
		} catch (ClassNotFoundException e) {
		}
		for (PublicFindClassClassLoader jarClassLoader : jarClassLoaders) {
			if (jarClassLoader instanceof JarClassLoader) {
				Class<?> findClass = jarClassLoader.findClass(name);
				if (findClass != null) {
					return findClass;
				}
			} else {
				try {
					Class<?> findClass = jarClassLoader.loadClass(name);
					if (findClass != null) {
						return findClass;
					}
				} catch (ClassNotFoundException e) {
				}
			}
		}
		throw new ClassNotFoundException(name);
	}
	
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		for (PublicFindClassClassLoader jarClassLoader : jarClassLoaders) {
			try {
				Class<?> findClass = jarClassLoader.findClass(name);
				if (findClass != null) {
					return findClass;
				}
			} catch (ClassNotFoundException e) {
			}
		}
		throw new ClassNotFoundException(name);
	}

	@Override
	protected URL findResource(String name) {
		for (PublicFindClassClassLoader jarClassLoader : jarClassLoaders) {
			URL resource = jarClassLoader.findResource(name);
			if (resource != null) {
				return resource;
			}
		}
		return null;
	}

	public void dumpStructure(int indent) {
		System.out.print(StringUtils.gen("  ", indent));
		System.out.println("DelegatingClassLoader");
		ClassLoader parentLoader = getParent();
		if (parentLoader instanceof PublicFindClassClassLoader) {
			((PublicFindClassClassLoader)parentLoader).dumpStructure(indent + 1);
		}
		for (PublicFindClassClassLoader sub : jarClassLoaders) {
			sub.dumpStructure(indent + 1);
		}
	}
}