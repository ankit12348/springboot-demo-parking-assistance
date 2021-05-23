package com.rest.parking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.parking.entities.Admins;

public interface AdminsDao extends JpaRepository<Admins, String> {

}
 