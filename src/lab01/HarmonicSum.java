package lab01;

// 3.2
public class HarmonicSum {
    public static void main(String[] args) {
        int MAX_DENOMINATOR = 50000;
        double sumL2R = getSumL2R(MAX_DENOMINATOR);
        double sumR2L = getSumR2L(MAX_DENOMINATOR);
        double absDiff;
        if (sumL2R > sumR2L) {
            absDiff = sumL2R - sumR2L;
        } else {
            absDiff = sumR2L - sumL2R;
        }
        System.out.println("Sum from left-to-right is: " + sumL2R);
        System.out.println("Sum from right-to-left is: " + sumR2L);
        System.out.println("Absolute different between two sums is " + absDiff);
    }

    public static double getSumL2R(int n) {
        double sum = 0.0;
        for (int demoninator = 1; demoninator <= n; demoninator++) {
            sum += 1.0 / demoninator;
        }
        return sum;
    }

    public static double getSumR2L(int n) {
        double sum = 0.0;
        for (int demoninator = n; demoninator >= 1; demoninator--) {
            sum += 1.0 / demoninator;
        }
        return sum;
    }
}
