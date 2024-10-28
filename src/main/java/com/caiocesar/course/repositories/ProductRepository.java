package com.caiocesar.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiocesar.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
