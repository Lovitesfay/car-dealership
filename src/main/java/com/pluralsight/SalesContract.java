package com.pluralsight;

public class SalesContract extends Contract {

    private boolean isFinanced;

    public SalesContract(String date, String customerName, Vehicle vehicleSold) {
        super(date, customerName, vehicleSold);

        this.isFinanced = isFinanced;
    }


    public double getTotalPrice() {
        double price = getVehicleSold().getPrice();

        double salesTax = price * 0.05;
        double recordingFee = 100;

        double processingFee;

        if (price < 10000) {
            processingFee = 295;
        } else {
            processingFee = 495;
        }

        return price + salesTax + recordingFee + processingFee;
    }


    public double getMonthlyPayment() {

        if (!isFinanced) {
            return 0;
        }

        double total = getTotalPrice();

        if (total >= 10000) {
            return total / 48;
        } else {
            return total / 24;
        }
    }



}
