package com.luisa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luisa.course.entities.Product;
import com.luisa.course.entities.User;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
