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

import com.sathya.security.entity.Permissions;
import com.sathya.security.entity.Roles;
import com.sathya.security.service.PermissionsService;
import com.sathya.security.service.RolesService;

@RestController
@RequestMapping("/permissions")
public class PermissionsController {

	@Autowired
	PermissionsService permissionsService;
	@Autowired
	RolesService roleservice;

	@PostMapping("/addPermissions")
	public Permissions insertPermissions(@RequestBody Permissions permissions) {
		
		Optional<Roles> oset= roleservice.getRolesById(permissions.getRoleId());
		if(oset!=null)
			permissions.setRoles(oset.get());
		
		return permissionsService.insertPermissions(permissions);

	}

	@PutMapping("/udatePermissions")
	public Permissions updatePermissions(@RequestBody Permissions permissions) {
		return permissionsService.updatePermissions(permissions);

	}

	@DeleteMapping("/deletePermissions/{permissionsId}")
	public void deletePermissions(@PathVariable("permissionsId") Integer permissionsId) {
		permissionsService.deletePermissions(permissionsId);
	}

	@GetMapping("/getAllPermissions")
	public Iterable<Permissions> getAllPermissions() {
		return permissionsService.getAllPermissions();

	}

	@GetMapping("/getPermissions/{permissionsId}")
	public Optional<Permissions> getPermissionsById(@PathVariable("permissionsId") Integer permissionsId) {
		return permissionsService.getPermissionsById(permissionsId);

	}

}
