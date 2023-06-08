package midterm.y2023.solution.exe01.oop.principles.polymorphism;

public class Test {
    public static void main(String[] args) {
        // Taọ 2 instance Animal
        Animal cat = new Cat("Cat");
        Animal dog = new Dog("Dog");

        // Override
        // Tính đa hình thể hiện ở Override: cùng là instance Animal nhưng khi sử dụng
        // phương thức greet() thì instance cat và instance dog cho ra 2 output khác nhau
        cat.greet(); // Mew
        dog.greet(); // Woh

        // Overload
        // Tính đa hình còn thể hiện ở Overload: phương thức có cùng tên nhưng tham số đầu
        // vào khác nhau
        cat.eat(); // Eat
        cat.eat(3); // Eat 3 times
    }
}
