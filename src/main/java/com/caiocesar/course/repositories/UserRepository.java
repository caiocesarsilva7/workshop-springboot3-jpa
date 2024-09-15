package com.caiocesar.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiocesar.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
