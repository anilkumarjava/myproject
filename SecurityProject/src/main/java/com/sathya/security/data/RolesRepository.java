package com.sathya.security.data;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sathya.security.entity.Roles;

public interface RolesRepository extends CrudRepository<Roles, Integer> {
Optional<Roles> getByroleId(Integer roleId);
}
