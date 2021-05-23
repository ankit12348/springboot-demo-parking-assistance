package com.rest.parking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.parking.dao.SlotsDao;
import com.rest.parking.entities.Slots;

@Service
public class SlotsServiceImpl implements SlotsService{
	
	@Autowired
	private SlotsDao slotsDao;
	
	//get all parking slots
	@Override
	public List<Slots> getSlots() {
		return slotsDao.findAll();
	}
	
	//
	@Override
	public Slots setSlots(Slots slot) {
		slotsDao.save(slot);
		return slot;
	}

	@Override
	public Slots updateSlots(Slots slot) {
		slotsDao.save(slot);
		return slot;
	}

	//get a free slot
	@Override
	public Slots getSlots(boolean status) {
		return slotsDao.findSlotByStatus(status);
	}

	@Override
	public String deleteSlots(long id) {
		Slots entity = slotsDao.getById(id);
		slotsDao.delete(entity);
		return entity.getId() + " deleted successfully";
	}
	
}
