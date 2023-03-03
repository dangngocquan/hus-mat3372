package lab02;

import java.util.Scanner;

// Exercise 2.10
public class Hex2Dec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String str = scanner.next();
        scanner.close();

        if (!checkHexString(str)) {
            System.out.printf("Invalid hex string \"%s\"", str);
        } else {
            System.out.printf("The equivalent decimal number for hexadecimal \"%s\" is: %d",
                    str, convertHex2Dec(str));
        }

    }

    public static int convertHex2DecChar(char c) {
        String digits = "0123456789";
        String chars = "ABCDEF";
        if (digits.indexOf(c) != -1) {
            return c - '0';
        } else if (chars.indexOf(c) != -1) {
            return 10 + (c - 'A');
        } else {
            return 0;
        }
    }

    public static int convertHex2Dec(String hexStr) {
        hexStr = hexStr.toUpperCase();
        int decimal = 0;
        int temp = 1;
        for (int index = hexStr.length() - 1; index >= 0; index--) {
            decimal += (convertHex2DecChar(hexStr.charAt(index))) * temp;
            temp *= 16;
        }
        return decimal;
    }

    public static boolean checkHexString(String str) {
        str = str.toUpperCase();
        String chars = "0123456789ABCDEF";
        for (int index = 0; index < str.length(); index++) {
            char c = str.charAt(index);
            if (chars.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
