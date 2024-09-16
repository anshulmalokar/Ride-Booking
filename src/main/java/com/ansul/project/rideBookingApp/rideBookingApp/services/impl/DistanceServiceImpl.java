package com.ansul.project.rideBookingApp.rideBookingApp.services.impl;

import com.ansul.project.rideBookingApp.rideBookingApp.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceImpl implements DistanceService {
    @Override
    public double calculateDistance(Point a, Point b) {
        return 0;
    }
}
