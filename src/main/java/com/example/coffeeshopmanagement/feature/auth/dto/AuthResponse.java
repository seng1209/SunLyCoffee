package com.example.coffeeshopmanagement.feature.auth.dto;

import lombok.Builder;

@Builder
public record AuthResponse(
        // Token Type
        String tokenType,

        String accessToken,

        String refreshToken
) {
}
