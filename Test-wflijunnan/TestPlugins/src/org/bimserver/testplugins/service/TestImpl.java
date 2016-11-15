package org.bimserver.testplugins.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import org.bimserver.shared.interfaces.TestInterface;

@WebService(name = "TestInterface", targetNamespace="org.bimserver")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public class TestImpl implements TestInterface{
	@WebMethod(action = "getTest")
	public int test(){
		return 516;
	}
}
