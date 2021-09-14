package com.example.demo.domain.vehicles;

import com.example.demo.domain.pieces.AirConditioning;
import com.example.demo.domain.pieces.Battery;
import com.example.demo.domain.pieces.Engine;
import com.example.demo.domain.pieces.Charges;

public class ElectricVehicle extends Vehicle {
	private Integer loadingTime; //hours
	private Charges charges;
	
	public ElectricVehicle() {}

	public ElectricVehicle(Long id, String name, String colour, Integer numDoors, AirConditioning airAc,
			Battery battery, Engine engine, Integer loadingTime, Charges charges, Boolean onOff) {
		super(id, name, colour, numDoors, airAc, battery, engine, onOff);
		this.loadingTime = loadingTime;
		this.charges = charges;
	}

	public Integer getLoadingTime() {
		return loadingTime;
	}

	public void setLoadingTime(Integer loadingTime) {
		this.loadingTime = loadingTime;
	}
	
	public Charges getCharges() {
		return charges;
	}

	public void setCharges(Charges charges) {
		this.charges = charges;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + getId() + ", name=" + getName() + ", colour=" + getColour() + ", numDoors="
				+ getNumDoors() + ", airAc=" + getAirAc() + ", battery=" + getBattery() + ", engine=" + getEngine() + ", loadingTime=" + loadingTime + ", charges=" + charges + ", onOff=" + getOnOff() + "]";
	}
}
