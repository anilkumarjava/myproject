package com.sathya.security.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sathya.security.entity.Permissions;

@Service
public interface PermissionsService {
	
	public Permissions insertPermissions(Permissions permissions);
	
	public Permissions updatePermissions(Permissions permissions);
	
	public void deletePermissions(Integer permissionsId);
	
	public Iterable<Permissions> getAllPermissions();
	
	public Optional<Permissions> getPermissionsById(Integer permissionId);

}
