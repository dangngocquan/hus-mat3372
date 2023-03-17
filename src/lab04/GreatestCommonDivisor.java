package lab04;

// Exercise 3.4
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.printf("gcd(%d,%d)", 15, 5);
        gcd(15, 5);
        System.out.printf("\ngcd(%d,%d)", 3456, 1233);
        gcd(3456, 1233);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            System.out.printf(" = %d", a);
            return a;
        }
        System.out.printf(" = gcd(%d,%d)", b, a%b);
        return gcd(b, a%b);
    }
}
