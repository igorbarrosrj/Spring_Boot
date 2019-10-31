package com.igorbarros.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igorbarros.curso.entites.Products;
import com.igorbarros.curso.repositories.ProductRepository;

@Service
public class ProductsService {
	
    @Autowired
	private ProductRepository repository;
    public List<Products> findAll(){
    	return repository.findAll();
    }
    
    public Products findById(Long id) {
    	Optional <Products> obj = repository.findById(id);
    	return obj.get();
    }
    
	
}
