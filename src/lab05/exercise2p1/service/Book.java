package lab05.exercise2p1.service;

public class Book {
    // private instance variables
    private String name;
    private Author author;
    private double price;
    private int qty;

    // constructors
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    // Setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return String.format("Book[name = %s, %s, price = %s, qty = %s]",
                name, author.toString(), price, qty);
    }
}
