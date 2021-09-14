package com.example.demo.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.example.demo.domain.vehicles.HybridVehicle;
import com.example.demo.service.HybridVehicleService;

@Path("/hybridvehicle")
@Component
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HybridVehicleController {

	private HybridVehicleService hybridVehicleService;

	public HybridVehicleController(HybridVehicleService hybridVehicleService) {
		this.hybridVehicleService = hybridVehicleService;
	}

	/**
	 * GET http://localhost:8888/api/hybridvehicle
	 */
	@GET
	public List<HybridVehicle> findAll() {
		return hybridVehicleService.findAll();
	}

	/**
	 * GET http://localhost:8888/api/hybridvehicle/1
	 */
	@GET
	@Path("{id}")
	public Response findOne(@PathParam("id") Long id) {
		HybridVehicle hybridVehicle = hybridVehicleService.findOne(id);
		if (hybridVehicle == null)
			return Response.status(Response.Status.NOT_FOUND).build();

		return Response.ok(hybridVehicle).build();
	}

	/**
	 * POST http://localhost:8888/api/hybridvehicle
	 */
	
	@POST // CREAR NUEVO
	public Response create(HybridVehicle hybridVehicle) {
		if (hybridVehicle.getId() != 0) 
			return Response.status(Response.Status.BAD_REQUEST).build();

		HybridVehicle result = hybridVehicleService.save(hybridVehicle);
		return Response.ok(result).build();
	}

	/**
	 * PUT http://localhost:8080/api/hybridvehicle
	 */
	@PUT // ACTUALIZAR
	public Response update(HybridVehicle hybridVehicle) {
		if (hybridVehicle.getId() == null || hybridVehicle.getId() == 0)
			return Response.status(Response.Status.BAD_REQUEST).build();

		HybridVehicle result = hybridVehicleService.save(hybridVehicle);
		return Response.ok(result).build();
	}

	/**
	 * DELETE http://localhost:8080/api/hybridvehicle/1
	 */
	@DELETE
	@Path("{id}")
	public Response deleteOne(@PathParam("id") Long id) {
		if (!hybridVehicleService.delete(id))
			return Response.status(Response.Status.NOT_FOUND).build();

		return Response.ok(Response.Status.OK).build();
	}

	/**
	 * DELETE http://localhost:8080/api/hybridvehicle
	 */
	@DELETE
	public Response deleteAll() {
		hybridVehicleService.deleteAll();
		return Response.ok(Response.Status.OK).build();
	}

}