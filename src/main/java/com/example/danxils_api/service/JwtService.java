package com.example.danxils_api.service;

import com.example.danxils_api.config.AppProperties;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;

@Service
public class JwtService {

    private final AppProperties appProperties;
    private final KeyManager keyManager;

    public JwtService(AppProperties appProperties, KeyManager keyManager) {
        this.appProperties = appProperties;
        this.keyManager = keyManager;
    }

    public String generateAccessToken(String username) {
        Key key = keyManager.getCurrentKey();
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + appProperties.getAccessTokenExpirationMs()))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    public String generateRefreshToken(String username) {
        Key key = keyManager.getCurrentKey();
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + appProperties.getRefreshTokenExpirationMs()))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    public boolean validateToken(String token) {
        try {
            // Parse the token using the current key:
            Jwts.parser()
                    .setSigningKey(keyManager.getCurrentKey())
                    .build()
                    .parseClaimsJws(token);
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            // If validation with the current key fails, try with the previous key (if available)
            Key previous = keyManager.getPreviousKey();
            if (previous != null) {
                try {
                    Jwts.parser()
                            .setSigningKey(previous)
                            .build()
                            .parseClaimsJws(token);
                    return true;
                } catch (JwtException ex) {
                    return false;
                }
            }
            return false;
        }
    }

    public String getUsernameFromToken(String token) {
        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(keyManager.getCurrentKey())
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
            return claims.getSubject();
        } catch (JwtException | IllegalArgumentException e) {
            // Try with previous key if available:
            Key previous = keyManager.getPreviousKey();
            if (previous != null) {
                Claims claims = Jwts.parser()
                        .setSigningKey(previous)
                        .build()
                        .parseClaimsJws(token)
                        .getBody();
                return claims.getSubject();
            }
            throw e;
        }
    }
}
