package com.sathya.admin.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.admin.data.DesignationRepository;
import com.sathya.admin.entities.Designation;
@Service
public class DesignationServiceImpl implements DesignationService {
	@Autowired
	DesignationRepository designationRepository;

	public Iterable<Designation> getAllDesignation() {
		return designationRepository.findAll();
	}

	@Transactional
	public Designation insertDesignation(Designation designation) {
		return designationRepository.save(designation);
	}

     @Transactional
	public Designation updateDesignation(Designation designation) {
		return designationRepository.save(designation);
	}

	
	public void deleteDesignation(Integer id) {
		designationRepository.deleteById(id);
		
	}

}
