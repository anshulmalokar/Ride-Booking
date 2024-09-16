package com.ansul.project.rideBookingApp.rideBookingApp.repositories;

import com.ansul.project.rideBookingApp.rideBookingApp.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {
}
