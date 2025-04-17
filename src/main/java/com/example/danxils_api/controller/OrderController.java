//package com.example.danxils_api.controller;
//
//import com.example.danxils_api.model.OrderRequest;
//import com.example.danxils_api.service.OrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/order")
//public class OrderController {
//
//    @Autowired
//    private OrderService orderService;
//
//    @PostMapping
//    public ResponseEntity<?> createOrder(@RequestBody OrderRequest orderRequest) {
//        try {
//            orderService.processOrder(orderRequest);
//            return ResponseEntity.ok().body("{\"message\": \"Zamówienie przyjęte\"}");
//        } catch (Exception e) {
//            return ResponseEntity.status(500)
//                    .body("Internal server error: " + e.getMessage());
//        }
//    }
//}
