package com.example.demo.domain.vehicles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.domain.pieces.AirConditioning;
import com.example.demo.domain.pieces.Battery;
import com.example.demo.domain.pieces.Charges;
import com.example.demo.domain.pieces.Engine;

class ElectricVehicleTest {

	ElectricVehicle electricVehicle = new ElectricVehicle(1L, "Hyundai Kona", "verde azulado", 2, new AirConditioning(true),
			new Battery("Tecno", 50, 45, true), new Engine("eléctrico", "V", true), 12, new Charges(8), true);

	
	@Test
	void getSetChargesTest() {
		Charges charges = new Charges(10);
		electricVehicle.setCharges(charges);
		assertEquals(charges, electricVehicle.getCharges());
	}
	
	@Test
	void toStringCombustionVehicleTest() {
		String electricVehicleText = 
				"Vehicle [id=" + 1 + ", "
				+ "name=" + "Hyundai Kona" 
				+ ", colour=" + "verde azulado" 
				+ ", numDoors=" + 2 + ", "
				+ "airAc=" + "AirConditioning [statusAirConditioning=" + true + "]" + ", "
				+ "battery=" + "Battery [typeBattery=" + "Tecno" + ", capacityBattery=" + 50 + ", voltsBattery=" + 45 + ", statusBattery=" + true + "]" + ", "
				+ "engine=" + "Engine [typeEngine=" + "eléctrico" + ", cylinderPosition=" + "V" + ", statusEngine=" + true + "]" + ", "
				+ "loadingTime=" + 12 + ", "
				+ "charges=" + "Charges [charges=" + 8 + "]" 
				+ ", onOff=" + true + "]";
		assertEquals(electricVehicleText, electricVehicle.toString());
	}
	
}