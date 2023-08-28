package com.example.User_Registration_Portal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.User_Registration_Portal.dao.UserDao;
import com.example.User_Registration_Portal.dto.UserDto;

@Service
public class UserService {
	@Autowired
	UserDao dao;
	
	public String insert(UserDto dto){
			return dao.insert(dto);
	}
	public  UserDto fetch(int id){
		Optional<UserDto> op=dao.fetch(id);
		if (op.isPresent()) {
			UserDto dto=op.get();
			return dto;
		}else{
			return null;
		}
	}
	
	public List<UserDto> fetchAll(){
		List<UserDto> l=dao.fetchAll();
		if (l.isEmpty()) {
			return null;
		}else{
			return l;
		}
	}
	
	public String update(UserDto dto){
		return dao.update(dto);
	}
	
	public String delete(int id){
		Optional<UserDto> op=dao.fetch(id);
		if (op.isPresent()) {
			return dao.delete(id);
		}else{
			return "No such data found";
		}
	}
	
	public String deleteAll(){
		List<UserDto> l=dao.fetchAll();
		if (l.isEmpty()) {
			return dao.deleteAll();
		}else{
			return "No such data found";
		}
	}
}
