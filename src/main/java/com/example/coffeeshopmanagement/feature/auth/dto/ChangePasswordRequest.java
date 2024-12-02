package com.example.coffeeshopmanagement.feature.auth.dto;

public record ChangePasswordRequest(
        String oldPassword,

        String password,

        String confirmedPassword
) {
}
