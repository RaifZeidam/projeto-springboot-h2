package com.meuprojeto.projetospringbooth2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprojeto.projetospringbooth2.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
