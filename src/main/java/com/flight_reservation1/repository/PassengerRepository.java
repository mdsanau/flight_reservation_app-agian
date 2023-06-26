package com.flight_reservation1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_reservation1.Entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
