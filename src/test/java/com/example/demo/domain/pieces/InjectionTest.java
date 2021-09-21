package com.example.demo.domain.pieces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InjectionTest {
	
	Injection injection = new Injection("continua");
	
	@Test
	void getInjectionTest() {
		assertEquals("continua", injection.getInjection());
	}
	
	@Test
	void setInjectionTest() {
		injection.setInjection("simultánea");
		assertEquals("simultánea", injection.getInjection());
	}
	
	@Test
	void toStringInjectionTest() {
		String injectionText = "Injection [injection=" + "continua" + "]";
		assertEquals(injectionText, injection.toString());
	}

}
