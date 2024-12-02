package com.example.coffeeshopmanagement.feature.auth;

import com.example.coffeeshopmanagement.feature.auth.dto.*;
import jakarta.mail.MessagingException;

public interface AuthService {
    AuthResponse refreshToken(RefreshTokenRequest refreshTokenRequest);

    AuthResponse login(LoginRequest loginRequest);

    void verify(VerificationRequest verificationRequest);

    void sendVerification(String email) throws MessagingException;

    void resendVerification(String email) throws MessagingException;

    RegisterResponse register(RegisterRequest registerRequest);
}
