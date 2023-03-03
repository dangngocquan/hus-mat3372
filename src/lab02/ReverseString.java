package lab02;

import java.util.Scanner;

// Exercise 2.1
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scanner.next();
        scanner.close();

        System.out.printf("The reverse of the String \"%s\" is \"%s\"",
                str, reverseString(str));
    }

    public static String reverseString(String str) {
        String strReverse = "";
        for (int index = 0; index < str.length(); index++) {
            strReverse = str.charAt(index) + strReverse;
        }
        return strReverse;
    }
}
