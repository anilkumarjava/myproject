package com.sathya.security.service;

import java.util.Optional;

import com.sathya.security.entity.Users;

public interface UsersService {

	public Users insertUsers(Users users);

	public Users updateUsers(Users users);

	public void deleteUsersById(Integer id);

	public Iterable<Users> getAllUsers();

	public Optional<Users> getUsersById(Integer id);

	

}
