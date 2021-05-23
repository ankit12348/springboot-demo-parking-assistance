package com.rest.parking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rest.parking.entities.Slots;

public interface SlotsDao extends JpaRepository<Slots, Long> {
	@Query(value="select * from slots where id = (select min(id) from slots where status = :status)", nativeQuery=true)
	Slots findSlotByStatus(@Param("status") boolean status);
}
