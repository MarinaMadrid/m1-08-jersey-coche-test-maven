package com.example.demo.domain.pieces;

public class Battery {

	private String typeBattery;
	private Integer capacityBattery;
	private Integer voltsBattery;
	private Boolean statusBattery;
	
	public Battery() {}
	
	public Battery(String typeBattery, Integer capacityBattery, Integer voltsBattery,
			Boolean statusBattery) {
		this.typeBattery = typeBattery;
		this.capacityBattery = capacityBattery;
		this.voltsBattery = voltsBattery;
		this.statusBattery = statusBattery;
	}

	public String getTypeBattery() {
		return typeBattery;
	}

	public Integer getCapacityBattery() {
		return capacityBattery;
	}

	public Integer getVoltsBattery() {
		return voltsBattery;
	}

	public Boolean getStatusBattery() {
		return statusBattery;
	}

	public void setTypeBattery(String typeBattery) {
		this.typeBattery = typeBattery;
	}

	public void setCapacityBattery(Integer capacityBattery) {
		this.capacityBattery = capacityBattery;
	}

	public void setVoltsBattery(Integer voltsBattery) {
		this.voltsBattery = voltsBattery;
	}

	public void setStatusBattery(Boolean statusBattery) {
		this.statusBattery = statusBattery;
	}

	@Override
	public String toString() {
		return "Battery [typeBattery=" + typeBattery + ", capacityBattery="
				+ capacityBattery + ", voltsBattery=" + voltsBattery + ", statusBattery=" + statusBattery + "]";
	}
	
}
