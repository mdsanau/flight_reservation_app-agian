package com.flight_reservation1.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight_reservation1.Entity.Reservation;
import com.flight_reservation1.dto.ReservationUpdateRequest;
import com.flight_reservation1.repository.ReservationRepository;

@RestController
public class ReservationRestController {

	@Autowired
	private ReservationRepository reservationRepository;
	
	@RequestMapping("/reservation/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {
		Optional<Reservation> findById = reservationRepository.findById(id);
		Reservation reservation = findById.get();
		return reservation;
	
		
	}
	//http://localhost:9090/flight_again/reservation
	@RequestMapping("/reservation")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		Optional<Reservation> findById = reservationRepository.findById(request.getId());
		Reservation reservation = findById.get();
		reservation.setCheckedIn(request.isCheckedIn());
		reservation.setNumberOfBags(request.getNumberOfBags());
		return reservationRepository.save(reservation);
	}
}
