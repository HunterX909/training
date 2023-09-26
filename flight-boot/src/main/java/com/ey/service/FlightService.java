package com.ey.service;

import java.util.List;

import com.ey.entity.Flight;
import com.ey.exception.InvalidFlightException;

public interface FlightService {

	int save(Flight f);
	
	Flight getByCode(int code) throws InvalidFlightException;
	
	List<Flight> list();
	
	void remove(int code);
	
	List<Flight> listByCarrier(String carrier);
	
	List<Flight> listByRoute(String source, String Destination);
}
