package com.sathya.admin.services;

import com.sathya.admin.entities.Restaurant;

public interface RestaurantService {
	
public Iterable<Restaurant> getAllRestaurant();
	
	public Restaurant insertRestaurant(Restaurant restaurant);
	
   public Restaurant updateRestaurant(Restaurant restaurant);
   
   public void deleteRestaurant(Integer id);

}
