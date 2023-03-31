package lab06.exercise1p5;

public class Animal {
    // private variables
    private String name;

    // constructors
    public Animal(String name) {
        this.name = name;
    }

    // Method
    public String toString() {
        return String.format("Animal[name = %s]", name);
    }
}
