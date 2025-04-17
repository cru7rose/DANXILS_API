package com.example.danxils_api.controller;

import com.example.danxils_api.model.StatusResponse;
import com.example.danxils_api.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/status")
public class StatusController {

    @Autowired
    private StatusService statusService;

    @GetMapping
    public ResponseEntity<?> getStatus(@RequestParam String barcode) {
        Optional<StatusResponse> statusData = statusService.getStatusByBarcode(barcode);

        if (statusData.isPresent()) {
            StatusResponse response = statusData.get();
            response.setRequestID(generateRequestID());
            response.setStatusUpdateTime(LocalDateTime.now());
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(404)
                    .body("{\"error\": \"Paczka nie znaleziona\"}");
        }
    }

    // Generator unikalnego RequestID
    private String generateRequestID() {
        return "BM" + UUID.randomUUID().toString().replace("-", "").substring(0, 12);
    }
}
