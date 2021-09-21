package com.example.demo.domain.pieces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HydrogenTankTest {

	HydrogenTank hydrogenTank = new HydrogenTank("Knauf Automotive");
	
	@Test
	void getHydrogenTankTest() {
		assertEquals("Knauf Automotive", hydrogenTank.getHydrogenTank());
	}
	
	@Test
	void setHydrogenTankTest() {
		hydrogenTank.setHydrogenTank("Toyota Mirai");
		assertEquals("Toyota Mirai", hydrogenTank.getHydrogenTank());
	}
	
	@Test
	void toStringHydrogenTankTest() {
		String hydrogenTankText = "HydrogenTank [hydrogenTank=" + "Knauf Automotive" + "]";
		assertEquals(hydrogenTankText, hydrogenTank.toString());
	}

}
