package com.example.danxils_api.controller;

import com.example.danxils_api.model.AuthRequest;
import com.example.danxils_api.model.AuthResponse;
import com.example.danxils_api.model.AuthRefreshRequest;
import com.example.danxils_api.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    // Hardcoded credentials for demonstration
    private final String hardcodedUsername = "user";
    private final String hardcodedPassword = "password";

    @Autowired
    private JwtService jwtService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest authRequest) {
        if (hardcodedUsername.equals(authRequest.getUsername()) &&
                hardcodedPassword.equals(authRequest.getPassword())) {
            String accessToken = jwtService.generateAccessToken(authRequest.getUsername());
            String refreshToken = jwtService.generateRefreshToken(authRequest.getUsername());
            AuthResponse response = new AuthResponse(accessToken, "Bearer", refreshToken);
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }

    @PostMapping("/refresh")
    public ResponseEntity<?> refresh(@RequestBody AuthRefreshRequest refreshRequest) {
        if (jwtService.validateToken(refreshRequest.getRefreshToken())) {
            String username = jwtService.getUsernameFromToken(refreshRequest.getRefreshToken());
            String newAccessToken = jwtService.generateAccessToken(username);
            AuthResponse response = new AuthResponse(newAccessToken, "Bearer", refreshRequest.getRefreshToken());
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(401).body("Invalid or expired refresh token");
        }
    }
}
