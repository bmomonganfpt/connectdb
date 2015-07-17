package com.project425.repositories;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project425.entities.User;

@Repository
public class UserRepositoriesImpl {

	@Autowired
	SessionFactory sessionFactory;

	public User save(User user) {
		sessionFactory.getCurrentSession().save(user);
		return user;
	}
}
