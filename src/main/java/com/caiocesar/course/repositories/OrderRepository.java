package com.caiocesar.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiocesar.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
