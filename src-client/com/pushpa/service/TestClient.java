/**
 * 
 */
package com.pushpa.service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.namespace.QName;

/**
 * @author pushpa
 *
 */
;

public class TestClient {

	public static void main(String args[]) throws Exception {

		java.net.URL url = new java.net.URL("http://localhost:8080/WebServiceUsingMetro/hello?wsdl");

		QName q = new QName("http://service.pushpa.com/", "HelloImpl");
		/*
		 * 1.for the targetnamespace ending '/' is important,2.service name is
		 * from serverconfig <service tag name>
		 */

		javax.xml.ws.Service stubService = javax.xml.ws.Service.create(url, q);

		com.pushpa.service.HelloI stub = stubService.getPort(com.pushpa.service.HelloI.class);

		System.out.println(stub.sayHello());

	}

}
