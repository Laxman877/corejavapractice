package com.demo.services;

import java.util.List;

import com.demo.model.User;
import com.demo.payloads.UserDto;

public interface UserService {

	UserDto registerNewUser(UserDto user);

	UserDto updateUser(UserDto user, Integer userId);

	UserDto getUserById(Integer userId);

	List<UserDto> getAllUser();

	void deleteUser(Integer userId);

	UserDto createUser(UserDto userdto);
}
