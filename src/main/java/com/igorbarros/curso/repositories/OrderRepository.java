package com.igorbarros.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorbarros.curso.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
	

}
