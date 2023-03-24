package lab05.exercise1p7.client;

import lab05.exercise1p7.service.MyComplex;

import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        // Get input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        MyComplex complex1 = new MyComplex(scanner.nextDouble(), scanner.nextDouble());
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        MyComplex complex2 = new MyComplex(scanner.nextDouble(), scanner.nextDouble());
        scanner.close();

        // Test
        printInfoComplex(complex1);
        printInfoComplex(complex2);
        printCompareComplexs(complex1, complex2);
        printSumComplexs(complex1, complex2);
    }

    public static void printInfoComplex(MyComplex complex) {
        System.out.printf("Number 1 is: (%s).%n", complex);
        System.out.printf("(%s) is%s a pure real number%n",
                complex,
                complex.isReal()? " " : " NOT");
        System.out.printf("(%s) is%s a pure imaginary number%n",
                complex,
                complex.isImaginary()? " " : " NOT");
    }

    public static void printCompareComplexs(MyComplex complex1, MyComplex complex2) {
        System.out.printf("(%s) is%s equal to (%s)%n",
                complex1,
                complex1.equals(complex2)? " " : " NOT",
                complex2);
    }

    public static void printSumComplexs(MyComplex complex1, MyComplex complex2) {
        System.out.printf("(%s) + (%s) = (%s)%n",
                complex1, complex2, complex1.addNew(complex2));
    }
}
