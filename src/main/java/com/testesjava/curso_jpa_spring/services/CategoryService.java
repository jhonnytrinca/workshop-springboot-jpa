package com.testesjava.curso_jpa_spring.services;

import com.testesjava.curso_jpa_spring.entities.Category;
import com.testesjava.curso_jpa_spring.repositories.CategoryRepository;
import com.testesjava.curso_jpa_spring.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }
}
