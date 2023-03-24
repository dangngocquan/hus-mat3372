package lab05.exercise2p4.service;

public class Customer {
    // private instance variables
    private int id;
    private String name;
    private int discount;

    // constructors
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String toString() {
        return String.format("%s(%d)(%d%%)", name, id, discount);
    }
}
