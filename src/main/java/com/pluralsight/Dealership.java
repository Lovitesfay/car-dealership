package com.pluralsight;
import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.inventory = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public Dealership setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Dealership setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Dealership setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ArrayList<Vehicle>getVehiclesByPrice() {
        return null;

    }

    public ArrayList<Vehicle>getVehiclesByMakeModel() {
        return null;
    }

    public ArrayList<Vehicle>getVehicleByYear() {
        return null;
    }

    public ArrayList<Vehicle>getVehiclesByColor() {
        return null;
    }

    public ArrayList<Vehicle>getVehiclesByMileage() {
        return null;

    }
    public ArrayList<Vehicle>getVehicleByType(){
        return null;

    }
    public ArrayList<Vehicle>getAllVehicles(){
        return null;
    }

    public void addVehicle(vehicle) {
        this.inventory.add(vehicle);
    }
    public void remove(vehicle){
        this.inventory.remove(vehicle);
    }
}



