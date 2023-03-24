package lab05.exercise2p8.client;

import lab05.exercise2p8.service.MyCircle;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle(0, 0, 6);
        System.out.println(circle1);

        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircumference());
        System.out.println(circle1.getCenter());
    }
}
