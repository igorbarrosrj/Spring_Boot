package com.igorbarros.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorbarros.curso.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
	

}
