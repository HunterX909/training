package com.ey.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.ey.entity.Flight;
import com.ey.exception.InvalidFlightException;
import com.ey.service.FlightService;

@RestController
@CrossOrigin
public class FligthController {
	
	@Autowired
	private FlightService service;
	
	// http://localhost:
	@PostMapping(value = "/flight/add", consumes = "application/json")
	public String addFlight(@RequestBody Flight f) {
		try {
			service.save(f);
			return "Flight added with code: "+ f.getCode();
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
		}
	}
	
	@GetMapping(value = "flight/{code}", produces = "application/json")
	public Flight byCode(@PathVariable int code) {
		try {
			return service.getByCode(code);
		} catch (InvalidFlightException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	
	@GetMapping(value ="flight/list", produces = "application/json")
	public List<Flight> finsAll(){
		return service.list();
	}
	
	@DeleteMapping(value ="flight/{code}" , produces = "application/json")
	public String deleteFlight(@PathVariable int code) {
		service.remove(code);
		return "fligth removed";
	}
	
	@GetMapping(value = "flight/route", produces = "application/json")
	public List<Flight> findByRoute(@RequestParam String source, @RequestParam String destination){
		return service.listByRoute(source, destination);
	}
	
	@GetMapping(value = "flight/carrier/{carrier}" , produces ="application/json")
	public List<Flight> findByCarrier(@PathVariable String carrier){
		return service.listByCarrier(carrier);
	}
}
