package com.ansul.project.rideBookingApp.rideBookingApp.entities;
import java.util.Set;

import com.ansul.project.rideBookingApp.rideBookingApp.entities.enums.Roles;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "app_user")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;
    private String password;

    @ElementCollection(fetch = FetchType.LAZY)
    @Enumerated(EnumType.STRING)
    private Set<Roles> roles;
}

