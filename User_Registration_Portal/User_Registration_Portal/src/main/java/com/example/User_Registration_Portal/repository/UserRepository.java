package com.example.User_Registration_Portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.User_Registration_Portal.dto.UserDto;

public interface UserRepository extends JpaRepository<UserDto, Integer>{

}
