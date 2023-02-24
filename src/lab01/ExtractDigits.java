package lab01;

// Exercise 3.5
public class ExtractDigits {
    public static void main(String[] args) {
        extractDigits(15423);
    }

    public static void extractDigits(int number) {
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit + " ");
            number /= 10;
        }
    }
}
