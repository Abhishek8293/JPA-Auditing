package com.jpa.audit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jpa.audit.dto.UserRegistrationDto;
import com.jpa.audit.entity.User;
import com.jpa.audit.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public String registerUser(UserRegistrationDto userDto) {
				User user = new User();
				user.setUserName(userDto.getUserName());
				user.setEmail(userDto.getEmail());
				user.setPassword(passwordEncoder.encode(userDto.getPassword()));
				user.setRoles(userDto.getRoles());
				userRepository.save(user);
		 return "user "+userDto.getUserName()+" is successfully registered";
				
	}

}
