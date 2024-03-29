package com.in28minutes.learning.jpa.jpain10steps;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;
import com.in28minutes.learning.jpa.jpain10steps.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	@Autowired
	private UserRepository service;

	private static final Logger logger = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jill", "User");
		service.save(user);
		logger.info("New user created using repo: " + user);

		Optional<User> userById = service.findById(1L);
		if (userById.isPresent() == true) {
			logger.info("User retrieved: " + userById.get());
		}

		List<User> allUsers = service.findAll();
		logger.info("All users: " + allUsers);
	}

}
