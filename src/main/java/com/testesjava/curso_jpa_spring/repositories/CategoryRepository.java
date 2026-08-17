package com.testesjava.curso_jpa_spring.repositories;

import com.testesjava.curso_jpa_spring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
