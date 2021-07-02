package com.example.ujianspringboot1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ujianspringboot1.entity.User;
import com.example.ujianspringboot1.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public User addUser(User user) {
		return userService.saveUser(user);
	}
	
	@PostMapping("/addUsers")
	public List<User> addUsers(List<User> users) {
		return userService.saveUsers(users);
	}
	
	@GetMapping("/getUserByCompanyId/{user_id}")
	public List<User> findUserByCompanyId(@PathVariable int user_id) {
		return userService.findUserByCompanyId(user_id);
	}
	
	@GetMapping("/getUserByName/{user_name}")
	public List<User> findUserByName(@PathVariable String user_name) {
		return userService.findUserByName(user_name);
	}
	
}
