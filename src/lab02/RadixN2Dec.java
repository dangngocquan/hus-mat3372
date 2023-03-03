package lab02;

import java.util.Scanner;

// Exercise 2.12
public class RadixN2Dec {
    public static String[] chars = {"" , "0", "01", "012", "0123", "01234", "012345", "0123456",
            "01234567", "012345678", "0123456789", "0123456789A", "0123456789AB", "0123456789ABC",
            "0123456789ABCD", "0123456789ABCDE", "0123456789ABCDEF"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a radix (2-16): ");
        int radix = scanner.nextInt();
        System.out.printf("Enter a number string radix%d: ", radix);
        String str = scanner.next();
        scanner.close();

        if (!checkRadixNString(str, radix)) {
            System.out.printf("Invalid radix%d string \"%s\"", radix, str);
        } else {
            System.out.printf("The equivalent decimal number \"%s\" is: %d",
                    str, convertRadixN2Dec(str, radix));
        }

    }

    public static int convertRadixN2DecChar(char c, int radix) {
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

    public static int convertRadixN2Dec(String str, int radix) {
        str = str.toUpperCase();
        int decimal = 0;
        int temp = 1;
        for (int index = str.length() - 1; index >= 0; index--) {
            decimal += (convertRadixN2DecChar(str.charAt(index), radix)) * temp;
            temp *= radix;
        }
        return decimal;
    }

    public static boolean checkRadixNString(String str, int radix) {
        str = str.toUpperCase();
        for (int index = 0; index < str.length(); index++) {
            char c = str.charAt(index);
            if (chars[radix].indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
