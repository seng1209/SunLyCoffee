package com.example.coffeeshopmanagement.feature.auth.dto;

import jakarta.validation.constraints.NotBlank;

public record ResetPasswordRequest(
        @NotBlank(message = "Email is required")
        String email
) {
}
