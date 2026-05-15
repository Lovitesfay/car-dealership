public class Contract {
protected String Date;
protected String CustomerName;
protected String CustomerEmail;
protected String vehicleSold;
protected double  totalPrice;
protected double payment;

    public Contract(String date, String customerName, String customerEmail, String vehicleSold, double totalPrice, double payment) {
        Date = date;
        CustomerName = customerName;
        CustomerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
        this.totalPrice = totalPrice;
        this.payment = payment;
    }
}
