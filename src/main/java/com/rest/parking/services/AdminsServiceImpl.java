package com.rest.parking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.parking.dao.AdminsDao;
import com.rest.parking.entities.Admins;

@Service
public class AdminsServiceImpl implements AdminsService {
	
	@Autowired
	private AdminsDao adminsDao;
	
	@Override
	public String validateUsers(String id, String password) {
		Admins entity = adminsDao.getById(id);
		if(entity.getPassword() == password) {
			return entity.getName();
		}
		else {
			return "Wrong password";
		}
	}

	@Override
	public Admins setUsers(Admins admin) {
		adminsDao.save(admin);
		return admin;
	}

	@Override
	public List<Admins> getUsers() {
		return adminsDao.findAll();
	}
}
