package com.example.User_Registration_Portal.dao;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.User_Registration_Portal.dto.UserDto;
import com.example.User_Registration_Portal.repository.UserRepository;

@Component
public class UserDao {
	@Autowired
	UserRepository ur;
	
	public String insert(UserDto dto){
			ur.save(dto);
			return "Data Inserted";
	}
	
	public  Optional<UserDto> fetch(int id){
		return ur.findById(id);
	}
	
	public List<UserDto> fetchAll(){
		return ur.findAll();
	}
	
	public String update(UserDto dto){
		ur.save(dto);
		return "Data Updated successfully";
	}
	
	public String delete(int id){
		ur.deleteById(id);
		return "Data deleted successfully";
	}
	
	public String deleteAll(){
		ur.deleteAll();
		return "All data deleted";
	}

}
