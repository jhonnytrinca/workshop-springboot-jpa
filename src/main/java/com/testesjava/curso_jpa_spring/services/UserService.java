package com.testesjava.curso_jpa_spring.services;

import com.testesjava.curso_jpa_spring.entities.User;
import com.testesjava.curso_jpa_spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll () {
        return repository.findAll();
    }
}
