package lab01;

// Exercise 2.2
public class CheckOddEven {
    public static void main(String[] args) {
        checkOddEven(0);
        checkOddEven(1);
        checkOddEven(88);
        checkOddEven(99);
        checkOddEven(-1);
        checkOddEven(-2);
    }

    public static void checkOddEven(int number) {
        System.out.println("The number is " + number);
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        System.out.println("Bye!");
    }
}
