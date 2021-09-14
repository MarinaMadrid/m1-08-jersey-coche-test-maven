package com.example.demo.service;

import com.example.demo.domain.pieces.AirConditioning;
import com.example.demo.domain.pieces.Battery;
import com.example.demo.domain.pieces.Charges;
import com.example.demo.domain.pieces.Engine;
import com.example.demo.domain.pieces.HydrogenTank;
import com.example.demo.domain.pieces.Injection;
import com.example.demo.domain.vehicles.CombustionVehicle;
import com.example.demo.domain.vehicles.ElectricVehicle;
import com.example.demo.domain.vehicles.HybridVehicle;
import com.example.demo.domain.vehicles.Vehicle;

public class FacadeVehicle {

	private FacadeVehicle() {
	}

	public static Vehicle createCombustionVehicle() {
		// combustionVehicle pieces
		String colour = "azul";
		Integer numDoors = 4;
		AirConditioning AirConditioning = new AirConditioning(true);
		Battery battery = new Battery("TSFI", 60, 48, true);
		Engine engine = new Engine("combustión", "L", true);
		Injection injection = new Injection("continua");
		Boolean onOff = true;
		
		CombustionVehicle combustionVehicle = new CombustionVehicle(1L, "Default combustionVehicle", colour, numDoors,
				AirConditioning, battery, engine, injection, onOff);

		return combustionVehicle;
	}

	public static Vehicle createElectricVehicle() {
		// electricVehicle pieces
		String colour = "rojo";
		Integer numDoors = 2;
		AirConditioning AirConditioning = new AirConditioning(true);
		Battery battery = new Battery("Tecno", 50, 45, true);
		Engine engine = new Engine("eléctrico", "V", true);
		Integer loadingTime = 14;
		Charges charges = new Charges(10);
		Boolean onOff = true;
		

		ElectricVehicle electricVehicle = new ElectricVehicle(1L, "Default electricVehicle", colour, numDoors,
				AirConditioning, battery, engine, loadingTime, charges, onOff);

		return electricVehicle;
	}
	
	public static Vehicle createHybridVehicle() {
		// hybridVehicle pieces
		String colour = "verde";
		Integer numDoors = 4;
		AirConditioning AirConditioning = new AirConditioning(true);
		Battery battery = new Battery("Full Electric Hybrid", 55, 40, true);
		Engine engine = new Engine("híbrido", "V", true);
		HydrogenTank hydrogenTank = new HydrogenTank("Knauf Automotive");
		Boolean onOff = true;

		HybridVehicle hybridVehicle = new HybridVehicle(1L, "Default hybridVehicle", colour, numDoors,
				AirConditioning, battery, engine, hydrogenTank, onOff);

		return hybridVehicle;
	}
}
