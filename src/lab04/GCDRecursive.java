package lab04;

// Exercise 1.4
public class GCDRecursive {
    public static void main(String[] args) {
        System.out.printf("GCD(%d,%d) = %d\n", 10, 135, gcd(10, 135));
        System.out.printf("GCD(%d,%d) = %d\n", 98, 123, gcd(98, 123));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
}
