package com.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.exceptions.ResourceNotFoundException;
import com.demo.model.User;
import com.demo.repositories.UserRepo;
@Service
public class CustomeUserDetailService implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// loading user from datbase by username
		User user = this.userRepo.findByEmail(email)
		.orElseThrow(()->new ResourceNotFoundException("User", "email : "+email, 0));
		return user;
	}

}
