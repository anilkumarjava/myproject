package com.sathya.security.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sathya.security.entity.Permissions;

@Repository
public interface PermissionsRepository extends CrudRepository<Permissions, Integer> {

}
