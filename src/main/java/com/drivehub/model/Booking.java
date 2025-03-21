package com.drivehub.model;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Booking {
    private int id;
    private String bookingNumber;
    private int bookingType; //1<- Schedule Booking 2<- instant Booking
    private User customer;
    private int customerId;
    private Vehicle vehicle;
    private int vehicleId;
    private List<PaymentInfo> paymentInfoList;
    private String fromDestination;
    private String toDestination;
    private Timestamp startDate;
    private Timestamp endDate;
    private double totalAmount;
    private int requestedSeatCount;
    private double totalRequestedDistance;
    private String passengerName;
    private String passengerPhone;
    private int startMeterReading;
    private int endMeterReading;
    private Timestamp finalStartDate;
    private Timestamp finalEndDate;
    private double finalTotalAmount;
    private int status; // 0<-scheduled 1<-completed 2<-canceled 3<-ongoing


    //select
    public Booking(int id, String bookingNumber, List<PaymentInfo> paymentInfoList, int bookingType, int customerId, User customer, Vehicle vehicle, int vehicleId, Timestamp startDate, Timestamp endDate, double totalAmount, int requestedSeatCount, double totalRequestedDistance, String passengerName, String passengerPhone, double finalTotalAmount, Timestamp finalStartDate, Timestamp finalEndDate, int status) {
        this.id = id;
        this.bookingNumber = bookingNumber;
        this.paymentInfoList = paymentInfoList;
        this.bookingType = bookingType;
        this.customerId = customerId;
        this.customer = customer;
        this.vehicle = vehicle;
        this.vehicleId = vehicleId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.requestedSeatCount = requestedSeatCount;
        this.totalRequestedDistance = totalRequestedDistance;
        this.totalAmount = totalAmount;
        this.passengerName = passengerName;
        this.passengerPhone = passengerPhone;
        this.finalTotalAmount = finalTotalAmount;
        this.finalStartDate = finalStartDate;
        this.finalEndDate = finalEndDate;
        this.status = status;
    }

    //insert
    public Booking(int customerId, int vehicleId, int bookingType, Timestamp startDate, Timestamp endDate, double totalAmount, double totalRequestedDistance, String passengerName, String passengerPhone, int status) {
        this.customerId = customerId;
        this.vehicleId = vehicleId;
        this.bookingType = bookingType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalAmount = totalAmount;
        this.totalRequestedDistance = totalRequestedDistance;
        this.passengerName = passengerName;
        this.passengerPhone = passengerPhone;
        this.status = status;
    }

    //update
    public Booking(int id,int vehicleId, Timestamp startDate, Timestamp endDate, double totalAmount, double totalRequestedDistance, String passengerName, String passengerPhone, int status) {
        this.id = id;
        this.vehicleId = vehicleId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalAmount = totalAmount;
        this.totalRequestedDistance = totalRequestedDistance;
        this.passengerName = passengerName;
        this.passengerPhone = passengerPhone;
        this.status = status;
    }

    public Booking() {}

    //Getters
    public int getId() {
        return id;
    }


    public int getBookingType() {
        return bookingType;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }

    public User getCustomer() {
        return customer;
    }

    public int getCustomerId() {
        return customerId;
    }

    public double getTotalRequestedDistance() {
        return totalRequestedDistance;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPassengerPhone() {
        return passengerPhone;
    }

    public int getRequestedSeatCount() {
        return requestedSeatCount;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getFromDestination() {
        return fromDestination;
    }

    public String getToDestination() {
        return toDestination;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public int getStatus() {
        return status;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setPaymentInfoList(List<PaymentInfo> paymentInfoList) {
        this.paymentInfoList = paymentInfoList;
    }

    public void setFinalEndDate(Timestamp finalEndDate) {
        this.finalEndDate = finalEndDate;
    }

    public void setFinalStartDate(Timestamp finalStartDate) {
        this.finalStartDate = finalStartDate;
    }

    public void setEndMeterReading(int endMeterReading) {
        this.endMeterReading = endMeterReading;
    }

    public void setStartMeterReading(int startMeterReading) {
        this.startMeterReading = startMeterReading;
    }

    public Map<String, Object> toJson() {

        Map<String, Object> jsonMap = new HashMap<>();
        jsonMap.put("id", id);
        jsonMap.put("bookingNumber", bookingNumber);
        jsonMap.put("customerId", customerId);
        jsonMap.put("customer", customer == null ? "" : customer.toJson());
        jsonMap.put("bookingType", bookingType);
        jsonMap.put("paymentInfoList", paymentInfoList.isEmpty() ? "" : paymentInfoList);
        jsonMap.put("vehicle", vehicle == null ? "" : vehicle.toJson());
        jsonMap.put("vehicleId", vehicleId);
        jsonMap.put("fromDestination", fromDestination);
        jsonMap.put("toDestination", toDestination);
        jsonMap.put("startDate", startDate);
        jsonMap.put("endDate", endDate);
        jsonMap.put("requestedSeatCount", requestedSeatCount);
        jsonMap.put("totalRequestedDistance", totalRequestedDistance);
        jsonMap.put("totalAmount", totalAmount);
        jsonMap.put("passengerPhone", passengerPhone);
        jsonMap.put("passengerName", passengerName);
        jsonMap.put("endMeterReading", endMeterReading);
        jsonMap.put("startMeterReading", startMeterReading);
        jsonMap.put("finalStartDate", finalStartDate);
        jsonMap.put("finalEndDate", finalEndDate);
        jsonMap.put("finalTotalAmount", finalTotalAmount);
        jsonMap.put("status", status);
        return jsonMap;
    }
}
