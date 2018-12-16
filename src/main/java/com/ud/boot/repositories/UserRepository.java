package com.ud.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ud.boot.domain.UserDTO;

public interface UserRepository extends JpaRepository<UserDTO, Integer>{

}
