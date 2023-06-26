package com.flight_reservation1.service;

import com.flight_reservation1.Entity.Reservation;
import com.flight_reservation1.dto.ReservationRequest;

public interface ReservationService {

	Reservation bookFlight(ReservationRequest request);

}
