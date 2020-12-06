package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserSerivce;

@RestController
public class UserResource {

	@Autowired
	UserSerivce userSerivce;
	
	@GetMapping(value = "/api/getUSer/{id}")
	public User createUser(@PathVariable("id") Long id) {
		User user=userSerivce.getOne(id);
		return user;
	}
	
}
