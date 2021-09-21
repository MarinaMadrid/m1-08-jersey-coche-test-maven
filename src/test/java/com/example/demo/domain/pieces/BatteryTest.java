package com.example.demo.domain.pieces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BatteryTest {
	
	Battery battery = new Battery("Full Electric Hybrid", 55, 40, true);
	
	@Test
	void getSetTypeBatteryTest() {
		battery.setTypeBattery("TFSI");
		assertEquals("TFSI", battery.getTypeBattery());
	}
	
	@Test
	void getSetCapacityBatteryTest() {
		battery.setCapacityBattery(60);
		assertEquals(60, battery.getCapacityBattery());
	}
	
	@Test
	void getSetVoltsBatteryTest() {
		battery.setVoltsBattery(48);
		assertEquals(48, battery.getVoltsBattery());
	}
	
	@Test
	void getSetStatusBatteryTest() {
		battery.setStatusBattery(false);
		assertEquals(false, battery.getStatusBattery());
	}

	
	@Test
	void toStringBatteryTest() {
		String batteryText = "Battery [typeBattery=" + "Full Electric Hybrid" + ", capacityBattery="
				+ 55 + ", voltsBattery=" + 40 + ", statusBattery=" + true + "]";
		assertEquals(batteryText, battery.toString());
	}
	
}
