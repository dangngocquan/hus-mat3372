package lab04;

// Exercise 1.3
public class LengthOfARunningNumberSequenceRecursive {
    public static void main(String[] args) {
        for (int num = 1; num < 20; num++) {
            System.out.printf("Length of S(%d) is: %d\n", num, lenOfSn(num));
        }
    }

    public static int lenOfSn(int n) {
        if (n == 1) {
            return 1;
        }
        return (n + "").length() + lenOfSn(n-1);
    }
}
