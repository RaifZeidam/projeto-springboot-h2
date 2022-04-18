package com.meuprojeto.projetospringbooth2.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.meuprojeto.projetospringbooth2.entities.User;
import com.meuprojeto.projetospringbooth2.repositories.UserRepository;

@Configuration
public class Config implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maria Silva", "maria@gmail.com", "999999999", "12345");
		User u2 = new User(null, "Jose Silva", "jose@gmail.com", "888888888", "12345");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
