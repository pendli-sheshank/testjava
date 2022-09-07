package com.enrollement.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enrollement.dto.UserDto;
import com.enrollement.model.User;
import com.enrollement.repository.UserRepo;
import com.enrollement.service.UserService;

@Service
public class UserServiceImple implements UserService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public String createUser(UserDto userDto) {

		if (userRepo.findByEmail(userDto.getEmail())) {
			return "Email exists";
		}
		else {
			User user = new User();

			user.setEmail(userDto.getEmail());
			user.setPassword(userDto.getPassword());
			user.setUsername(userDto.getUsername());

			userRepo.save(user);
			return "Success!";

		}

	}

}
