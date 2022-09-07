package com.enrollement.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private long id;
	private String username;
	private String email;
	private String password;

}
