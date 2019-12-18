package com.sathya.admin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.admin.data.RestaurantRepository;
import com.sathya.admin.entities.Restaurant;

@Service
public class RestaurantServiceImpl implements RestaurantService {
	
	@Autowired
    private RestaurantRepository restaurantRepository;
	

	public Iterable<Restaurant> getAllRestaurant() {
		return restaurantRepository.findAll();
	}

	@Transactional
	public Restaurant insertRestaurant(Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
	}

	@Transactional
	public Restaurant updateRestaurant(Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
	}

	
	public void deleteRestaurant(Integer id) {
	 restaurantRepository.deleteById(id);

	}

}
