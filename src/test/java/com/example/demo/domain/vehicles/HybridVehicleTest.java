package com.example.demo.domain.vehicles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.domain.pieces.AirConditioning;
import com.example.demo.domain.pieces.Battery;
import com.example.demo.domain.pieces.Engine;
import com.example.demo.domain.pieces.HydrogenTank;

class HybridVehicleTest {
	
	HybridVehicle hybridVehicle = new HybridVehicle(1L, "Volvo XC60", "gris", 4, new AirConditioning(true),
			new Battery("Full Electric Hybrid", 55, 40, true), new Engine("microhíbrido", "V", true), new HydrogenTank("Knauf Automotive"), true);

	@Test
	void getSetHydrogenTankTest() {
		HydrogenTank hydrogenTank = new HydrogenTank("Knauf Automotive");
		hybridVehicle.setHydrogenTank(hydrogenTank);
		assertEquals(hydrogenTank, hybridVehicle.getHydrogenTank());
	}
	
	@Test
	void toStringHybridVehicleTest() {
		String hybridVehicleText = 
				"Vehicle [id=" + 1 + ", "
				+ "name=" + "Volvo XC60" + ", "
				+ "colour=" + "gris" + ", "
				+ "numDoors=" + 4 + ", "
				+ "airAc=" + "AirConditioning [statusAirConditioning=" + true + "]" + ", "
				+ "battery=" + "Battery [typeBattery=" + "Full Electric Hybrid" + ", capacityBattery=" + 55 + ", voltsBattery=" + 40 + ", statusBattery=" + true + "]" + ", "
				+ "engine=" + "Engine [typeEngine=" + "microhíbrido" + ", cylinderPosition=" + "V" + ", statusEngine=" + true + "]" + ", "
				+ "hydrogenTank=" + "HydrogenTank [hydrogenTank=" + "Knauf Automotive" + "]" + ","
				+ " onOff=" + true + "]";
		assertEquals(hybridVehicleText, hybridVehicle.toString());
	}
}
