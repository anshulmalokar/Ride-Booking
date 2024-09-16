package com.ansul.project.rideBookingApp.rideBookingApp.repositories;

import com.ansul.project.rideBookingApp.rideBookingApp.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepository extends JpaRepository<RideRequest, Long> {

}