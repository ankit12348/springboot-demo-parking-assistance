package com.rest.parking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.parking.entities.Admins;
import com.rest.parking.entities.Slots;
import com.rest.parking.services.AdminsService;
import com.rest.parking.services.SlotsService;

@RestController
public class MyController {
	
	@Autowired
	private SlotsService slotsService;
	
	@Autowired
	private AdminsService adminsService;
	
	//************** admin services *****************///
	//validate admin credentials
	@GetMapping("/admins/{id}")
	public String home(@PathVariable String id, String password) {
		return this.adminsService.validateUsers(id, password);
	}
	
	//add new admin
	@PostMapping("/admins")
	public Admins setAdmin(@RequestBody Admins admin) {
		return this.adminsService.setUsers(admin);
	}
	
	//get all admin details
	@GetMapping("/admins")
	public List<Admins> getAdmins() {
		return this.adminsService.getUsers();
	}
	
	///************** admin services *****************///
	
	///************** parking services *****************///
	//get all parking slots details
	@GetMapping("/slots")
	public List<Slots> getSlots() {
		return this.slotsService.getSlots();
	}
	
	//get a free parking slot details
	@GetMapping("/slots/{status}")
	public Slots getSlot(@PathVariable boolean status) {
		return this.slotsService.getSlots(status);
	}
	
	//add a new parking slot details
	@PostMapping("/slots")
	public Slots setSlot(@RequestBody Slots slot) {
		return this.slotsService.setSlots(slot);
	}
	
	//update a parking slot details
	@PutMapping("/slots")
	public Slots updateSlot(@RequestBody Slots slot) {
		return this.slotsService.updateSlots(slot);
	}
	
	//delete a parking slot details
	@DeleteMapping("/slots/{id}")
	public String deleteSlot(@PathVariable long id) {
		return this.slotsService.deleteSlots(id);
	}
	
	///************** parking services *****************///
}
