package com.pluralsight;

public class Contract {
protected String Date;
protected String CustomerName;
protected String CustomerEmail;
protected Vehicle vehicleSold;
protected double  totalPrice;
protected double payment;

    public Contract(String date, String customerName, String customerEmail, Vehicle vehicleSold, double totalPrice, double payment) {
        Date = date;
        CustomerName = customerName;
        CustomerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
        this.totalPrice = totalPrice;
        this.payment = payment;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public Vehicle getVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(Vehicle vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    public double getTotalPrice() {
        return 0;
    }

    public double getMonthlyPayment() {
        return 0;
    }
}
