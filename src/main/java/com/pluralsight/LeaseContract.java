package com.pluralsight;

public class LeaseContract extends Contract {


    public LeaseContract(String date, String customerName, Vehicle vehicleSold) {
        super(date, customerName  , vehicleSold);
    }

    public double getTotalPrice() {

        double price = getVehicleSold().getPrice();

        double expectedEndingValue = price * 0.5;

        double leaseFee = price * 0.07;

        return expectedEndingValue + leaseFee;
    }
}



