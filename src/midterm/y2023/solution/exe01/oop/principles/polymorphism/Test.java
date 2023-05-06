package oop.principles.polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat("Cat");
        Animal dog = new Dog("Dog");
        // Override
        cat.greet(); // Mew
        dog.greet(); // Wooh

        // Overload
        ((Cat) cat).eat(); // eat
        ((Cat) cat).eat(3); // Eat 3 times
    }
}
