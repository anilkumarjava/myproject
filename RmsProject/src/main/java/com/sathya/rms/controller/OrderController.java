package com.sathya.rms.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.entity.Order;
import com.sathya.rms.service.OrderService;

@RestController
@RequestMapping(path = "/order")
public class OrderController {

	private static final Logger logger = LogManager.getLogger(OrderController.class);

	@Autowired
	OrderService orderService;

	@PostMapping("/addOrder")
	public Order insertOrder(@RequestBody Order order) {
		logger.info("insertOrder method execution started");
		Order result = null;
		try {

			result = orderService.insertOrder(order);
			logger.debug("input data is {0}", result);
		} catch (Exception e) {
			logger.error("input data is {0}", e);
		}
		logger.info("insertOrder method execution completed");
		return result;

	}

	@PutMapping("/updateOrder")
	public Order updateOrder(@RequestBody Order order) {
		logger.info("updateOrder method execution started");
		Order result = null;
		try {
			result = orderService.updateOrder(order);
			logger.debug("update data is {0}", result);
		} catch (Exception e) {
			logger.error("input data is {0}", e);
		}
		logger.info("updateOrder method execution completed");
		return result;

	}

	@DeleteMapping("/deleteOrder/{id}")
	public void deleteOrder(@PathVariable("id") Integer id) {
		logger.info("deleteOrder method execution started");
		orderService.deleteOrder(id);

	}

	@GetMapping("/getAllOrder")
	public Iterable<Order> getAllOrder() {
		logger.info("getAllOrder method execution started");
		Iterable<Order> result = null;
		try {
			result = orderService.getAllOrder();
			logger.debug("result is {0}", result);

		} catch (Exception e) {
			logger.error("Exception happens and Exception info is {0}", e);

		}
		logger.info("getAllOrder method execution completed");
		return result;

	}

}
