package lab03;

import java.util.Scanner;

// Exercise 1.4
public class Hex2Bin {
    private static final String[] HEX_BITS = {
            "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hex = scanner.next();
        scanner.close();

        if (checkValidHexString(hex.toUpperCase())) {
            System.out.printf("The equivalent binary for hexadecimal \"%s\" is: %s",
                    hex, hex2Bin(hex.toUpperCase()));
        } else {
            System.out.println("Your input is not Hexadecimal string.");
        }
    }

    public static boolean checkValidHexString(String hex) {
        String validChars = "0123456789ABCDEF";
        for (int index = 0; index < hex.length(); index++) {
            char c = hex.charAt(index);
            if (hex.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    public static String hex2Bin(String hex) {
        String bin = "";
        String validChars = "0123456789ABCDEF";
        for (int index = 0; index < hex.length(); index++) {
            char c = hex.charAt(index);
            bin += HEX_BITS[validChars.indexOf(c)] + " ";
        }
        return bin.trim();
    }
}
