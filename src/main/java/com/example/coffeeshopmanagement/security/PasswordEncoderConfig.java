package com.example.coffeeshopmanagement.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncoderConfig {

    @Bean
    PasswordEncoder configPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }


}
