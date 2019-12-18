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

import com.sathya.admin.entities.Designation;
import com.sathya.admin.services.DesignationService;

@RestController
@RequestMapping(path="/designation")
public class DesignationController {
	@Autowired
	DesignationService designationService;
	
	@GetMapping(path="/getAllDesignation")
	public Iterable<Designation> getAllDesignation()
	{
		return designationService.getAllDesignation();
		}
	
	@PostMapping(path="/addDesignation")
	public Designation insertDesignation(@RequestBody Designation designation) {
		return designationService.insertDesignation(designation);
	}
	
	@PutMapping(path="/updateDesignation")
	public Designation  updateDesignation(@RequestBody Designation designation) {
		return designationService.updateDesignation(designation);
		
	}
	
	@DeleteMapping(path="/deleteDesignation/{id}")
	public void deleteDesignation(@PathVariable("id") Integer id) {
		
		designationService.deleteDesignation(id);		
	}

}
