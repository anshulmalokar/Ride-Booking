package com.ansul.project.rideBookingApp.rideBookingApp.services.impl;

import com.ansul.project.rideBookingApp.rideBookingApp.dto.RideRequestDto;
import com.ansul.project.rideBookingApp.rideBookingApp.entities.Driver;
import com.ansul.project.rideBookingApp.rideBookingApp.entities.Ride;
import com.ansul.project.rideBookingApp.rideBookingApp.entities.enums.RideStatus;
import com.ansul.project.rideBookingApp.rideBookingApp.services.RideService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImpl implements RideService {
    @Override
    public Ride getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDrivers(RideRequestDto rideRequestDto) {

    }

    @Override
    public Ride createNewRide(RideRequestDto rideRequestDto, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest) {
        return null;
    }
}
