package com.sathya.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.admin.entities.Restaurant;
import com.sathya.admin.services.RestaurantService;


@RestController
@RequestMapping(path="/restaurants")
public class RestaurantController {
	
	@Autowired
   private RestaurantService restaurantService;
	
	@GetMapping(path="/getAllRestaurants")
	public Iterable<Restaurant> getAllRestaurant()
	{
		return restaurantService.getAllRestaurant();
		}
	
	@PostMapping(path="/addRestaurant")
	public Restaurant insertRestaurant(@RequestBody Restaurant restaurant) {
	
		return restaurantService.insertRestaurant(restaurant);
	}
	
	@PutMapping(path="/updateRestaurant")
	public Restaurant  updateRestaurant(@RequestBody Restaurant restaurant) {
		return restaurantService.updateRestaurant(restaurant);
		
	}
	
	@DeleteMapping(path="/deleteRestaurant/{id}")
	public void deleteRestaurant(@PathVariable("id") Integer id) {
		
		restaurantService.deleteRestaurant(id);		
	}
}
