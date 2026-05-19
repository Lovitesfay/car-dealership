package com.pluralsight;

public class Contract {
protected String Date;
protected String CustomerName;
protected Vehicle vehicleSold;


    public Contract(String date, String customerName, Vehicle vehicleSold){
        this.Date = date;
        this.CustomerName = customerName;
        this.vehicleSold = vehicleSold;

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
