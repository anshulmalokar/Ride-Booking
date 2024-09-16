package com.ansul.project.rideBookingApp.rideBookingApp.services;

import com.ansul.project.rideBookingApp.rideBookingApp.dto.RideRequestDto;
import com.ansul.project.rideBookingApp.rideBookingApp.entities.Driver;
import com.ansul.project.rideBookingApp.rideBookingApp.entities.Ride;
import com.ansul.project.rideBookingApp.rideBookingApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    void matchWithDrivers(RideRequestDto rideRequestDto);

    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest);
}