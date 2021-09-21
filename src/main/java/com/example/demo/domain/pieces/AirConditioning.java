package com.example.demo.domain.pieces;

public class AirConditioning {

	private Boolean statusAirConditioning;
	
	public AirConditioning() {}
	
	public AirConditioning(Boolean statusAirConditioning) {
		this.statusAirConditioning = statusAirConditioning;
	}

	public boolean getStatusAirConditioning() {
		return statusAirConditioning;
	}

	public void setStatusAirConditioning(boolean statusAirConditioning) {
		this.statusAirConditioning = statusAirConditioning;
	}

	@Override
	public String toString() {
		return "AirConditioning [statusAirConditioning=" + statusAirConditioning + "]";
	}

	
}
