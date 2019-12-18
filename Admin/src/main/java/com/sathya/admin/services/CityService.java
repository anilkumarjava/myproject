package com.sathya.admin.services;

import com.sathya.admin.entities.City;

public interface CityService {
	
public Iterable<City> getAllCity();
	
	public City insertCity(City city);
	
   public City updateCity(City city);
   
   public void deleteCity(Integer id);

}
