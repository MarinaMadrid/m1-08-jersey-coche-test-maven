package com.example.demo.domain.vehicles;

import com.example.demo.domain.pieces.AirConditioning;
import com.example.demo.domain.pieces.Battery;
import com.example.demo.domain.pieces.Engine;
import com.example.demo.domain.pieces.HydrogenTank;

public class HybridVehicle extends Vehicle {
	private HydrogenTank hydrogenTank;
	
	public HybridVehicle() {
		
	}

	public HybridVehicle(Long id, String name, String colour, Integer numDoors, AirConditioning airAc,
			Battery battery, Engine engine, HydrogenTank hydrogenTank, Boolean onOff) {
		super(id, name, colour, numDoors, airAc, battery, engine, onOff);
		this.hydrogenTank = hydrogenTank;
	}

	public HydrogenTank getHydrogenTank() {
		return hydrogenTank;
	}

	public void setHydrogenTank(HydrogenTank hydrogenTank) {
		this.hydrogenTank = hydrogenTank;
	}
	
	@Override
	public String toString() {
		return "Vehicle [id=" + getId() + ", name=" + getName() + ", colour=" + getColour() + ", numDoors="
				+ getNumDoors() + ", airAc=" + getAirAc() + ", battery=" + getBattery() + ", engine=" + getEngine() + ", hydrogenTank=" + hydrogenTank + ", onOff=" + getOnOff() + "]";
	} 
	
	
}