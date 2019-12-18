package com.sathya.admin.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.admin.entities.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

}
