package com.rest.parking.services;

import java.util.List;

import com.rest.parking.entities.Slots;

public interface SlotsService {

	public List<Slots> getSlots();
	
	public Slots getSlots(boolean status);
	
	public Slots setSlots(Slots slot);
	
	public Slots updateSlots(Slots slot);
	
	public String deleteSlots(long id);
	
}
