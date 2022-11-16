package com.profile.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profile.model.User;
import com.profile.payloads.ApiResponse;
import com.profile.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		User users = this.userService.createUser(user);
		return new ResponseEntity<>(users, HttpStatus.CREATED);
	}

	@GetMapping("/")
	public ResponseEntity<List<User>> getAllUser() {
		return ResponseEntity.ok(this.userService.getAllUser());
	}

	@GetMapping("/{uid}")
	public ResponseEntity<User> getUserById(@PathVariable("uid") Integer uid) {
		return ResponseEntity.ok(this.userService.getById(uid));
	}

	@PutMapping("/{uid}")
	public ResponseEntity<User> updateUser(@Valid @RequestBody User user,@PathVariable("uid") Integer uid) {
		User updateUser = this.userService.updateUser(user, uid);
		return ResponseEntity.ok(updateUser);
	}
	
	@DeleteMapping("/{uid}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable("uid")Integer uid){
		this.userService.deleteUser(uid);
		return new ResponseEntity<ApiResponse>(new ApiResponse("User deleted successfully !!",true),HttpStatus.OK);
	}
}
