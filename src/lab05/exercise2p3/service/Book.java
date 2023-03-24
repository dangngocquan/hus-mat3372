package lab05.exercise2p3.service;

public class Book {
    // private instance variables
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty;

    // constructors
    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // Getters and Setters
    public String getIsbn() {
        return isbn;
    }

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

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName() {
        return author.getName();
    }

    public String toString() {
        return String.format("Book[isbn = %s, name = %s, %s, price = %s, qty = %s",
                isbn, name, author.toString(), price, qty);
    }
}
