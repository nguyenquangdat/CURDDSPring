package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserSerivce {

	
	@Autowired
	private UserRepository userRepository;
	
	public User createUser(User user) {
		// khoi tao user
		User userr = new User();
		//set cac du lieu cho user vua khoi tao
		userr.setUsername(user.getUsername());
		userr.setPassword(user.getPassword());
		userr.setGmail(user.getGmail());
		// luu user vao` mysql
		userRepository.save(userr);
		return userr;
	}
	
	public User getOne(Long id) {
		User user =userRepository.getOne(id);
		return user;
	}
	
	public String deleteUser(Long id) {
		userRepository.deleteById(id);
		return "da xoa thanh cong";
	}
	
}
