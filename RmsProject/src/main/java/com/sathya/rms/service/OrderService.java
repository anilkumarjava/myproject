package com.sathya.rms.service;

import org.springframework.stereotype.Service;

import com.sathya.rms.entity.Order;

@Service
public interface OrderService {

	public Order insertOrder(Order order);

	public Order updateOrder(Order order);

	public void deleteOrder(Integer id);

	public Iterable<Order> getAllOrder();

}
