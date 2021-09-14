package com.example.demo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.example.demo.service.FactoryVehicle;

/**
 * CRUD
 * 
 * RETRIEVE ONE id RETRIEVE ALL
 */
@Component
@Path("/vehicle")
@Produces(MediaType.APPLICATION_JSON)
public class VehicleController {

	/**
	 * http://localhost:8080/api/vehicle
	 * 
	 * @return
	 */

	@GET
	public Response hello() {
		String mensaje = "Hola desde VehicleController!";
		return Response.ok().entity(mensaje).build();
	}

	/**
	 * http://localhost:8080/api/vehicle/combustionvehicle
	 * http://localhost:8080/api/vehicle/electricvehicle
	 * http://localhost:8080/api/vehicle/hybridvehicle
	 * 
	 * 
	 * @param type
	 * @return
	 */
	@GET
	@Path("/{type}")
	public Response createByType(@PathParam("type") String type) {

		try {
			return Response.ok().entity(FactoryVehicle.createByType(type)).build();
		} catch (IllegalArgumentException e) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}

	}

}
