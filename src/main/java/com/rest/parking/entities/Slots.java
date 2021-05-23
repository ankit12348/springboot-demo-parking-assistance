package com.rest.parking.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Slots {
	
	@Id
	private long id;
	private boolean status;
	private String numberplate;
	
	@Override
	public String toString() {
		return "Slots [id=" + id + ", status=" + status + ", numberplate=" + numberplate + "]";
	}
	
	public Slots(long id, boolean status, String numberplate) {
		super();
		this.id = id;
		this.status = status;
		this.numberplate = numberplate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getNumberplate() {
		return numberplate;
	}

	public void setNumberplate(String numberplate) {
		this.numberplate = numberplate;
	}

	public Slots() {
		super();
		// TODO Auto-generated constructor stub
	}
}
