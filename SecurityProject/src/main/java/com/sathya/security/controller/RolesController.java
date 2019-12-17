package com.sathya.security.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.security.entity.Roles;
import com.sathya.security.service.RolesService;

@RestController
@RequestMapping("/roles")
public class RolesController {

	@Autowired
	RolesService rolesService;

	@PostMapping("/addRoles")
	public Roles insertRoles(@RequestBody Roles roles) {
		return rolesService.insertRoles(roles);

	}

	@PutMapping("/updateRoles")
	public Roles updateRoles(@RequestBody Roles roles) {
		return rolesService.updateRoles(roles);

	}

	@DeleteMapping("/deleteRoles/{roleId}")
	public void deleteRoles(@PathVariable("roleId") Integer roleId) {
		rolesService.deleteRolesById(roleId);
	}

	@GetMapping("/getAllRoles")
	public Iterable<Roles> getAllRoles() {
		return rolesService.getAllRoles();

	}
    @GetMapping("/getRoles/{roleId}")
	public Optional<Roles> getRolesById(@PathVariable("roleId")Integer roleId) {
		return rolesService.getRolesById(roleId);

	}

}
