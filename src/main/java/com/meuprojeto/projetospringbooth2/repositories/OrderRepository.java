package com.meuprojeto.projetospringbooth2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprojeto.projetospringbooth2.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
