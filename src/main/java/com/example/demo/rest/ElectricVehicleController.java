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

import com.example.demo.domain.vehicles.ElectricVehicle;
import com.example.demo.service.ElectricVehicleService;

@Path("/electricvehicle")
@Component
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ElectricVehicleController {

	private ElectricVehicleService electricVehicleService;

	public ElectricVehicleController(ElectricVehicleService electricVehicleService) {
		this.electricVehicleService = electricVehicleService;
	}

	/**
	 * GET http://localhost:8080/api/electricvehicle
	 */
	@GET
	public List<ElectricVehicle> findAll() {
		return electricVehicleService.findAll();
	}

	/**
	 * GET http://localhost:8080/api/electricvehicle/1
	 */
	@GET
	@Path("{id}")
	public Response findOne(@PathParam("id") Long id) {
		ElectricVehicle electricVehicle = electricVehicleService.findOne(id);
		if (electricVehicle == null)
			return Response.status(Response.Status.NOT_FOUND).build();

		return Response.ok(electricVehicle).build();
	}

	/**
	 * POST http://localhost:8080/api/electricvehicle
	 */
	
	@POST // CREAR NUEVO
	public Response create(ElectricVehicle electricVehicle) {
		if (electricVehicle.getId() != 0) 
			return Response.status(Response.Status.BAD_REQUEST).build();

		ElectricVehicle result = electricVehicleService.save(electricVehicle);
		return Response.ok(result).build();
	}

	/**
	 * PUT http://localhost:8080/api/electricvehicle
	 */
	@PUT // ACTUALIZAR
	public Response update(ElectricVehicle electricVehicle) {
		if (electricVehicle.getId() == null || electricVehicle.getId() == 0)
			return Response.status(Response.Status.BAD_REQUEST).build();

		ElectricVehicle result = electricVehicleService.save(electricVehicle);
		return Response.ok(result).build();
	}

	/**
	 * DELETE http://localhost:8080/api/electricvehicle/1
	 */
	@DELETE
	@Path("{id}")
	public Response deleteOne(@PathParam("id") Long id) {
		if (!electricVehicleService.delete(id))
			return Response.status(Response.Status.NOT_FOUND).build();

		return Response.ok(Response.Status.OK).build();
	}

	/**
	 * DELETE http://localhost:8080/api/electricvehicle
	 */
	@DELETE
	public Response deleteAll() {
		electricVehicleService.deleteAll();
		return Response.ok(Response.Status.OK).build();
	}

}