package com.ansul.project.rideBookingApp.rideBookingApp.repositories;

import com.ansul.project.rideBookingApp.rideBookingApp.entities.Driver;
import com.ansul.project.rideBookingApp.rideBookingApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
