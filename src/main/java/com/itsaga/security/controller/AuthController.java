package com.itsaga.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itsaga.security.dto.AuthResponse;
import com.itsaga.security.dto.LoginRequest;
import com.itsaga.security.security.JwtUtil;

@RestController
public class AuthController {
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@PostMapping("/login")
	public AuthResponse login(@RequestBody LoginRequest request) {
		if(request.getUsername().equals("admin") && request.getPassword().equals("admin123")) {
			String token=jwtUtil.generateToken(request.getUsername());
			return new AuthResponse(token);
		}
		throw new RuntimeException("Invalid Credentials");
	}

}
