package com.example.demo.domain.vehicles;

import com.example.demo.domain.pieces.AirConditioning;
import com.example.demo.domain.pieces.Battery;
import com.example.demo.domain.pieces.Engine;

public abstract class Vehicle {

	private Long id;
	private String name;
	private String colour; 
	private Integer numDoors; //número de puertas
	private AirConditioning airAc; //aire acondicionado
	private Battery battery;
	private Engine engine;
	private Boolean onOff; //estado del coche (encendido o apagado)

	protected Vehicle() {}


	public Vehicle(Long id, String name, String colour, Integer numDoors, AirConditioning airAc, Battery battery,
			Engine engine, Boolean onOff) {
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.numDoors = numDoors;
		this.airAc = airAc;
		this.battery = battery;
		this.engine = engine;
		this.onOff = onOff;
	}


	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getColour() {
		return colour;
	}

	public Integer getNumDoors() {
		return numDoors;
	}

	public AirConditioning getAirAc() {
		return airAc;
	}

	public Battery getBattery() {
		return battery;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setNumDoors(Integer numDoors) {
		this.numDoors = numDoors;
	}

	public void setAirAc(AirConditioning airAc) {
		this.airAc = airAc;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Boolean getOnOff() {
		return onOff;
	}

	public void setOnOff(Boolean onOff) {
		this.onOff = onOff;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", colour=" + colour + ", numDoors=" + numDoors + ", airAc="
				+ airAc + ", battery=" + battery + ", engine=" + engine + ", onOff=" + onOff + "]";
	}


}
