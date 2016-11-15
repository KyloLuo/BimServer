package org.bimserver.version;

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
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;

import org.bimserver.interfaces.objects.SVersion;
import org.bimserver.plugins.ResourceFetcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VersionChecker {
	private static final Logger LOGGER = LoggerFactory.getLogger(VersionChecker.class);
	private GregorianCalendar lastCheck;
	private SVersion onlineVersion;
	private SVersion localVersion;

	public static void main(String[] args) {
		SVersion version = new SVersion();
		version.setMajor(1);
		version.setMinor(1);
		version.setRevision(0);
		version.setDate(new Date());
		version.setSupportEmail("support@bimserver.org");
		version.setDownloadUrl("http://download.bimserver.org");
		version.setSupportUrl("http://support.bimserver.org");
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(SVersion.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.marshal(version, new File("version.xml"));
		} catch (JAXBException e) {
			LOGGER.error("", e);
		}
	}
	
	public VersionChecker(ResourceFetcher resourceFetcher) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(SVersion.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			localVersion = (SVersion) unmarshaller.unmarshal(resourceFetcher.getResource("version.xml"));
		} catch (JAXBException e) {
			LOGGER.error("", e);
		}
	}

	public synchronized SVersion getOnlineVersion() {
		if (lastCheck == null || lastCheck.before(getReferenceDate())) {
			LOGGER.info("Fetching online version info");
			try {
				URL url = new URL("http://www.bimserver.org/version/versionv2.xml");
				JAXBContext jaxbContext = JAXBContext.newInstance(SVersion.class);
				Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
				onlineVersion = (SVersion) unmarshaller.unmarshal(url);
				lastCheck = new GregorianCalendar();
				return onlineVersion;
			} catch (UnmarshalException e) {
				LOGGER.error("", e);
			} catch (MalformedURLException e) {
				LOGGER.error("", e);
			} catch (JAXBException e) {
				LOGGER.error("", e);
			}
			if (onlineVersion == null) {
				onlineVersion = new SVersion();
				onlineVersion.setDownloadUrl("unknown");
				onlineVersion.setMajor(-1);
				onlineVersion.setMinor(-1);
				onlineVersion.setRevision(-1);
				onlineVersion.setSupportEmail("unknown");
				onlineVersion.setSupportUrl("unknown");
				onlineVersion.setDate(new Date(0));
				lastCheck = new GregorianCalendar();
			}
		}
		return onlineVersion;
	}

	private GregorianCalendar getReferenceDate() {
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.add(Calendar.HOUR_OF_DAY, -1);
		return gregorianCalendar;
	}

	public SVersion getLocalVersion() {
		return localVersion;
	}

	public boolean updateNeeded() {
		SVersion localVersion = getLocalVersion();
		SVersion onlineVersion = getOnlineVersion();
		if (localVersion.getMajor().compareTo(onlineVersion.getMajor()) < 0) {
			return true;
		} else if (localVersion.getMajor() == onlineVersion.getMajor()) {
			if (localVersion.getMinor().compareTo(onlineVersion.getMinor()) > 0) {
				return true;
			} else if (localVersion.getMinor().equals(onlineVersion.getMinor())) {
				if (onlineVersion.getRevision() != null && localVersion.getRevision() < onlineVersion.getRevision()) {
					return true;
				}
			}
		}
		return false;
	}
}