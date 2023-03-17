package lab04;

// Exercise 1.2
public class FibonacciRecursive {
    public static void main(String[] args) {
        System.out.println("Fibonacci of n = 3: " + fibonacci(3));
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
