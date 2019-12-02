package com.in28minutes.learning.jpa.jpain10steps.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;

// Spring annotation to indicate that this class interacts with a DB
@Repository
// Provides open & close transaction functionality
@Transactional
public class UserDAO {

	// Autowires the entity manager
	@PersistenceContext
	EntityManager entityManager;

	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}
}
