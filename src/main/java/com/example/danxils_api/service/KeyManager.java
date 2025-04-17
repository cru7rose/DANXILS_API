package com.example.danxils_api.service;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import java.security.Key;
import java.util.concurrent.locks.ReentrantLock;

@Component
public class KeyManager {

    private Key currentKey;
    private Key previousKey;
    private final ReentrantLock lock = new ReentrantLock();

    @PostConstruct
    public void init() {
        // Generate an initial secure key using HS256
        this.currentKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    }

    public Key getCurrentKey() {
        return currentKey;
    }

    public Key getPreviousKey() {
        return previousKey;
    }

    /**
     * Rotates the key: current key is saved as previous, then a new key is generated.
     */
    public void rotateKey() {
        lock.lock();
        try {
            this.previousKey = this.currentKey;
            this.currentKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);
        } finally {
            lock.unlock();
        }
    }
}
