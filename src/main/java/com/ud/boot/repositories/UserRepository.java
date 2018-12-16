package com.ud.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ud.boot.domain.UserDTO;

public interface UserRepository extends JpaRepository<UserDTO, Integer>{
	
	 @Query("select age from userdto where user_id =?1 ")
		UserDTO findd(Integer id);



}
