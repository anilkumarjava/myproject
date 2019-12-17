package com.sathya.security.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.security.data.RolesRepository;
import com.sathya.security.entity.Roles;
@Service
public class RolesServiceImpl implements RolesService {
	
	@Autowired
	RolesRepository rolesRepository;

	@Transactional
	public Roles insertRoles(Roles roles) {
		
		return rolesRepository.save(roles);
	}

	@Transactional
	public Roles updateRoles(Roles roles) {
		
		return rolesRepository.save(roles);
	}

	@Transactional
	public void deleteRolesById(Integer roleId) {
		rolesRepository.deleteById(roleId);
		
	}

	@Override
	public Iterable<Roles> getAllRoles() {
		
		return rolesRepository.findAll();
	}

	@Override
	public Optional<Roles> getRolesById(Integer roleId) {
		
		return rolesRepository.getByroleId(roleId);
	}

}
