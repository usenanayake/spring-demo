package com.ud.boot.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.ud.boot.repositories.UserRepository;
import com.ud.boot.services.UserServices;
import com.ud.boot.domain.*;
import java.util.List;

@Service
public class UserServiceImpl implements UserServices {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List <UserDTO> findAllUsers() {
		List <UserDTO> allUsers = userRepository.findAll();
		return allUsers;
	}
	
	@Override
	public String saveUser(UserDTO Userdata) {
		userRepository.save(Userdata);
		return "data saved";
	}
	
	@Override
	public String updateUser(UserDTO newUserData) {
		String msg = null;
		
		if(newUserData.getId() != null) {
			userRepository.save(newUserData);
			msg= "Data Updated";
		}else {
			msg ="Error";
		}
		return msg;
		
	}
	
	
	@Override
	public UserDTO findById(Integer id) {
		return userRepository.findOne(id);
		
	}
}
