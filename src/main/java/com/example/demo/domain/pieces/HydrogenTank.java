package com.example.demo.domain.pieces;

public class HydrogenTank {

	private String hydrogenTank;
	
	public HydrogenTank() {}
	
	public HydrogenTank(String hydrogenTank) {
		this.hydrogenTank = hydrogenTank;
	}

	public String getHydrogenTank() {
		return hydrogenTank;
	}

	public void setHydrogenTank(String hydrogenTank) {
		this.hydrogenTank = hydrogenTank;
	}

	@Override
	public String toString() {
		return "HydrogenTank [hydrogenTank=" + hydrogenTank + "]";
	}

}
