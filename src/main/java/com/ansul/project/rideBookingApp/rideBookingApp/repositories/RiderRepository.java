package com.ansul.project.rideBookingApp.rideBookingApp.repositories;

import com.ansul.project.rideBookingApp.rideBookingApp.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepository extends JpaRepository<Rider, Long> {
}

