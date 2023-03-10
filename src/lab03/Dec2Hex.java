package lab03;

import java.util.Scanner;

// Exercise 1.5
public class Dec2Hex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        String dec = scanner.next();
        scanner.close();

        if (checkValidDec(dec)) {
            System.out.printf("The equivalent hexadecimal number is: %s", dec2Hex(dec));
        } else {
            System.out.println("Your input is not decimal number.");
        }
    }

    public static boolean checkValidDec(String dec) {
        String validChars = "0123456789";
        for (int index = 0; index < dec.length(); index++) {
            char c = dec.charAt(index);
            if (validChars.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    public static String dec2Hex(String dec) {
        int valueDec = Integer.valueOf(dec);
        String hexChars = "0123456789ABCDEF";
        String hex = "";
        while (valueDec > 0) {
            hex = hexChars.charAt(valueDec % 16) + hex;
            valueDec /= 16;
        }
        return hex;
    }
}
