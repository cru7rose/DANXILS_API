//package com.example.danxils_api.service;
//
//import com.example.danxils_api.model.StatusResponse;
//import com.example.danxils_api.repository.StatusRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class StatusService {
//
//    @Autowired
//    private StatusRepository statusRepository;
//
//    public Optional<StatusResponse> getStatusByBarcode(String barcode) {
//        return Optional.ofNullable(statusRepository.findStatusByBarcode(barcode));
//    }
//}
