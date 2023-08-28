package com.example.User_Registration_Portal.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Entity
@Data
public class UserDto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="User_Name")
	private String name;
	private String gender;
	private String email;
	private long mobile;
	private String qualification;
	private String nationality;
	private String address;
}
