package oop.principles.polymorphism;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    // Tính đa hình th hiện ở việc Overriding
    @Override
    public void greet() {
        System.out.println("Mew");
    }

    // Tính đa hình thể hiện ở việc Overloadding
    // Có nhiều phưng thức có cùng tên phương thức nhưng có các
    // tham số đầu vào khác nhau
    public void eat() {
        System.out.println("eat");
    }

    public void eat(int times) {
        System.out.println("Eat " + times + " times");
    }
}
