package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.domain.pieces.AirConditioning;
import com.example.demo.domain.pieces.Battery;
import com.example.demo.domain.pieces.Engine;
import com.example.demo.domain.pieces.Injection;
import com.example.demo.domain.vehicles.CombustionVehicle;

@Service
public class CombustionVehicleServiceImpl implements CombustionVehicleService {

	/**
	 * Emulates a database with java hashmap
	 */
	private static final Map<Long, CombustionVehicle> combustionvehicles = new HashMap<>();

	static { // hardcoded demo data

		CombustionVehicle combustionVehicle1 = new CombustionVehicle(1L, "Audi A3", "azul", 4, new AirConditioning(true),
				new Battery("TFSI", 60, 48, true), new Engine("combustión", "L", true), new Injection("continua"), true);

		CombustionVehicle combustionVehicle2 = new CombustionVehicle(2L, "Ford Pluma", "rojo", 4, new AirConditioning(true),
				new Battery("TFSI", 55, 45, true), new Engine("combustión", "L", true), new Injection("simultánea"), true);

		combustionvehicles.put(1L, combustionVehicle1);
		combustionvehicles.put(2L, combustionVehicle2);
	}

	@Override
	public Integer count() {
		return combustionvehicles.keySet().size();
	}

	@Override
	public List<CombustionVehicle> findAll() {
		return new ArrayList<>(combustionvehicles.values());
	}

	@Override
	public CombustionVehicle findOne(Long id) {
		return combustionvehicles.get(id);
	}

	@Override
	public CombustionVehicle save(CombustionVehicle combustionVehicle) {

		// asignar un id
		if (combustionVehicle.getId() == null || combustionVehicle.getId() == 0L)
			combustionVehicle.setId(getMaxCombustionVehicleId() + 1);

		// en caso de actualizar primero lo eliminamos
		combustionvehicles.remove(combustionVehicle.getId());

		// guarda el combustionVehicle en el mapa
		combustionvehicles.put(combustionVehicle.getId(), combustionVehicle);
		return combustionVehicle;
	}

	/**
	 * Devuelve el id más alto del mapa combustionVehicles
	 * 
	 * @return
	 */
	private Long getMaxCombustionVehicleId() {
		if (combustionvehicles.isEmpty())
			return 0L;

		return Collections
				.max(combustionvehicles.entrySet(), (entry1, entry2) -> (int) (entry1.getKey() - entry2.getKey()))
				.getKey();
	}

	@Override
	public boolean delete(Long id) {
		combustionvehicles.remove(id);
		return true;
	}

	@Override
	public void deleteAll() {
		if (!combustionvehicles.isEmpty())
			combustionvehicles.clear();
	}
	
	// Filtros
	// iterar sobre los valores
	public List<CombustionVehicle> findById(Long id){
		List<CombustionVehicle> results = new ArrayList<CombustionVehicle>();
		for(CombustionVehicle combustionVehicle : combustionvehicles.values())
			if(combustionVehicle.getId() == id)
				results.add(combustionVehicle);
		return results;
	}
	
	public List<CombustionVehicle> findByName(String name){
		List<CombustionVehicle> results = new ArrayList<CombustionVehicle>();
		for(CombustionVehicle combustionVehicle : combustionvehicles.values())
			if(combustionVehicle.getName() == name)
				results.add(combustionVehicle);
		return results;
	}
	
	public List<CombustionVehicle> findByColour(String colour){
		List<CombustionVehicle> results = new ArrayList<CombustionVehicle>();
		for(CombustionVehicle combustionVehicle : combustionvehicles.values())
			if(combustionVehicle.getColour() == colour)
				results.add(combustionVehicle);
		return results;
	}
	
	public List<CombustionVehicle> findByNumDoors(Integer numDoors){
		List<CombustionVehicle> results = new ArrayList<CombustionVehicle>();
		for(CombustionVehicle combustionVehicle : combustionvehicles.values())
			if(combustionVehicle.getNumDoors() == numDoors)
				results.add(combustionVehicle);
		return results;
	}
	
	public List<CombustionVehicle> findByAirAc(AirConditioning airAc){
		List<CombustionVehicle> results = new ArrayList<CombustionVehicle>();
		for(CombustionVehicle combustionVehicle : combustionvehicles.values())
			if(combustionVehicle.getAirAc().getStatusAirConditioning() == airAc.getStatusAirConditioning())
				results.add(combustionVehicle);
		return results;
	}
		
	public List<CombustionVehicle> findByTypeEngine(){
		List<CombustionVehicle> results = new ArrayList<CombustionVehicle>();
		for(CombustionVehicle combustionVehicle : combustionvehicles.values())
			if(combustionVehicle.getEngine().getTypeEngine() == "combustión")
				results.add(combustionVehicle);
		return results;
	}
	
	public List<CombustionVehicle> findByOnOff(Boolean onOff){
		List<CombustionVehicle> results = new ArrayList<CombustionVehicle>();
		for(CombustionVehicle combustionVehicle : combustionvehicles.values())
			if(combustionVehicle.getOnOff() == onOff)
				results.add(combustionVehicle);
		return results;
	}
	
	public List<CombustionVehicle> findByInjection(Injection injection){
		List<CombustionVehicle> results = new ArrayList<CombustionVehicle>();
		for(CombustionVehicle combustionVehicle : combustionvehicles.values())
			if(combustionVehicle.getInjection() == injection)
				results.add(combustionVehicle);
		return results;
	}
				
			
}
