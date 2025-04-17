package com.example.danxils_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequest {

    @JsonProperty("RequestID")
    private String requestID;

    @JsonProperty("Triggerdate")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime triggerdate;

    @JsonProperty("CustID")
    private String custID;

    @JsonProperty("Barcode")
    private String barcode;

    @JsonProperty("PickUpDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate pickUpDate;

    @JsonProperty("PickUpType")
    private String pickUpType;

    @JsonProperty("PickUpAlias")
    private String pickUpAlias;

    @JsonProperty("PickUpName")
    private String pickUpName;

    @JsonProperty("PickUpStreet")
    private String pickUpStreet;

    @JsonProperty("PickUpHouseNo")
    private String pickUpHouseNo;

    @JsonProperty("PickUpPostalCode")
    private String pickUpPostalCode;

    @JsonProperty("PickUpCity")
    private String pickUpCity;

    @JsonProperty("DeliveryType")
    private String deliveryType;

    @JsonProperty("DeliveryAlias")
    private String deliveryAlias;

    @JsonProperty("DeliveryName")
    private String deliveryName;

    @JsonProperty("DeliveryStreet")
    private String deliveryStreet;

    @JsonProperty("DeliveryHouseNo")
    private String deliveryHouseNo;

    @JsonProperty("DeliveryPostalCode")
    private String deliveryPostalCode;

    @JsonProperty("DeliveryCity")
    private String deliveryCity;

    @JsonProperty("Weight")
    private float weight;

    @JsonProperty("Volume")
    private float volume;

    @JsonProperty("Height")
    private float height;

    @JsonProperty("Length")
    private float length;

    @JsonProperty("Width")
    private float width;

    @JsonProperty("DriverInfo")
    private String driverInfo;

    @JsonProperty("InvoiceInfo")
    private String invoiceInfo;

    // Gettery i Settery

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public LocalDateTime getTriggerdate() {
        return triggerdate;
    }

    public void setTriggerdate(LocalDateTime triggerdate) {
        this.triggerdate = triggerdate;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public LocalDate getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(LocalDate pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public String getPickUpType() {
        return pickUpType;
    }

    public void setPickUpType(String pickUpType) {
        this.pickUpType = pickUpType;
    }

    public String getPickUpAlias() {
        return pickUpAlias;
    }

    public void setPickUpAlias(String pickUpAlias) {
        this.pickUpAlias = pickUpAlias;
    }

    public String getPickUpName() {
        return pickUpName;
    }

    public void setPickUpName(String pickUpName) {
        this.pickUpName = pickUpName;
    }

    public String getPickUpStreet() {
        return pickUpStreet;
    }

    public void setPickUpStreet(String pickUpStreet) {
        this.pickUpStreet = pickUpStreet;
    }

    public String getPickUpHouseNo() {
        return pickUpHouseNo;
    }

    public void setPickUpHouseNo(String pickUpHouseNo) {
        this.pickUpHouseNo = pickUpHouseNo;
    }

    public String getPickUpPostalCode() {
        return pickUpPostalCode;
    }

    public void setPickUpPostalCode(String pickUpPostalCode) {
        this.pickUpPostalCode = pickUpPostalCode;
    }

    public String getPickUpCity() {
        return pickUpCity;
    }

    public void setPickUpCity(String pickUpCity) {
        this.pickUpCity = pickUpCity;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getDeliveryAlias() {
        return deliveryAlias;
    }

    public void setDeliveryAlias(String deliveryAlias) {
        this.deliveryAlias = deliveryAlias;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public String getDeliveryStreet() {
        return deliveryStreet;
    }

    public void setDeliveryStreet(String deliveryStreet) {
        this.deliveryStreet = deliveryStreet;
    }

    public String getDeliveryHouseNo() {
        return deliveryHouseNo;
    }

    public void setDeliveryHouseNo(String deliveryHouseNo) {
        this.deliveryHouseNo = deliveryHouseNo;
    }

    public String getDeliveryPostalCode() {
        return deliveryPostalCode;
    }

    public void setDeliveryPostalCode(String deliveryPostalCode) {
        this.deliveryPostalCode = deliveryPostalCode;
    }

    public String getDeliveryCity() {
        return deliveryCity;
    }

    public void setDeliveryCity(String deliveryCity) {
        this.deliveryCity = deliveryCity;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public String getDriverInfo() {
        return driverInfo;
    }

    public void setDriverInfo(String driverInfo) {
        this.driverInfo = driverInfo;
    }

    public String getInvoiceInfo() {
        return invoiceInfo;
    }

    public void setInvoiceInfo(String invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
    }
}
