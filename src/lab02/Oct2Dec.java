package lab02;

import java.util.Scanner;

// Exercise 2.11
public class Oct2Dec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Octal string: ");
        String str = scanner.next();
        scanner.close();

        if (!checkOctString(str)) {
            System.out.printf("Invalid octal string \"%s\"", str);
        } else {
            System.out.printf("The equivalent decimal number \"%s\" is: %d",
                    str, convertOct2Dec(str));
        }

    }

    public static int convertOct2DecChar(char c) {
        return c - '0';
    }

    public static int convertOct2Dec(String hexStr) {
        hexStr = hexStr.toUpperCase();
        int decimal = 0;
        int temp = 1;
        for (int index = hexStr.length() - 1; index >= 0; index--) {
            decimal += (convertOct2DecChar(hexStr.charAt(index))) * temp;
            temp *= 8;
        }
        return decimal;
    }

    public static boolean checkOctString(String str) {
        str = str.toUpperCase();
        String chars = "01234567";
        for (int index = 0; index < str.length(); index++) {
            char c = str.charAt(index);
            if (chars.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
