package com.ansul.project.rideBookingApp.rideBookingApp.services.impl;

import com.ansul.project.rideBookingApp.rideBookingApp.dto.DriverDto;
import com.ansul.project.rideBookingApp.rideBookingApp.dto.SignupDto;
import com.ansul.project.rideBookingApp.rideBookingApp.dto.UserDto;
import com.ansul.project.rideBookingApp.rideBookingApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
