package com.sathya.admin.services;

import com.sathya.admin.entities.Location;

public interface LocationService {
	
public Iterable<Location> getAllLocation();
	
	public Location insertLocation(Location location);
	
   public Location updateLocation(Location location);
   
   public void deleteLocation(Integer id);

}
