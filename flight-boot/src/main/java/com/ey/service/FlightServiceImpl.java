package com.ey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ey.entity.Flight;
import com.ey.exception.InvalidFlightException;
import com.ey.repo.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {
	
	@Autowired
	private FlightRepository repo;

	@Override
	public int save(Flight f) {
//		if(repo.findById(f.getCode()) == null) {
			repo.save(f);
		    return f.getCode();
//		}else {
//			throw new InvalidFlightException("Flight already exists : "+ f.getCode());
//		}
	}

	@Override
	public Flight getByCode(int code) throws InvalidFlightException {
		//return repo.findById(code).get();
		return repo.findById(code).orElseThrow(()-> new InvalidFlightException("Invalid Flight code: " + code) ); 
	}

	@Override
	public List<Flight> list() {
		
		return repo.findAll();
	}

	@Override
	public void remove(int code) {
		repo.deleteById(code);
	}

	@Override
	public List<Flight> listByCarrier(String carrier) {
		
		return repo.findByCarrier(carrier);
	}

	@Override
	public List<Flight> listByRoute(String source, String Destination) {
		
		return repo.findBySourceAndDestination(source, Destination);
	}
	
}
