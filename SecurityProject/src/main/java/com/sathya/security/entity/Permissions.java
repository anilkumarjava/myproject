package com.sathya.security.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table
public class Permissions {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer permissionId;
	@Column
	private String permissionName;
	@Column
	private String permissionDescription;
	@Transient
	private Integer roleId;

	@ManyToOne
	@JoinColumn(name = "roleId")
	private Roles roles;

	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

	public Integer getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public String getPermissionDescription() {
		return permissionDescription;
	}

	public void setPermissionDescription(String premissionDescription) {
		this.permissionDescription = premissionDescription;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "Permissions [permissionId=" + permissionId + ", permissionName=" + permissionName
				+ ", premissionDescription=" + permissionDescription + ", roleId=" + roleId + "]";
	}

}
