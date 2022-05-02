package com.mycompany.HotelUD.server;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mycompany.HotelUD.classes.User;
import com.mycompany.HotelUD.classes.Worker;
@Path("/server")
@Produces(MediaType.APPLICATION_JSON)
public class Server {
	private Server servidor;

	public Server() {
		servidor = new Server();
	}

	@POST //Añadir un recurso
	@Path("/worker")
	public Response addWorker(Worker worker) {
		servidor.addWorker(worker);
		return Response.ok().build();
	}

	@GET //Leer información
	@Path("/worker")
	public Response getWorkers() {

		return Response.ok(servidor.getWorkers()).build();
	}

	@POST
	@Path("/user")
	public Response addUser(User user) {
		servidor.addUser(user);
		return Response.ok().build();
	}

	@GET
	@Path("/user")
	public Response getUsers() {

		return Response.ok(servidor.getUsers()).build();
	}

}