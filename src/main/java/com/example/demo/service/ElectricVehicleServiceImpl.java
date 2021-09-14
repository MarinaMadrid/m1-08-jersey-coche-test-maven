package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.domain.pieces.AirConditioning;
import com.example.demo.domain.pieces.Battery;
import com.example.demo.domain.pieces.Charges;
import com.example.demo.domain.pieces.Engine;
import com.example.demo.domain.vehicles.ElectricVehicle;

@Service
public class ElectricVehicleServiceImpl implements ElectricVehicleService {

	/**
	 * Emulates a database with java hashmap
	 */
	private static final Map<Long, ElectricVehicle> electricvehicles = new HashMap<>();

	static { // hardcoded demo data

		ElectricVehicle electricVehicle1 = new ElectricVehicle(1L, "Hyundai Kona", "verde azulado", 2, new AirConditioning(true),
				new Battery("Tecno", 50, 45, true), new Engine("eléctrico", "V", true), 12, new Charges(8), true);

		ElectricVehicle electricVehicle2 = new ElectricVehicle(2L, "Renault Fluence", "verde", 2, new AirConditioning(true),
				new Battery("Tecno", 55, 40, true), new Engine("eléctrico", "V", true), 14, new Charges(10), true);

		electricvehicles.put(1L, electricVehicle1);
		electricvehicles.put(2L, electricVehicle2);
	}

	@Override
	public Integer count() {
		return electricvehicles.keySet().size();
	}

	@Override
	public List<ElectricVehicle> findAll() {
		return new ArrayList<>(electricvehicles.values());
	}

	@Override
	public ElectricVehicle findOne(Long id) {
		return electricvehicles.get(id);
	}

	@Override
	public ElectricVehicle save(ElectricVehicle electricVehicle) {

		// asignar un id
		if (electricVehicle.getId() == null || electricVehicle.getId() == 0L)
			electricVehicle.setId(getMaxElectricVehicleId() + 1);

		// en caso de actualizar primero lo eliminamos
		electricvehicles.remove(electricVehicle.getId());

		// guarda el ElectricVehicle en el mapa
		electricvehicles.put(electricVehicle.getId(), electricVehicle);
		return electricVehicle;
	}

	/**
	 * Devuelve el id más alto del mapa ElectricVehicles
	 * 
	 * @return
	 */
	private Long getMaxElectricVehicleId() {
		if (electricvehicles.isEmpty())
			return 0L;

		return Collections
				.max(electricvehicles.entrySet(), (entry1, entry2) -> (int) (entry1.getKey() - entry2.getKey()))
				.getKey();
	}

	@Override
	public boolean delete(Long id) {
		electricvehicles.remove(id);
		return true;
	}

	@Override
	public void deleteAll() {
		if (!electricvehicles.isEmpty())
			electricvehicles.clear();
	}

	// Filtros
	// iterar sobre los valores
	
	public List<ElectricVehicle> findById(Long id){
		List<ElectricVehicle> results = new ArrayList<ElectricVehicle>();
		for(ElectricVehicle electricVehicle : electricvehicles.values())
			if(electricVehicle.getId() == id)
				results.add(electricVehicle);
		return results;
	}
	
	public List<ElectricVehicle> findByName(String name){
		List<ElectricVehicle> results = new ArrayList<ElectricVehicle>();
		for(ElectricVehicle electricVehicle : electricvehicles.values())
			if(electricVehicle.getName() == name)
				results.add(electricVehicle);
		return results;
	}
	
	public List<ElectricVehicle> findByColour(String colour){
		List<ElectricVehicle> results = new ArrayList<ElectricVehicle>();
		for(ElectricVehicle electricVehicle : electricvehicles.values())
			if(electricVehicle.getColour() == colour)
				results.add(electricVehicle);
		return results;
	}
	
	public List<ElectricVehicle> findByNumDoors(Integer numDoors){
		List<ElectricVehicle> results = new ArrayList<ElectricVehicle>();
		for(ElectricVehicle electricVehicle : electricvehicles.values())
			if(electricVehicle.getNumDoors() == numDoors)
				results.add(electricVehicle);
		return results;
	}
	
	public List<ElectricVehicle> findByAirAc(AirConditioning airAc){
		List<ElectricVehicle> results = new ArrayList<ElectricVehicle>();
		for(ElectricVehicle electricVehicle : electricvehicles.values())
			if(electricVehicle.getAirAc().getStatusAirConditioning() == airAc.getStatusAirConditioning())
				results.add(electricVehicle);
		return results;
	}
	
	public List<ElectricVehicle> findByTypeEngine(){
		List<ElectricVehicle> results = new ArrayList<ElectricVehicle>();
		for(ElectricVehicle electricVehicle : electricvehicles.values())
			if(electricVehicle.getEngine().getTypeEngine() == "eléctrico")
				results.add(electricVehicle);
		return results;
	}
	
	public List<ElectricVehicle> findByOnOff(Boolean onOff){
		List<ElectricVehicle> results = new ArrayList<ElectricVehicle>();
		for(ElectricVehicle electricVehicle : electricvehicles.values())
			if(electricVehicle.getOnOff() == onOff)
				results.add(electricVehicle);
		return results;
	}

	public List<ElectricVehicle> findByLoadingTime(Integer loadingTime) {
		List<ElectricVehicle> results = new ArrayList<ElectricVehicle>();
		for (ElectricVehicle electricVehicle : electricvehicles.values())
			if (electricVehicle.getLoadingTime() == loadingTime)
				results.add(electricVehicle);
		return results;
	}
	
	public List<ElectricVehicle> findByCharges(Charges charges) {
		List<ElectricVehicle> results = new ArrayList<ElectricVehicle>();
		for (ElectricVehicle electricVehicle : electricvehicles.values())
			if (electricVehicle.getCharges() == charges)
				results.add(electricVehicle);
		return results;
	}
}