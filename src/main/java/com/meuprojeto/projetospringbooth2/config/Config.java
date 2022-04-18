package com.meuprojeto.projetospringbooth2.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.meuprojeto.projetospringbooth2.entities.Order;
import com.meuprojeto.projetospringbooth2.entities.User;
import com.meuprojeto.projetospringbooth2.repositories.OrderRepository;
import com.meuprojeto.projetospringbooth2.repositories.UserRepository;

@Configuration
public class Config implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maria Silva", "maria@gmail.com", "999999999", "12345");
		User u2 = new User(null, "Jose Silva", "jose@gmail.com", "888888888", "12345");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
	
}
