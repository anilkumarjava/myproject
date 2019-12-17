package com.sathya.rms.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sathya.rms.entity.Shift;

@Repository
public interface ShiftRepository extends CrudRepository<Shift, Integer> {

}
