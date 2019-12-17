package com.sathya.security.service;

import java.util.Optional;

import com.sathya.security.entity.Roles;

public interface RolesService {

	public Roles insertRoles(Roles roles);

	public Roles updateRoles(Roles roles);

	public void deleteRolesById(Integer roleId);

	public Iterable<Roles> getAllRoles();

	public Optional<Roles> getRolesById(Integer roleId);

}
