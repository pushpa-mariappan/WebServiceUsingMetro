/**
 * 
 */
package com.pushpa.service;

import javax.jws.WebService;

/**
 * @author pushpa
 *
 */
@WebService(endpointInterface = "com.pushpa.service.HelloI", serviceName = "HelloImpl")
public class HelloImpl implements HelloI {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pushpa.service.HelloI#sayHello()
	 */
	@Override
	public String sayHello() {

		return "Hello!!";
		
	}

}