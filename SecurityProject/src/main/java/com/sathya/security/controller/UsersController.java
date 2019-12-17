package com.sathya.security.controller;

import java.util.Optional;
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

import com.sathya.security.entity.Users;
import com.sathya.security.service.UsersService;

@RestController
@RequestMapping(path = "/users")
public class UsersController {

	private static final Logger logger = LogManager.getLogger(UsersController.class);
	@Autowired
	UsersService usersService;

	@PostMapping("/addUsers")
	public Users insertUsers(@RequestBody Users users) {
		logger.info("insertUsers method execution started");
		Users result = null;
		try {

			result = usersService.insertUsers(users);
			logger.debug("input data is {0}", result);
		} catch (Exception e) {
			logger.error("input data is {0}", e);
		}
		logger.info("insertUsers method execution completed");
		return result;
	}

	@PutMapping("/updateUsers")
	public Users udateUsers(@RequestBody Users users) {

		logger.info("updateUsers method execution started");
		Users result = null;
		try {
			result = usersService.updateUsers(users);
			logger.debug("update data is {0}", result);
		} catch (Exception e) {
			logger.error("input data is {0}", e);
		}
		logger.info("updateUsers method execution completed");
		return result;

	}

	@DeleteMapping("/deleteUsers/{id}")

	public void deleteUsersById(@PathVariable("id") Integer id) {

		usersService.deleteUsersById(id);
		logger.info("deleteUsersById method execution completed");

	}

	@GetMapping(path = "/getAllStates")
	public Iterable<Users> getAllStates() {
		logger.info("get AllUsers method execution started");
		Iterable<Users> result = null;
		try {
			result = usersService.getAllUsers();
			logger.debug("result is {0}", result);

		} catch (Exception e) {
			logger.error("Exception happens and Exception info is {0}", e);

		}
		logger.info("get AllUsers method execution completed");
		return result;

	}

	@GetMapping("/getUsers/{id}")
	public Optional<Users> getUsersById(@PathVariable("id") Integer id) {
		return usersService.getUsersById(id);

	}

}
