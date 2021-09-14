package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.demo.domain.vehicles.CombustionVehicle;
import com.example.demo.domain.vehicles.ElectricVehicle;
import com.example.demo.domain.vehicles.HybridVehicle;
import com.example.demo.domain.vehicles.Vehicle;

class FacadeVehicleTest {

	@Test
	void testCreateCombustionVehicle() {

		Vehicle combustionVehicle = FacadeVehicle.createCombustionVehicle();

		assertNotNull(combustionVehicle);
		assertTrue(combustionVehicle instanceof CombustionVehicle);
		assertEquals(1L, combustionVehicle.getId());
	}

	@Test
	void testCreateElectricVehicle() {

		Vehicle electricVehicle = FacadeVehicle.createElectricVehicle();

		assertNotNull(electricVehicle);
		assertTrue(electricVehicle instanceof ElectricVehicle);
		assertEquals(1L, electricVehicle.getId());
	}

	@Test
	void testCreateHybridVehicle() {

		Vehicle hybridVehicle = FacadeVehicle.createHybridVehicle();

		assertNotNull(hybridVehicle);
		assertTrue(hybridVehicle instanceof HybridVehicle);
		assertEquals(1L, hybridVehicle.getId());
	}

}
