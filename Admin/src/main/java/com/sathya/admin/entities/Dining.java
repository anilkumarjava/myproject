package com.sathya.admin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="DINING")
public class Dining {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String did;
	
	private String capacity;

	public int getId() {
		return id;
	}

	public String getDid() {
		return did;
	}

	public String getCapacity() {
		return capacity;
	}	

}
