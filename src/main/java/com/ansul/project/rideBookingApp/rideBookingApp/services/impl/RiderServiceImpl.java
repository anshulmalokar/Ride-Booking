package com.ansul.project.rideBookingApp.rideBookingApp.services.impl;

import com.ansul.project.rideBookingApp.rideBookingApp.dto.DriverDto;
import com.ansul.project.rideBookingApp.rideBookingApp.dto.RideDto;
import com.ansul.project.rideBookingApp.rideBookingApp.dto.RideRequestDto;
import com.ansul.project.rideBookingApp.rideBookingApp.dto.RiderDto;
import com.ansul.project.rideBookingApp.rideBookingApp.services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiderServiceImpl implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
