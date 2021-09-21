package com.example.demo.domain.pieces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EngineTest {

	Engine engine = new Engine("combustión", "L", true);
	
	@Test
	void getSetTypeEngineTest() {
		engine.setTypeEngine("eléctrico");
		assertEquals("eléctrico", engine.getTypeEngine());
	}
	
	@Test
	void getSetCylinderPositionEngineTest() {
		engine.setCylinderPosition("V");
		assertEquals("V", engine.getCylinderPosition());
	}
	
	@Test
	void getSetStatusEngineTest() {
		engine.setStatusEngine(false);;
		assertEquals(false, engine.getStatusEngine());
	}

	@Test
	void toStringEngineTest() {
		String engineText = "Engine [typeEngine=" + "combustión" + ", cylinderPosition=" + "L" + ", statusEngine="
				+ true + "]";
		assertEquals(engineText, engine.toString());
	}
	
}
