package com.testesjava.curso_jpa_spring.repositories;

import com.testesjava.curso_jpa_spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
