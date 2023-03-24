package lab05.exercise2p9.client;

import lab05.exercise2p9.service.MyTriangle;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle triangle1 = new MyTriangle(0, 0, 0, 1, 1, 0);
        System.out.println(triangle1);

        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle1.getType());
    }
}
