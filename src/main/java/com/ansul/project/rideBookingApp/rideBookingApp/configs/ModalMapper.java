package com.ansul.project.rideBookingApp.rideBookingApp.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModalMapper {
    @Bean
    public ModalMapper modalMapper(){
        return new ModalMapper();
    }
}
