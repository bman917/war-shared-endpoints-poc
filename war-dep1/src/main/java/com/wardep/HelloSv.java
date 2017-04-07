package com.wardep;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/greet")
public class HelloSv {

	@GET
	@Path("xml")
	@Produces({ MediaType.APPLICATION_XML })
	public Response xml() {

		Greeting greeting = new Greeting("Hello XML");

		return Response.status(200).entity(greeting).build();
	}

	@GET
	@Path("json")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response json() {

		Greeting greeting = new Greeting("Hello JSON");

		return Response.status(200).entity(greeting).build();
	}

}
