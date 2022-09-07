package com.enrollement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enrollement.dto.UserDto;
import com.enrollement.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	
	private UserService userService;
	
	
	@PostMapping("/")
	public String signUpUser(@RequestBody UserDto userDto) {
		return userService.createUser(userDto);
	}

}
