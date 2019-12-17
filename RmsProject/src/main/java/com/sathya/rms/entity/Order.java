package com.sathya.rms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`order`")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private String oid;
	@Column
	private String ino;
	@Column
	private Integer qty;
	@Column
	private Float amt;
	@Column
	private String omid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getIno() {
		return ino;
	}

	public void setIno(String ino) {
		this.ino = ino;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Float getAmt() {
		return amt;
	}

	public void setAmt(Float amt) {
		this.amt = amt;
	}

	public String getOmid() {
		return omid;
	}

	public void setOmid(String omid) {
		this.omid = omid;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", oid=" + oid + ", ino=" + ino + ", qty=" + qty + ", amt=" + amt + ", omid=" + omid
				+ "]";
	}

}
