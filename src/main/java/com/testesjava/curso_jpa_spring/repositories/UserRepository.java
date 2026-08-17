package com.testesjava.curso_jpa_spring.repositories;

import com.testesjava.curso_jpa_spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findById(Long id);
}
