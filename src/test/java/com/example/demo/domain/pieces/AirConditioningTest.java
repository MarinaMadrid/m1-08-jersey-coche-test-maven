package com.example.demo.domain.pieces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AirConditioningTest {
	
	AirConditioning airAc = new AirConditioning(true);
	
	@Test
	void getStatusAirConditioningTest() {
		assertEquals(true, airAc.getStatusAirConditioning());
	}
	
	@Test
	void setStatusAirConditioningTest() {
		airAc.setStatusAirConditioning(false);
		assertEquals(false, airAc.getStatusAirConditioning());
	}
	
	@Test
	void toStringAirConditioningTest() {
		AirConditioning airAc = new AirConditioning(true);
		String airAcText = "AirConditioning [statusAirConditioning=" + true + "]";
		assertEquals(airAcText, airAc.toString());
	}

}
