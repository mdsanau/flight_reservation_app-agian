package com.flight_reservation1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_reservation1.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
