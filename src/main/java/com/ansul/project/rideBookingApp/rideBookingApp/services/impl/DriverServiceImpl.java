package com.ansul.project.rideBookingApp.rideBookingApp.services.impl;

import com.ansul.project.rideBookingApp.rideBookingApp.dto.DriverDto;
import com.ansul.project.rideBookingApp.rideBookingApp.dto.RideDto;
import com.ansul.project.rideBookingApp.rideBookingApp.dto.RiderDto;
import com.ansul.project.rideBookingApp.rideBookingApp.services.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {
    @Override
    public RideDto acceptRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto startRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto endRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
