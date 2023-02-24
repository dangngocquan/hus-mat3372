package lab01;

// Exercise 1.1
public class Factorial {
    public static void main(String[] args) {
        int n = 20;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("The Factorial of " + n + " is " + factorial);
    }
}
