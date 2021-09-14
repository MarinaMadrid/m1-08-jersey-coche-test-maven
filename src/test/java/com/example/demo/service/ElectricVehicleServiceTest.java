package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.demo.domain.pieces.AirConditioning;
import com.example.demo.domain.pieces.Battery;
import com.example.demo.domain.pieces.Charges;
import com.example.demo.domain.pieces.Engine;
import com.example.demo.domain.vehicles.ElectricVehicle;

class ElectricVehicleServiceTest {

	ElectricVehicleServiceImpl veh;

	@BeforeEach // se ejecuta antes de cada test
	void setUp() throws Exception {
		veh = new ElectricVehicleServiceImpl();
	}

	@Test
	void testCount() {
		Integer numElectricVehicles = veh.count();
		assertEquals(2, numElectricVehicles);
	}

	@Test
	void testFindOne() {
		ElectricVehicle electricVehicle = veh.findOne(1L);
		assertNotNull(electricVehicle);
	}

	@Test
	void testFindAll() {
		List<ElectricVehicle> electricVehicles = veh.findAll();
		assertEquals(2, electricVehicles.size());

		electricVehicles = veh.findAll();
		assertEquals(2, electricVehicles.size());

		for (ElectricVehicle electricVehicle : electricVehicles) {
			assertNotNull(electricVehicle.getId());
		}
	}

	@Test
	void testSave() {
		ElectricVehicle electricVehicle1 = new ElectricVehicle(1L, "Hyundai Kona", "verde azulado", 2,
				new AirConditioning(true), new Battery("Tecno", 50, 45, true), new Engine("eléctrico", "V", true), 12,
				new Charges(8), true);

		ElectricVehicle result = veh.save(electricVehicle1);
		assertNotNull(result);
	}

	@Test
	void testFindById() {
		List<ElectricVehicle> electricVehicles = veh.findById(1L);
		assertEquals(1, electricVehicles.size());
	}

	@Test
	void testFindByName() {
		List<ElectricVehicle> electricVehicles = veh.findByName("Hyundai Kona");
		assertEquals(1, electricVehicles.size());
	}

	@Test
	void testFindByColour() {
		List<ElectricVehicle> electricVehicles = veh.findByColour("verde azulado");
		assertEquals(1, electricVehicles.size());
	}

	@Test
	void testFindByNumDoors() {
		List<ElectricVehicle> electricVehicles = veh.findByNumDoors(2);
		assertEquals(2, electricVehicles.size());
	}

	@Test
	void testDelete() {
		veh = new ElectricVehicleServiceImpl();

		Long id = 1L;
		boolean results = veh.delete(id);
		assertTrue(results);
	}

	@Test
	void testDeleteAll() {
		veh.deleteAll();
		List<ElectricVehicle> results = veh.findAll();
		assertEquals(0, results.size());
	}

}
