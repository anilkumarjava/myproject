package com.sathya.rms.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sathya.rms.entity.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {

}
