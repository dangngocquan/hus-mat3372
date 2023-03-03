package lab02;

import java.util.Scanner;

// Exercise 2.9
public class Bin2Dec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String str = scanner.next();
        scanner.close();

        if (!checkBinaryString(str)) {
            System.out.printf("Invalid binary string \"%s\"", str);
        } else {
            System.out.printf("The equivalent decimal number for binary \"%s\" is: %d",
                    str, convertBin2Dec(str));
        }

    }

    public static int convertBin2Dec(String binaryStr) {
        int decimal = 0;
        int temp = 1;
        for (int index = binaryStr.length() - 1; index >= 0; index--) {
            decimal += (binaryStr.charAt(index) - '0') * temp;
            temp *= 2;
        }
        return decimal;
    }

    public static boolean checkBinaryString(String str) {
        for (int index = 0; index < str.length(); index++) {
            char c = str.charAt(index);
            if (!(c == '0' || c == '1')) {
                return false;
            }
        }
        return true;
    }
}
