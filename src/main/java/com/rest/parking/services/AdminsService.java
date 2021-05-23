package com.rest.parking.services;

import java.util.List;

import com.rest.parking.entities.Admins;

public interface AdminsService {

	public Admins setUsers(Admins admin);

	public String validateUsers(String id, String password);
	
	public List<Admins> getUsers();
}
