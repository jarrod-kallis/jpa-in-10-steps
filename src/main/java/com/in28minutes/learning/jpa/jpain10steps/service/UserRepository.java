package com.in28minutes.learning.jpa.jpain10steps.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;

// Extending JPARepository gives you all the common DAO actions you would need
// as well as access to an EntityManager
public interface UserRepository extends JpaRepository<User, Long> {

}
