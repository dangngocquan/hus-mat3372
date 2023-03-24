package lab05.exercise1p1.client;

import lab05.exercise1p1.service.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.0);
        Circle circle3 = new Circle(3.0, "blue");
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
    }
}
