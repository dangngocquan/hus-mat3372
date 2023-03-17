package lab04;

// Exercise 1.1
public class FactorialRecursive {
    public static void main(String[] args) {
        System.out.println("Factorial of n = 4: " + factorial(4));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
