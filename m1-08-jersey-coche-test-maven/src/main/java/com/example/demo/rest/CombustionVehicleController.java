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

import com.example.demo.domain.vehicles.CombustionVehicle;
import com.example.demo.service.CombustionVehicleService;

@Path("/combustionvehicle")
@Component
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CombustionVehicleController {

	private CombustionVehicleService combustionVehicleService;

	public CombustionVehicleController(CombustionVehicleService combustionVehicleService) {
		this.combustionVehicleService = combustionVehicleService;
	}

	/**
	 * GET http://localhost:8080/api/combustionvehicle
	 */
	@GET
	public List<CombustionVehicle> findAll() {
		return combustionVehicleService.findAll();
	}

	/**
	 * GET http://localhost:8080/api/combustionvehicle/1
	 */
	@GET
	@Path("{id}")
	public Response findOne(@PathParam("id") Long id) {
		CombustionVehicle combustionVehicle = combustionVehicleService.findOne(id);
		if (combustionVehicle == null)
			return Response.status(Response.Status.NOT_FOUND).build();

		return Response.ok(combustionVehicle).build();
	}

	/**
	 * POST http://localhost:8080/api/combustionvehicle
	 */
	@POST // CREAR NUEVO
	public Response create(CombustionVehicle combustionVehicle) {
		if (combustionVehicle.getId() != 0) 
			return Response.status(Response.Status.BAD_REQUEST).build();

		CombustionVehicle result = combustionVehicleService.save(combustionVehicle);
		return Response.ok(result).build();
	}

	/**
	 * PUT http://localhost:8080/api/combustionvehicle
	 */
	@PUT // ACTUALIZAR
	public Response update(CombustionVehicle combustionVehicle) {
		if (combustionVehicle.getId() == null || combustionVehicle.getId() == 0)
			return Response.status(Response.Status.BAD_REQUEST).build();

		CombustionVehicle result = combustionVehicleService.save(combustionVehicle);
		return Response.ok(result).build();
	}

	/**
	 * DELETE http://localhost:8080/api/combustionvehicle/1
	 */
	@DELETE
	@Path("{id}")
	public Response deleteOne(@PathParam("id") Long id) {
		if (!combustionVehicleService.delete(id))
			return Response.status(Response.Status.NOT_FOUND).build();

		return Response.ok(Response.Status.OK).build();
	}

	/**
	 * DELETE http://localhost:8080/api/combustionvehicle
	 */
	@DELETE
	public Response deleteAll() {
		combustionVehicleService.deleteAll();
		return Response.ok(Response.Status.OK).build();
	}

}
