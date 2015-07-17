package com.project425.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project425.entities.User;
import com.project425.repositories.UserRepositoriesImpl;

@Service
public class UserServiceImpl {

	@Autowired
	UserRepositoriesImpl userRepository;

	@Transactional
	public User save(User user) {
		userRepository.save(user);
		return user;
	}
}
