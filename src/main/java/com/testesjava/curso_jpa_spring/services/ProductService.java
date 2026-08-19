package com.testesjava.curso_jpa_spring.services;

import com.testesjava.curso_jpa_spring.entities.Product;
import com.testesjava.curso_jpa_spring.repositories.ProductRepository;
import com.testesjava.curso_jpa_spring.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }
}
