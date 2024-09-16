package com.ansul.project.rideBookingApp.rideBookingApp.services;

import org.locationtech.jts.geom.Point;

public interface DistanceService {
    double calculateDistance(Point a,Point b);
}