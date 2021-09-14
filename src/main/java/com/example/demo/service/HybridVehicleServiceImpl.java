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
import com.example.demo.domain.pieces.HydrogenTank;
import com.example.demo.domain.vehicles.HybridVehicle;

@Service
public class HybridVehicleServiceImpl implements HybridVehicleService {

	/**
	 * Emulates a database with java hashmap
	 */
	private static final Map<Long, HybridVehicle> hybridvehicles = new HashMap<>();

	static { // hardcoded demo data

		HybridVehicle hybridVehicle1 = new HybridVehicle(1L, "Volvo XC60", "gris", 4, new AirConditioning(true),
				new Battery("Full Electric Hybrid", 55, 40, true), new Engine("microhíbrido", "V", true), new HydrogenTank("Knauf Automotive"), true);

		HybridVehicle hybridVehicle2 = new HybridVehicle(2L, "Mercedes Clase A", "blanco", 4, new AirConditioning(true),
				new Battery("Full Electric Hybrid", 65, 50, true), new Engine("híbrido", "V", true), new HydrogenTank("Knauf Automotive"), true);


		hybridvehicles.put(1L, hybridVehicle1);
		hybridvehicles.put(2L, hybridVehicle2);
	}

	@Override
	public Integer count() {
		return hybridvehicles.keySet().size();
	}

	@Override
	public List<HybridVehicle> findAll() {
		return new ArrayList<>(hybridvehicles.values());
	}

	@Override
	public HybridVehicle findOne(Long id) {
		return hybridvehicles.get(id);
	}

	@Override
	public HybridVehicle save(HybridVehicle hybridVehicle) {

		// asignar un id
		if (hybridVehicle.getId() == null || hybridVehicle.getId() == 0L)
			hybridVehicle.setId(getMaxHybridVehicleId() + 1);

		// en caso de actualizar primero lo eliminamos
		hybridvehicles.remove(hybridVehicle.getId());

		// guarda el HybridVehicle en el mapa
		hybridvehicles.put(hybridVehicle.getId(), hybridVehicle);
		return hybridVehicle;
	}

	/**
	 * Devuelve el id más alto del mapa HybridVehicles
	 * 
	 * @return
	 */
	private Long getMaxHybridVehicleId() {
		if (hybridvehicles.isEmpty())
			return 0L;

		return Collections
				.max(hybridvehicles.entrySet(), (entry1, entry2) -> (int) (entry1.getKey() - entry2.getKey()))
				.getKey();
	}

	@Override
	public boolean delete(Long id) {
		hybridvehicles.remove(id);
		return true;
	}

	@Override
	public void deleteAll() {
		if (!hybridvehicles.isEmpty())
			hybridvehicles.clear();
	}
	
	public List<HybridVehicle> findById(Long id){
		List<HybridVehicle> results = new ArrayList<HybridVehicle>();
		for(HybridVehicle hybridVehicle : hybridvehicles.values())
			if(hybridVehicle.getId() == id)
				results.add(hybridVehicle);
		return results;
	}
	
	public List<HybridVehicle> findByName(String name){
		List<HybridVehicle> results = new ArrayList<HybridVehicle>();
		for(HybridVehicle hybridVehicle : hybridvehicles.values())
			if(hybridVehicle.getName() == name)
				results.add(hybridVehicle);
		return results;
	}
	
	public List<HybridVehicle> findByColour(String colour){
		List<HybridVehicle> results = new ArrayList<HybridVehicle>();
		for(HybridVehicle hybridVehicle : hybridvehicles.values())
			if(hybridVehicle.getColour() == colour)
				results.add(hybridVehicle);
		return results;
	}
	
	public List<HybridVehicle> findByNumDoors(Integer numDoors){
		List<HybridVehicle> results = new ArrayList<HybridVehicle>();
		for(HybridVehicle hybridVehicle : hybridvehicles.values())
			if(hybridVehicle.getNumDoors() == numDoors)
				results.add(hybridVehicle);
		return results;
	}
	
	public List<HybridVehicle> findByAirAc(AirConditioning airAc){
		List<HybridVehicle> results = new ArrayList<HybridVehicle>();
		for(HybridVehicle hybridVehicle : hybridvehicles.values())
			if(hybridVehicle.getAirAc().getStatusAirConditioning() == airAc.getStatusAirConditioning())
				results.add(hybridVehicle);
		return results;
	}
	
	public List<HybridVehicle> findByTypeEngine(){
		List<HybridVehicle> results = new ArrayList<HybridVehicle>();
		for(HybridVehicle hybridVehicle : hybridvehicles.values())
			if(hybridVehicle.getEngine().getTypeEngine() == "híbrido" || hybridVehicle.getEngine().getTypeEngine() == "microhíbrido" )
				results.add(hybridVehicle);
		return results;
	}
	
	public List<HybridVehicle> findByOnOff(Boolean onOff){
		List<HybridVehicle> results = new ArrayList<HybridVehicle>();
		for(HybridVehicle hybridVehicle : hybridvehicles.values())
			if(hybridVehicle.getOnOff() == onOff)
				results.add(hybridVehicle);
		return results;
	}
	
	public List<HybridVehicle> findByHydrogenTank(HydrogenTank hydrogenTank){
		List<HybridVehicle> results = new ArrayList<HybridVehicle>();
		for(HybridVehicle hybridVehicle : hybridvehicles.values())
			if(hybridVehicle.getHydrogenTank() == hydrogenTank)
				results.add(hybridVehicle);
		return results;
	}
}