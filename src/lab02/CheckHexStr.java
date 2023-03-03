package lab02;

import java.util.Scanner;

// Exercise 2.8
public class CheckHexStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String str = scanner.next();
        scanner.close();

        System.out.printf("\"%s\" %s a hex string",
                str, (checkHexStr(str))? "is" : "is NOT");
    }

    public static boolean checkHexChar(char c) {
        String chars = "0123456789ABCDEF";
        return chars.indexOf(c) != -1;
    }

    public static boolean checkHexStr(String str) {
        str =str.toUpperCase();
        for (int index = 0; index < str.length(); index++) {
            if (!checkHexChar(str.charAt(index))) {
                return false;
            }
        }
        return true;
    }
}
