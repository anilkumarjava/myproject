package com.sathya.rms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private String eid;
	@Column
	private String ename;
	@Column
	private Float salary;
	@Column
	private Integer phno;
	@Column
	private String desigid;
	@Column
	private String rid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public Integer getPhno() {
		return phno;
	}

	public void setPhno(Integer phno) {
		this.phno = phno;
	}

	public String getDesigid() {
		return desigid;
	}

	public void setDesigid(String desigid) {
		this.desigid = desigid;
	}

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", phno=" + phno
				+ ", desigid=" + desigid + ", rid=" + rid + "]";
	}

}
