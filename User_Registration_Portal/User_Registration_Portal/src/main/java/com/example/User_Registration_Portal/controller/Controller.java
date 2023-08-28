package com.example.User_Registration_Portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.User_Registration_Portal.dto.UserDto;
import com.example.User_Registration_Portal.service.UserService;

@RestController
@RequestMapping("/User")
public class Controller {
	@Autowired
	UserService us;
	
	@PostMapping("/signup")
	public String insert(@RequestBody UserDto dto){
	 return us.insert(dto);
	}
	@GetMapping("/fetch")
	public  UserDto fetch(@RequestBody UserDto dto){
		return us.fetch(dto.getId());
	}
	@GetMapping("/fetchall")
	public List<UserDto> fetchAll(){
		return us.fetchAll();
	}
	
	@PutMapping("/update")
	public String update(@RequestBody UserDto dto){
		return us.update(dto);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestBody UserDto dto){
		return us.delete(dto.getId());
	}
	@DeleteMapping("/deleteall")
	public String deleteAll(){
		return us.deleteAll();
	}
}