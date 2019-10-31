package com.igorbarros.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorbarros.curso.entites.Products;

public interface ProductRepository extends JpaRepository<Products, Long> {
	
	
	

}
