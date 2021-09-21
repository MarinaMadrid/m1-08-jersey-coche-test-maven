package com.example.demo.domain.vehicles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.domain.pieces.AirConditioning;
import com.example.demo.domain.pieces.Battery;
import com.example.demo.domain.pieces.Engine;
import com.example.demo.domain.pieces.Injection;

class CombustionVehicleTest {

	CombustionVehicle combustionVehicle = new CombustionVehicle(1L, "Audi A3", "azul", 4, new AirConditioning(true),
			new Battery("TFSI", 60, 48, true), new Engine("combustión", "L", true), new Injection("continua"), true);

	
	@Test
	void getSetInjectionTest() {
		Injection injection = new Injection("simultánea");
		combustionVehicle.setInjection(injection);
		assertEquals(injection, combustionVehicle.getInjection());
	}
	
	@Test
	void toStringCombustionVehicleTest() {
		String combustionVehicleText = 
				"Vehicle [id=" + 1 + ", "
				+ "name=" + "Audi A3" 
				+ ", colour=" + "azul" 
				+ ", numDoors=" + 4 + ""
				+ ", airAc=" + "AirConditioning [statusAirConditioning=" + true + "]" 
				+ ", battery=" + "Battery [typeBattery=" + "TFSI" + ", capacityBattery=" + 60 + ", voltsBattery=" + 48 + ", statusBattery=" + true + "]" 
				+ ", engine=" + "Engine [typeEngine=" + "combustión" + ", cylinderPosition=" + "L" + ", statusEngine=" + true + "]" 
				+ ", injection=" + "Injection [injection=" + "continua" + "]" 
				+ ", onOff=" + true + "]";
		assertEquals(combustionVehicleText, combustionVehicle.toString());
	}
	
}
