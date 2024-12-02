package com.example.coffeeshopmanagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Setter
@Getter
@NoArgsConstructor
@Entity
//@Table(name = "user_verification")
public class UserVerification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String verifiedCode;

    private LocalTime expiryTime;

    @OneToOne
    private User user;
}
