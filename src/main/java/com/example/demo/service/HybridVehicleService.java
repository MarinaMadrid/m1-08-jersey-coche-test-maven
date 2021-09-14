package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.vehicles.HybridVehicle;

public interface HybridVehicleService {

	Integer count();

	List<HybridVehicle> findAll();

	HybridVehicle findOne(Long id);

	HybridVehicle save(HybridVehicle hybridVehicle);

	boolean delete(Long id);

	void deleteAll();
}