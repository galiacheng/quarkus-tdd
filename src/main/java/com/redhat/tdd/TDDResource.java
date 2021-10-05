package com.redhat.tdd;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/tdd")
public class TDDResource {
	@Inject
	TDDService service;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Item> getAll() {
		return this.service.getAllItems();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response getOne(@PathParam("id") Long id) {
		return this.service.getItem(id)
			.map(item -> Response.ok(item).build())
			.orElseGet(() -> Response.status(Status.NOT_FOUND).build());
	}
}
