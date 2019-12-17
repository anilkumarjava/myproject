package com.sathya.rms.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sathya.rms.entity.Menu;
@Repository
public interface MenuRepository extends CrudRepository<Menu, Integer> {

}
