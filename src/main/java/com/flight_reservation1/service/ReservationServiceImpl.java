package com.flight_reservation1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight_reservation1.Entity.Flight;
import com.flight_reservation1.Entity.Passenger;
import com.flight_reservation1.Entity.Reservation;
import com.flight_reservation1.dto.ReservationRequest;
import com.flight_reservation1.repository.FlightRepository;
import com.flight_reservation1.repository.PassengerRepository;
import com.flight_reservation1.repository.ReservationRepository;

@Service 
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private PassengerRepository passengerRepository;
	@Autowired
	private FlightRepository flightRepository;
	@Autowired
	private ReservationRepository reservationRepository;

	@Override
	public Reservation bookFlight(ReservationRequest request) {
		
		Passenger passenger=new Passenger();
		passenger.setFirstName(request.getFirstName());
		passenger.setLastName(request.getLastName());
		passenger.setMiddleName(request.getMiddleName());
		passenger.setEmail(request.getEmail());
		passenger.setPhone(request.getPhone());
		passengerRepository.save(passenger);
		
		
		long flightId = request.getFlightId();
		Optional<Flight> findById = flightRepository.findById(flightId);
		Flight flight = findById.get();
		
		Reservation reservation=new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(passenger);
		reservation.setCheckedIn(false);
		reservation.setNumberOfBags(0);
		reservationRepository.save(reservation);
		return reservation;
	}

}
