package lab06.exercise1p5;

public class Mammal extends Animal {
    // constructors
    public Mammal(String name) {
        super(name);
    }

    // Method
    public String toString() {
        return String.format("Mammal[%s]", super.toString());
    }
}
