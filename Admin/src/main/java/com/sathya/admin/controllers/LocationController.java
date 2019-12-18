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

import com.sathya.admin.entities.Location;
import com.sathya.admin.services.LocationService;

@RestController
@RequestMapping(path="/locations")
public class LocationController {
	
	@Autowired
   private LocationService locationService;
	
	@GetMapping(path="/getAllLocation")
	public Iterable<Location> getAllLocation()
	{
		return locationService.getAllLocation();
		}
	
	@PostMapping(path="/addLocation")
	public Location insertLocation(@RequestBody Location location) {
	
		return locationService.insertLocation(location);
	}
	
	@PutMapping(path="/updateLocation")
	public Location  updateLocation(@RequestBody Location location) {
		return locationService.updateLocation(location);
		
	}
	
	@DeleteMapping(path="/deleteLocation/{id}")
	public void deleteLocation(@PathVariable("id") Integer id) {
		
		locationService.deleteLocation(id);		
	}
}
