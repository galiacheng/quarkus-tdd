package com.redhat.tdd;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/tdd")
public class TDDResource {
	@Inject
	TDDService service;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Item> getAll() {
		return this.service.getAllItems();
	}
}
