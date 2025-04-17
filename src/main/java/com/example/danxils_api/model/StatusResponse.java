package com.example.danxils_api.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;

public class StatusResponse {
    @JsonProperty("RequestID")
    private String requestID;

    @JsonProperty("Event")
    private String event;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("Barcode")
    private String barcode;

    @JsonProperty("StatusUpdateTime")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private LocalDateTime statusUpdateTime;

    @JsonProperty("Longitude")
    private String longitude;

    @JsonProperty("Latitude")
    private String latitude;

    // Getters and Setters
    public String getRequestID() { return requestID; }
    public void setRequestID(String requestID) { this.requestID = requestID; }

    public String getEvent() { return event; }
    public void setEvent(String event) { this.event = event; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getBarcode() { return barcode; }
    public void setBarcode(String barcode) { this.barcode = barcode; }

    public LocalDateTime getStatusUpdateTime() { return statusUpdateTime; }
    public void setStatusUpdateTime(LocalDateTime statusUpdateTime) { this.statusUpdateTime = statusUpdateTime; }

    public String getLongitude() { return longitude; }
    public void setLongitude(String longitude) { this.longitude = longitude; }

    public String getLatitude() { return latitude; }
    public void setLatitude(String latitude) { this.latitude = latitude; }
}
