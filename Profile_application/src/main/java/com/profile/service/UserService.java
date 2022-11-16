package com.profile.service;

import java.util.List;

import com.profile.model.User;

public interface UserService {
	
	User createUser(User user);
	
	User updateUser(User user,Integer uid);
	
	List<User> getAllUser();
	
	User getById(Integer uid);
	
	void deleteUser(Integer uid);
	
}
