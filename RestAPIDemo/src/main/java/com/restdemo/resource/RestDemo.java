package com.restdemo.resource;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("demo")

public class RestDemo {

	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@RolesAllowed("user")
	public String getdata() {
		
		return "Hello World..!";
	}
}
