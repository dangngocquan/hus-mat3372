package lab05.exercise2p10.client;

import lab05.exercise2p10.service.MyRectangle;

public class TestRectangle {
    public static void main(String[] args) {
        // Test constructors and toString()
        MyRectangle rectangle1 = new MyRectangle(0, 0, 10, 5);
        System.out.println(rectangle1);
        // Test method
        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.getHeight());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
    }
}
