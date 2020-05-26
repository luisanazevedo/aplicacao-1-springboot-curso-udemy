package com.luisa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luisa.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
