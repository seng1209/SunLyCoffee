package com.example.coffeeshopmanagement.feature.auth;

import com.example.coffeeshopmanagement.model.User;
import com.example.coffeeshopmanagement.model.UserVerification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserVerificationRepository extends JpaRepository<UserVerification, Long> {
    Optional<UserVerification> findByUserAndVerifiedCode(User user, String verifiedCode);

    Optional<UserVerification> findByUser(User user);
}
