package com.example.demo.domain.vehicles;

import com.example.demo.domain.pieces.AirConditioning;
import com.example.demo.domain.pieces.Battery;
import com.example.demo.domain.pieces.Engine;
import com.example.demo.domain.pieces.Injection;

public class CombustionVehicle extends Vehicle {
	private Injection injection;
	
	public CombustionVehicle() {}

	public CombustionVehicle(Long id, String name, String colour, Integer numDoors, AirConditioning airAc,
			Battery battery, Engine engine, Injection injection, Boolean onOff) {
		super(id, name, colour, numDoors, airAc, battery, engine, onOff);
		this.injection = injection;
	}

	public Injection getInjection() {
		return injection;
	}

	public void setInjection(Injection injection) {
		this.injection = injection;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + getId() + ", name=" + getName() + ", colour=" + getColour() + ", numDoors="
				+ getNumDoors() + ", airAc=" + getAirAc() + ", battery=" + getBattery() + ", engine=" + getEngine() + ", injection=" + injection + ", onOff=" + getOnOff() + "]";
	}

}
