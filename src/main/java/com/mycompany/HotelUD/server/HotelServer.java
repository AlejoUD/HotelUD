package com.mycompany.HotelUD.server;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mycompany.HotelUD.classes.User;
import com.mycompany.HotelUD.classes.Worker;

import com.mycompany.HotelUD.server.HotelCollector;

@Path("/server")
@Produces(MediaType.APPLICATION_JSON)
public class HotelServer {
	
	private HotelCollector hotelCollector;

	public HotelServer() {
		hotelCollector = new HotelCollector();
	}

	@POST
	@Path("/worker")
	public Response addWorker(Worker worker) {
		hotelCollector.addWorker(worker);
		return Response.ok().build();
	}

	@GET //Leer información
	@Path("/worker")
	public Response getWorkers() {

		return Response.ok(hotelCollector.getWorkers()).build();
	}

	@POST
	@Path("/user")
	public Response addUser(User user) {
		hotelCollector.addUser(user);
		return Response.ok().build();
	}

	@GET
	@Path("/user")
	public Response getUsers() {

		return Response.ok(hotelCollector.getUsers()).build();
	}

}