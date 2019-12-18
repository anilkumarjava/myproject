package com.sathya.admin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DESIGNATION")
public class Designation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String desigid;
	
	private String designame;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesigid() {
		return desigid;
	}

	public void setDesigid(String desigid) {
		this.desigid = desigid;
	}

	public String getDesigname() {
		return designame;
	}

	public void setDesigname(String designame) {
		this.designame = designame;
	}

	

}
