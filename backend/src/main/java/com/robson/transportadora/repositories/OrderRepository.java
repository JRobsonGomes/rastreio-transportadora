package com.robson.transportadora.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.robson.transportadora.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	@Query("SELECT obj FROM Order obj JOIN FETCH obj.trackings")
	List<Order> findOrdersTrackings();
}
