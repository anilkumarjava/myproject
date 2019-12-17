package com.sathya.rms.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.OrderRepository;
import com.sathya.rms.entity.Order;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;

	@Transactional
	public Order insertOrder(Order order) {

		return orderRepository.save(order);
	}

	@Transactional
	public Order updateOrder(Order order) {

		return orderRepository.save(order);
	}

	@Transactional
	public void deleteOrder(Integer id) {

		orderRepository.deleteById(id);
	}

	@Override
	public Iterable<Order> getAllOrder() {

		return orderRepository.findAll();
	}

}
