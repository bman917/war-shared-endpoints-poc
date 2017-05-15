package com.hello.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.hello.interfaces.Greeting;
import com.hello.interfaces.HelloSvInterface;

@Path("/greet")
public class HelloSvRest {
	
	@Autowired
	HelloSvInterface helloSv;
	
	public HelloSvRest(HelloSvInterface impl)
	{
		this.helloSv = impl;
	}

	@GET
	@Path("xml")
	@Produces({ MediaType.APPLICATION_XML })
	public Response xml() {

		Greeting greeting = helloSv.xml();
		return Response.status(200).entity(greeting).build();
	}

	@GET
	@Path("json")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response json() {

		Greeting greeting = helloSv.json();
		return Response.status(200).entity(greeting).build();
	}
}
