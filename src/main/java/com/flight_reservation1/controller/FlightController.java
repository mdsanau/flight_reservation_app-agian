package com.flight_reservation1.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_reservation1.Entity.Flight;
import com.flight_reservation1.repository.FlightRepository;

@Controller
public class FlightController {
	@Autowired
	private FlightRepository flightRepository;

	@RequestMapping("/findFlights")
	public String findFlights(@RequestParam("from") String from,@RequestParam("to") String to,@RequestParam("departureDate")
	@DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate,ModelMap modelMap) {
		List<Flight> findFlights = flightRepository.findFlights(from, to, departureDate);
		modelMap.addAttribute("findFlights", findFlights);
		return"displayFlights";
		
	
	}
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		Optional<Flight> findById = flightRepository.findById(flightId);	
		Flight flight = findById.get();
	
//		System.out.println(flight.getId());
//		System.out.println(flight.getArrivalCity());
//		System.out.println(flight.getDepartureCity());
//		System.out.println(flight.getFlightNumber());
//		System.out.println(flight.getOperatingAirlines());
		modelMap.addAttribute("flight", flight);
		
		return "showReservation";
		
	}
}

