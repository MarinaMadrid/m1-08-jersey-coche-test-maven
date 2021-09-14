package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.vehicles.CombustionVehicle;

public interface CombustionVehicleService {

	Integer count();

	List<CombustionVehicle> findAll();

	CombustionVehicle findOne(Long id);

	CombustionVehicle save(CombustionVehicle combustionVehicle);

	boolean delete(Long id);

	void deleteAll();
	
}