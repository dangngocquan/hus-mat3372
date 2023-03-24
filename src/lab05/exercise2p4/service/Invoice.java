package lab05.exercise2p4.service;

public class Invoice {
    // private instance variables
    private int id;
    private Customer customer;
    private double amount;

    // constructor
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerID() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return amount * (100 - getCustomerDiscount()) / 100;
    }

    public String toString() {
        return String.format("Invoice[id = %d, customer = %s, amount = %s]",
                id, customer.toString(), amount);
    }
}
