package midterm.y2023.solution.exe01.oop.principles.polymorphism;

public class Dog extends Animal {
    // constructor
    public Dog(String name) {
        super(name);
    }

    // override method
    @Override
    public void greet() {
        System.out.println("Woh");
    }

    @Override
    public void eat() {
        System.out.println("Eat");
    }

    @Override
    public void eat(int times) {
        System.out.println("Eat " + times + " times");
    }
}
