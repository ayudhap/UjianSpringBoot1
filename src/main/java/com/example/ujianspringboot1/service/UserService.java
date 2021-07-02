package com.example.ujianspringboot1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ujianspringboot1.entity.User;
import com.example.ujianspringboot1.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public List<User> saveUsers(List<User> users) {
		return userRepository.saveAll(users);
	}
	
	public List<User> findUserByCompanyId(int user_id) {
		return userRepository.findUserByCompanyId(user_id);
	}
	
	public List<User> findUserByName(String user_name) {
		return userRepository.findUserByName(user_name);
	}
	
}
