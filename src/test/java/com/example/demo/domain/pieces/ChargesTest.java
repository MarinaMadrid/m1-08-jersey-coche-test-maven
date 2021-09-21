package com.example.demo.domain.pieces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChargesTest {
	
	Charges charges = new Charges(8);
	
	@Test
	void getChargesTest() {
		assertEquals(8, charges.getCharges());
	}
	
	@Test
	void setchargesTest() {
		charges.setCharges(10);
		assertEquals(10, charges.getCharges());
	}
	
	@Test
	void toStringChargesTest() {
		String chargesText = "Charges [charges=" + 8 + "]";
		assertEquals(chargesText, charges.toString());
	}


}
