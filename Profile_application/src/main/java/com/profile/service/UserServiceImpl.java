package com.profile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profile.exception.ResourceNotFoundException;
import com.profile.model.User;
import com.profile.repository.UserRepo;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User createUser(User user) {
		User users = this.userRepo.save(user);
		return users;
	}

	@Override
	public User updateUser(User user, Integer uid) {
		User users = this.userRepo.findById(uid).orElseThrow(()-> new ResourceNotFoundException("User", "uid", uid));
		users.setName(user.getName());
		users.setGender(user.getGender());
		users.setDob(user.getDob());
		User update = this.userRepo.save(users);
		return update;
	}

	@Override
	public List<User> getAllUser() {
		return this.userRepo.findAll();
	}

	@Override
	public User getById(Integer uid) {
		User users = this.userRepo.findById(uid).orElseThrow(()->new ResourceNotFoundException("User", "uid", uid));
		return users;
	}

	@Override
	public void deleteUser(Integer uid) {
		User user = this.userRepo.findById(uid).orElseThrow(()->new ResourceNotFoundException("User", "uid", uid));
		this.userRepo.delete(user);
	}

}
