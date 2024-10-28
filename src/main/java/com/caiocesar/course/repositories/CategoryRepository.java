package com.caiocesar.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiocesar.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
