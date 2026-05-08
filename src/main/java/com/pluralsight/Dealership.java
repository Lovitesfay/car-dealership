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

    public ArrayList<Vehicle>getVehiclesByPrice(double min, double max) {

        ArrayList<Vehicle> results = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >=min &&
                    vehicle.getPrice() <= max){
                results.add(vehicle);
            }
        }

    return results;
    }

    public ArrayList<Vehicle>getVehiclesByMakeModel() {


        return this.inventory;
    }

    public ArrayList<Vehicle>getVehicleByYear() {
        getVehicleByYear();
        return this.inventory;
    }

    public ArrayList<Vehicle>getVehiclesByColor() {
        getVehiclesByColor();
        return this.inventory;
    }

    public ArrayList<Vehicle>getVehiclesByMileage() {
        getVehiclesByMileage();
        return this.inventory;

    }
    public ArrayList<Vehicle>getVehicleByType(){
        getVehicleByType();
        return this.inventory;

    }
    public ArrayList<Vehicle>getAllVehicles(){
       getAllVehicles();
        return this.inventory;
    }

    public void addVehicle(Vehicle vehicle) {
        this.inventory.add(vehicle);
    }
    public void remove(Vehicle vehicle){
        this.inventory.remove(vehicle);

    }
}



