package com.example.coffeeshopmanagement.feature.user;

import com.example.coffeeshopmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Boolean existsByEmail(String email);

    // SELECT EXISTS(SELECT * FROM users WHERE phone_number = ?)
    Boolean existsByPhoneNumber(String phoneNumber);

    Optional<User> findByEmail(String email);

    // SELECT * FROM users where phone_number = ?
    Optional<User> findByPhoneNumberAndIsDeletedFalse(String phoneNumber);

    // SELECT * FROM users where uuid = ?
    Optional<User> findByUuid(String uuid);

}
