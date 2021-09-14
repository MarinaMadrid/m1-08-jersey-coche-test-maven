package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.demo.domain.pieces.AirConditioning;
import com.example.demo.domain.pieces.Battery;
import com.example.demo.domain.pieces.Engine;
import com.example.demo.domain.pieces.Injection;
import com.example.demo.domain.vehicles.CombustionVehicle;

class CombustionVehicleServiceTest {

	CombustionVehicleServiceImpl veh;

	@BeforeEach // se ejecuta antes de cada test
	void setUp() throws Exception {
		veh = new CombustionVehicleServiceImpl();
	}

	@Test
	void testCount() {
		Integer numCombustionVehicles = veh.count();
		assertEquals(2, numCombustionVehicles);
	}

	@Test
	void testFindOne() {
		CombustionVehicle combustionVehicle = veh.findOne(1L);
		assertNotNull(combustionVehicle);
	}

	@Test
	void testFindAll() {
		List<CombustionVehicle> combustionVehicles = veh.findAll();
		assertEquals(2, combustionVehicles.size());

		combustionVehicles = veh.findAll();
		assertEquals(2, combustionVehicles.size());

		for (CombustionVehicle combustionVehicle : combustionVehicles) {
			assertNotNull(combustionVehicle.getId());
		}
	}

	@Test
	void testSave() {
		CombustionVehicle combustionVehicle1 = new CombustionVehicle(1L, "Audi A3", "azul", 4,
				new AirConditioning(true), new Battery("TFSI", 60, 48, true), new Engine("combustión", "L", true),
				new Injection("continua"), true);

		CombustionVehicle result = veh.save(combustionVehicle1);
		assertNotNull(result);
	}

	@Test
	void testFindById() {
		List<CombustionVehicle> combustionVehicles = veh.findById(1L);
		assertEquals(1, combustionVehicles.size());
	}

	@Test
	void testFindByName() {
		List<CombustionVehicle> combustionVehicles = veh.findByName("Audi A3");
		assertEquals(1, combustionVehicles.size());
	}

	@Test
	void testFindByColour() {
		List<CombustionVehicle> combustionVehicles = veh.findByColour("azul");
		assertEquals(1, combustionVehicles.size());
	}

	@Test
	void testFindByNumDoors() {
		List<CombustionVehicle> combustionVehicles = veh.findByNumDoors(4);
		assertEquals(2, combustionVehicles.size());
	}

	@Test
	void testDelete() {
		veh = new CombustionVehicleServiceImpl();

		Long id = 1L;
		boolean results = veh.delete(id);
		assertTrue(results);
	}

	@Test
	void testDeleteAll() {
		veh.deleteAll();
		List<CombustionVehicle> results = veh.findAll();
		assertEquals(0, results.size());
	}
}
