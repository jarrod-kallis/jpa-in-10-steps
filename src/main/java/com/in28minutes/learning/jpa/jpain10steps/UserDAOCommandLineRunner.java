package com.in28minutes.learning.jpa.jpain10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;
import com.in28minutes.learning.jpa.jpain10steps.service.UserDAO;

@Component
public class UserDAOCommandLineRunner implements CommandLineRunner {

	@Autowired
	private UserDAO service;

	private static final Logger logger = LoggerFactory.getLogger(UserDAOCommandLineRunner.class);

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jack", "Admin");
		service.insert(user);
		logger.info("New user created: " + user);
	}

}
