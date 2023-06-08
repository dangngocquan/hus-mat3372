package midterm.y2023.solution.exe01.oop.principles.polymorphism;

public abstract class Animal {
    // private instance variables
    private String name;

    // constructor
    public Animal(String name) {
        this.name = name;
    }

    // getter and setter method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // method: greet
    public abstract void greet();

    public abstract void eat();

    public abstract void eat(int times);
}
