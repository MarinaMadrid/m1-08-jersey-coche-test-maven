package com.example.demo.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloControllerTest {
	HelloController helloController = new HelloController();

	@Test
	void helloTest() {
		String hello = helloController.hello();
		assertEquals("Bienvenidos a Compramostucoche.es", hello);
	}

}
