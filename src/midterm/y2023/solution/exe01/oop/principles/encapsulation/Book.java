package midterm.y2023.solution.exe01.oop.principles.encapsulation;

public class Book {
    // private instance variables
    private String name;
    private int price;

    // constructor
    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // getters and setters method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
