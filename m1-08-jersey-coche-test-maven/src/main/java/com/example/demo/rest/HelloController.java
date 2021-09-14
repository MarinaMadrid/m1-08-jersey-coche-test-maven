package com.example.demo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Component
@Path("/hello")
public class HelloController {

	/**
	 * http://localhost:8080/api/hello/
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "Bienvenidos a Compramostucoche.es";
	}
}