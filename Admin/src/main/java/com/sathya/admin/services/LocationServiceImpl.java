package com.sathya.admin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.admin.data.LocationRepository;
import com.sathya.admin.entities.Location;



@Service
public class LocationServiceImpl implements LocationService {
	 
	@Autowired
	private LocationRepository locationRepository;
	


	public Iterable<Location> getAllLocation() {
		return locationRepository.findAll();
	}

	@Transactional
	public Location insertLocation(Location location) {
		return locationRepository.save(location);
	}

	@Transactional
	public Location updateLocation(Location location) {
		return locationRepository.save(location);
	}

	public void deleteLocation(Integer id) {
		locationRepository.deleteById(id);
		
	}

}
