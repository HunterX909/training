package com.ey.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ey.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

	List<Flight> findBySourceAndDestination(String source, String destination);
	
	List<Flight> findByCarrier(String carrier);
}
