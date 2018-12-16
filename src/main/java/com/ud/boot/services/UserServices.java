package com.ud.boot.services;

import java.util.List;

import com.ud.boot.domain.UserDTO;

public interface UserServices {
	
	List <UserDTO> findAllUsers();
	
	String saveUser(UserDTO Userdata);
	
	String updateUser(UserDTO newUserData);
	
	//UserDTO findById (Integer id);
	
	UserDTO findd (Integer id);

}
