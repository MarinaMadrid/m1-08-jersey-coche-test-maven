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
import com.example.demo.domain.pieces.HydrogenTank;
import com.example.demo.domain.vehicles.HybridVehicle;

class HybridVehicleServiceTest {

	HybridVehicleServiceImpl veh;

	@BeforeEach // se ejecuta antes de cada test
	void setUp() throws Exception {
		veh = new HybridVehicleServiceImpl();
	}

	@Test
	void testCount() {
		Integer numHybridVehicles = veh.count();
		assertEquals(2, numHybridVehicles);
	}

	@Test
	void testFindOne() {
		HybridVehicle hybridVehicle = veh.findOne(1L);
		assertNotNull(hybridVehicle);
	}

	@Test
	void testFindAll() {
		List<HybridVehicle> hybridVehicles = veh.findAll();
		assertEquals(2, hybridVehicles.size());

		hybridVehicles = veh.findAll();
		assertEquals(2, hybridVehicles.size());

		for (HybridVehicle HybridVehicle : hybridVehicles) {
			assertNotNull(HybridVehicle.getId());
		}
	}

	@Test
	void testSave() {
		HybridVehicle hybridVehicle1 = new HybridVehicle(1L, "Volvo XC60", "gris", 4, new AirConditioning(true),
				new Battery("Full Electric Hybrid", 55, 40, true), new Engine("microhíbrido", "V", true),
				new HydrogenTank("Knauf Automotive"), true);

		HybridVehicle result = veh.save(hybridVehicle1);
		assertNotNull(result);
	}

	@Test
	void testFindById() {
		List<HybridVehicle> hybridVehicles = veh.findById(1L);
		assertEquals(1, hybridVehicles.size());
	}

	@Test
	void testFindByName() {
		List<HybridVehicle> hybridVehicles = veh.findByName("Volvo XC60");
		assertEquals(1, hybridVehicles.size());
	}

	@Test
	void testFindByColour() {
		List<HybridVehicle> hybridVehicles = veh.findByColour("gris");
		assertEquals(1, hybridVehicles.size());
	}

	@Test
	void testFindByNumDoors() {
		List<HybridVehicle> hybridVehicles = veh.findByNumDoors(4);
		assertEquals(2, hybridVehicles.size());
	}
	
	@Test
	void testDelete() {
		veh = new HybridVehicleServiceImpl();

		Long id = 1L;
		boolean results = veh.delete(id);
		assertTrue(results);
	}

	@Test
	void testDeleteAll() {
		veh.deleteAll();
		List<HybridVehicle> results = veh.findAll();
		assertEquals(0, results.size());
	}

}
