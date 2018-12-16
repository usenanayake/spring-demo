package com.ud.boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ud.boot.domain.UserDTO;
import com.ud.boot.services.UserServices;

@RestController
@RequestMapping("/user")
public class first {
	
	
	@Autowired
	private UserServices userServices;
	
	
	@GetMapping("/all")
	public List <UserDTO> hello(){
		
		return userServices.findAllUsers();
	
	}
	
	
	@PostMapping("/add")
	public String addUser(@RequestBody UserDTO UserData){
		
		return userServices.saveUser(UserData);
	
	}
	
	@PutMapping("/update")
	
	public String updateUser(@RequestBody UserDTO newUserData) {
		return userServices.updateUser(newUserData);
	}
	
	@GetMapping("/find/{id}")
	public UserDTO getUserById(@PathVariable Integer id){
		
		return userServices.findd(id);
	
	}
	

}
