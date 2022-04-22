package com.meuprojeto.projetospringbooth2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprojeto.projetospringbooth2.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);
}
