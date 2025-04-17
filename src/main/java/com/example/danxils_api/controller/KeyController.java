package com.example.danxils_api.controller;

import com.example.danxils_api.service.KeyManager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/key")
public class KeyController {

    private final KeyManager keyManager;

    public KeyController(KeyManager keyManager) {
        this.keyManager = keyManager;
    }

    @PostMapping("/rotate")
    public ResponseEntity<?> rotateKey() {
        keyManager.rotateKey();
        return ResponseEntity.ok("Key rotated successfully");
    }
}
