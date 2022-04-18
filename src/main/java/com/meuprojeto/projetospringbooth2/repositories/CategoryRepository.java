package com.meuprojeto.projetospringbooth2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprojeto.projetospringbooth2.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
