package com.cosighter.rest.adapter;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JSONRequired;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@JaxrsResource
@JSONRequired
@Produces(MediaType.APPLICATION_JSON)
@Path("api")
@Component(name = "com.cosighter.rest", service = CosighterRestAdapter.class)
public class CosighterRestAdapter {
	private Logger logger = LoggerFactory.getLogger(CosighterRestAdapter.class);
	
	@interface Config {
		public String deneme();
	}
	
	@Activate
	void activate(Config config) {
		logger.info(config.deneme());
	}

	@GET
	@Path("resourcea")
	public String getResource1() {
		return "Resource1";
	}
	
	@GET
	@Path("capacity/deneme")
	public String getCapacity() {
		return "Capacity deneme";
	}
	
}
