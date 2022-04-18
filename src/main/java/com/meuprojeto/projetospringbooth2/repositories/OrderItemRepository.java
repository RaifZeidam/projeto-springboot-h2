package com.meuprojeto.projetospringbooth2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprojeto.projetospringbooth2.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
