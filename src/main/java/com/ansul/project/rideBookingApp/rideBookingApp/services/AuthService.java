package com.ansul.project.rideBookingApp.rideBookingApp.services;

import com.ansul.project.rideBookingApp.rideBookingApp.dto.SignupDto;
import com.ansul.project.rideBookingApp.rideBookingApp.dto.UserDto;
import com.ansul.project.rideBookingApp.rideBookingApp.dto.DriverDto;

public interface AuthService {

    String login(String email, String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId);
}