package com.example.danxils_api.service;

import com.example.danxils_api.model.OrderRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule());

    public void processOrder(OrderRequest orderRequest) {
        try {
            String json = objectMapper.writeValueAsString(orderRequest);
            log.info("\uD83D\uDD34 Publishing order to Kafka topic: danxils_orders\n{}", json);
            kafkaTemplate.send("danxils_orders", orderRequest.getBarcode(), json);
        } catch (Exception e) {
            log.error("\uD83D\uDEA8 Failed to send order to Kafka", e);
            throw new RuntimeException("Kafka send failed", e);
        }
    }
}
