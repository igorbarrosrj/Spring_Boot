package com.igorbarros.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorbarros.curso.entites.OrdemItem;

public interface OrderItemRepository extends JpaRepository<OrdemItem, Long> {
	
	
	

}
