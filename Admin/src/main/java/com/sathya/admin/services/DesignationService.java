package com.sathya.admin.services;

import com.sathya.admin.entities.Designation;

public interface DesignationService {
	public Iterable<Designation> getAllDesignation();
	
	public Designation insertDesignation(Designation designation);
	
   public Designation updateDesignation(Designation designation);
   
   public void deleteDesignation(Integer id);

}
