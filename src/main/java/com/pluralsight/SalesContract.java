package com.pluralsight;

public class SalesContract extends Contract {
    private double salesTaxAmount;
    private double recordingFee;
    private double processingFee;
    private boolean finance;

    public SalesContract(String date, String customerName, String customerEmail, Vehicle vehicleSold, double totalPrice, double payment) {
        super(date, customerName, customerEmail, vehicleSold, totalPrice, payment);

    }

    @Override
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

        if (!finance) {
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
