package com.ansul.project.rideBookingApp.rideBookingApp.services;

import com.ansul.project.rideBookingApp.rideBookingApp.dto.DriverDto;
import com.ansul.project.rideBookingApp.rideBookingApp.dto.RideDto;
import com.ansul.project.rideBookingApp.rideBookingApp.dto.RiderDto;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();
}