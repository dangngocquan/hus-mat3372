package lab05.exercise2p5.service;

public class Customer {
    // private instance variables
    private int ID;
    private String name;
    private char gender;

    // constructor
    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    // Getters
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return String.format("%s(%d)", name, ID);
    }
}
