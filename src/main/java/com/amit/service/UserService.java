package com.amit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.amit.model.User;

@Service
public class UserService {
	
	List<User> store=new ArrayList<>();

	public UserService(){
		store.add(new User(UUID.randomUUID().toString(),"amit","amit@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"saffu","saffu@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"abhi","abhi@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"suuu","suuu@gmail.com"));
	}

	
	public List<User> getAllUser(){
		return this.store;
	}
}
