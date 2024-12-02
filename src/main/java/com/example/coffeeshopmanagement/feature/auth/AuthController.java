package com.example.coffeeshopmanagement.feature.auth;

import com.example.coffeeshopmanagement.feature.auth.dto.*;
import jakarta.mail.MessagingException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/refresh-token")
    AuthResponse refreshToken(@Valid @RequestBody RefreshTokenRequest refreshTokenRequest) {
        return authService.refreshToken(refreshTokenRequest);
    }

    @PostMapping("/login")
    AuthResponse login(@Valid @RequestBody LoginRequest loginRequest){
        return authService.login(loginRequest);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/register")
    RegisterResponse register(@Valid @RequestBody RegisterRequest registerRequest) {
        return authService.register(registerRequest);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PostMapping("/send-verification")
    void sendVerification(@Valid @RequestBody SendVerificationRequest sendVerificationRequest) throws MessagingException {
        authService.sendVerification(sendVerificationRequest.email());
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PostMapping("/resend-verification")
    void resendVerification(@Valid @RequestBody SendVerificationRequest sendVerificationRequest) throws MessagingException, MessagingException {
        authService.resendVerification(sendVerificationRequest.email());
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PostMapping("/verify")
    void verify(@Valid @RequestBody VerificationRequest verificationRequest) {
        authService.verify(verificationRequest);
    }

}
