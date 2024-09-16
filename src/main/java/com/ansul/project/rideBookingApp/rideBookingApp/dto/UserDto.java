package com.ansul.project.rideBookingApp.rideBookingApp.dto;

import com.ansul.project.rideBookingApp.rideBookingApp.entities.enums.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String name;
    private String email;
    private Set<Roles> roles;
}