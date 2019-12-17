package com.sathya.security.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.security.data.PermissionsRepository;
import com.sathya.security.entity.Permissions;

@Service
public class PermissionsServiceImpl implements PermissionsService {

	@Autowired
	PermissionsRepository permissionsRepository;

	@Transactional
	public Permissions insertPermissions(Permissions permissions) {

		return permissionsRepository.save(permissions);
	}

	@Transactional
	public Permissions updatePermissions(Permissions permissions) {

		return permissionsRepository.save(permissions);
	}

	@Transactional
	public void deletePermissions(Integer permissionsId) {
		permissionsRepository.deleteById(permissionsId);

	}

	@Override
	public Iterable<Permissions> getAllPermissions() {

		return permissionsRepository.findAll();
	}

	@Override
	public Optional<Permissions> getPermissionsById(Integer permissionId) {

		return permissionsRepository.findById(permissionId);
	}

}
