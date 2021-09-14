package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.vehicles.ElectricVehicle;

public interface ElectricVehicleService {

	Integer count();

	List<ElectricVehicle> findAll();

	ElectricVehicle findOne(Long id);

	ElectricVehicle save(ElectricVehicle electricVehicle);

	boolean delete(Long id);

	void deleteAll();
}