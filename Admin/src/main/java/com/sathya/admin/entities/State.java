package com.sathya.admin.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="STATE")
public class State {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String stid;
	private String stname;
	
	@OneToMany(mappedBy ="state")	
	private Set<City> cities;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStid() {
		return stid;
	}
	public void setStid(String stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}


}
