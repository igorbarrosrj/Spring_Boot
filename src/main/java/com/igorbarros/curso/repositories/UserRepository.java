package com.igorbarros.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorbarros.curso.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	

}
