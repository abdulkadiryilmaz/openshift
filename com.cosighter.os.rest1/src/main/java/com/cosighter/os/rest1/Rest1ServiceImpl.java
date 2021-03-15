package com.cosighter.os.rest1;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JSONRequired;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@JaxrsResource
@JSONRequired
@Produces(MediaType.APPLICATION_JSON)
@Path("api")
@Component(name = "com.cosighter.rest", service = Rest1ServiceImpl.class)
public class Rest1ServiceImpl {

	private Logger logger = LoggerFactory.getLogger(Rest1ServiceImpl.class);
	
	@GET
	@Path("resource1")
	public String getResource1() {
		logger.info("resource1 called!!!");
		return "Resource1";
	}
	
}
