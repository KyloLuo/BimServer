package org.bimserver.test.framework;

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
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.bimserver.test.framework.actions.Action;
import org.bimserver.test.framework.actions.ActionResults;

import com.google.common.base.Charsets;

public class TestResults {
	private PrintWriter out;
	private int rowNr;

	public TestResults() {
		try {
			out = new PrintWriter(new File("results.html"));
			File f = new File("static/header.html");
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			if (f.exists()) {
				IOUtils.copy(new FileInputStream(f), byteArrayOutputStream);
			} else {
				InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream("static/header.html");
				IOUtils.copy(resourceAsStream, byteArrayOutputStream);
			}
			out.write(new String(byteArrayOutputStream.toByteArray(), Charsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}
		startTable("Virtual User", "Action", "Result", "Message");
	}

	public synchronized void addRow(ActionResults actionResults, VirtualUser virtualUser, Action action, String... values) {
		String type = actionResults.getType();
		String className = action == null ? "Unknown" : action.getClass().getSimpleName();
		out.println("<tr user=\"" + virtualUser.getName() + "\" action=\"" + className + "\" type=\"" + type + "\">");
		out.println("<td>" + rowNr + ".</td>");
		out.println("<td>" + virtualUser.getName() + "</td>");
		out.println("<td>" + className + "</td>");
		out.println("<td class=\"type_" + type + "\">" + type + "</td>");
		out.println("<td>" + actionResults.getText() + "</td>");
		out.println("</tr>");
		out.flush();
		rowNr++;
	}
	
	public void write(String text) {
		out.write(text);
	}

	public void startTable(String... headers) {
		out.println("<table>");
		out.println("<tr>");
		out.println("<th>#</th>");
		for (String header : headers) {
			out.println("<th>" + header + "</td>");
		}
		out.println("</tr>");
	}
	
	public void endTable() {
		out.println("</table>");
	}

	public void close() {
		out.close();
	}
}