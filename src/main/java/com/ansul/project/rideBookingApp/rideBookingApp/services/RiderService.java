package com.ansul.project.rideBookingApp.rideBookingApp.services;

import com.ansul.project.rideBookingApp.rideBookingApp.dto.DriverDto;
import com.ansul.project.rideBookingApp.rideBookingApp.dto.RideDto;
import com.ansul.project.rideBookingApp.rideBookingApp.dto.RideRequestDto;
import com.ansul.project.rideBookingApp.rideBookingApp.dto.RiderDto;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();
}