package com.flight_reservation1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_reservation1.Entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
