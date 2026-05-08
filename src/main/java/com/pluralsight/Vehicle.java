package com.pluralsight;

public class Vehicle {
    private int vin;
    private int year;
    private String make;
    private String model;
    private String vehicleType = ("car, truck, etc.");
    private String color;
    private int odometer;
    private double price;

    public Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

    public int getVin() {
        return vin;
    }

    public Vehicle setVin(int vin) {
        this.vin = vin;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Vehicle setYear(int year) {
        this.year = year;
        return this;
    }

    public String getMake() {
        return make;
    }

    public Vehicle setMake(String make) {
        this.make = make;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Vehicle setModel(String model) {
        this.model = model;
        return this;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public Vehicle setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Vehicle setColor(String color) {
        this.color = color;
        return this;
    }

    public int getOdometer() {
        return odometer;
    }

    public Vehicle setOdometer(int odometer) {
        this.odometer = odometer;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Vehicle setPrice(double price) {
        this.price = price;
        return this;
    }

    @Override

    public String toString(){
        return this.vin + " | " +
               this.year + " | " +
               this.make + " | " +
               this.vehicleType + " | " +
               this.color + " | " +
               this.odometer + " | $" +
               this.price;
    }
}
