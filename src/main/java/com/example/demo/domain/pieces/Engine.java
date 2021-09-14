package com.example.demo.domain.pieces;

public class Engine {

	private String typeEngine;
	private String cylinderPosition;
	private Boolean statusEngine;
	
	public Engine() {}
	
	public Engine(String typeEngine, String cylinderPosition, Boolean statusEngine) {
		this.typeEngine = typeEngine;
		this.cylinderPosition = cylinderPosition;
		this.statusEngine = statusEngine;
	}

	public String getTypeEngine() {
		return typeEngine;
	}

	public String getCylinderPosition() {
		return cylinderPosition;
	}

	public Boolean getStatusEngine() {
		return statusEngine;
	}

	public void setTypeEngine(String typeEngine) {
		this.typeEngine = typeEngine;
	}

	public void setCylinderPosition(String cylinderPosition) {
		this.cylinderPosition = cylinderPosition;
	}

	public void setStatusEngine(Boolean statusEngine) {
		this.statusEngine = statusEngine;
	}

	@Override
	public String toString() {
		return "Engine [typeEngine=" + typeEngine + ", cylinderPosition=" + cylinderPosition + ", statusEngine="
				+ statusEngine + "]";
	}
	
}
