package lab05.exercise1p8.client;

import lab05.exercise1p8.service.MyPolynomial;

public class TestMain {
    public static void main(String[] args) {
        // Test constructors and toString()
        MyPolynomial polynomial1 = new MyPolynomial(1, 2);
        MyPolynomial polynomial2 = new MyPolynomial(1, 2, 3);
        System.out.println(polynomial1);
        System.out.println(polynomial2);

        // Test evaluate()
        System.out.println(polynomial1.evaluate(2));

        // Test add()
        System.out.println(polynomial1.add(polynomial2));

        // Test multiply
        System.out.println(polynomial1.multiply(polynomial2));
    }
}
