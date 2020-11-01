package com.robson.transportadora.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robson.transportadora.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
