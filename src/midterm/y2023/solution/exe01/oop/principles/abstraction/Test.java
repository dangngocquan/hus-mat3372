package oop.principles.abstraction;

public class Test {
    public static void main(String[] args) {
        Movable circle = new Circle(0, 0, 2);
        System.out.println(circle);
        // Các hình có thể di chuyển vì implement interface Movable
        circle.moveUp(3);
        System.out.println(circle);

        Movable square = new Square(0, 0, 2);
        System.out.println(square);
        // Các hình có thể di chuyển vì implement interface Movable
        square.moveDown(5);
        System.out.println(square);
    }
}
