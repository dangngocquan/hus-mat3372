package lab05.exercise2p7.client;

import lab05.exercise2p7.service.MyLine;

public class TestMyLine {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(0, 0, 0, 5);
        System.out.println(line1);

        System.out.println(line1.getLength());
        System.out.println(line1.getGradient());
    }
}
