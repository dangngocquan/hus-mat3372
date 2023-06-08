package midterm.y2023.solution.exe01.oop.principles.abstraction;

public class Test {
    public static void main(String[] args) {
        // class Shape là một lớp trừu tượng (abstract class), trong đó có thể chứa các phương
        // thức trừu tượng (abstract method) (chưa định nghĩa phần body của phương thức)

        // interface Movable cũng chứa các phương thức trừu tượng (abstract method),
        // cung cấp cho Shape

        Shape circle = new Circle(1, 1, 10);
        System.out.println(circle); // Circle[center = (1, 1), radius = 10]
        System.out.println("area = " + circle.area());  // area = 314.1592653589793
        System.out.println("perimeter = " + circle.perimeter());    // perimeter = 62.83185307179586

        circle.moveDown(3);
        System.out.println(circle); // Circle[center = (1, -2), radius = 10]



        Shape square = new Square(0, 3, 4); // Square[center = (0, 3), side = 4]
        System.out.println(square);
        System.out.println("area = " + square.area());  // area = 16.0
        System.out.println("perimeter = " + square.perimeter());    // perimeter = 16.0

        square.moveLeft(3);
        System.out.println(square); // Square[center = (-3, 3), side = 4]

    }
}
