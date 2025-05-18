package com.jwt.implementation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.implementation.model.User;

@Service
public class UserService {

	private List<User> store = new ArrayList<>();

	public UserService() {
		store.add(new User(UUID.randomUUID().toString(), "bittu", "bittu@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "aditya", "aditya@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "rishabh", "rishabh@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "surya", "surya@gmail.com"));

	}
	
	public List<User> getUser() {
		return this.store;
	}

}
