package com.sathya.admin.services;

import com.sathya.admin.entities.Dining;

public interface DiningService {
	
public Iterable<Dining> getAllDining();
	
	public Dining insertDining(Dining dining);
	
   public Dining updateDining(Dining dining);
   
   public void deleteDining(Integer id);

}
