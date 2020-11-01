package com.robson.transportadora.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robson.transportadora.entities.Tracking;

public interface TrackingRepository extends JpaRepository<Tracking, Long> {

}
