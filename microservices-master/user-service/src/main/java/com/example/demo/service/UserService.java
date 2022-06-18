package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserService {
	List<User> getAllUsers();

	User getUserById(Long id);

	User getUserByName(String userName);

	User saveUser(User user);
}
