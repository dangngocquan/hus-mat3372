package lab05.exercise2p2.service;

public class Book {
    // private instance variables
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    // constructors
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
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
        StringBuilder str = new StringBuilder();
        str.append("Book[name = ").append(name).append(", authors = {");
        for (Author author: authors) {
            str.append(author.toString()).append(", ");
        }
        str.delete(str.length()-2, str.length());
        str.append("}, price = ").append(price).append(", qty = ").append(qty).append("]");
        return str.toString();
    }
}
