package com.example.coffeeshopmanagement.feature.auth.dto;

import lombok.Builder;

@Builder
public record RegisterResponse(
        String message,
        String email
) {
}
