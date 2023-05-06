package oop.principles.polymorphism;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Tính đa hình th hiện ở việc Overriding
    @Override
    public void greet() {
        System.out.println("Wooh");
    }
}
