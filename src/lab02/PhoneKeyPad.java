package lab02;

import java.util.Scanner;

// Exercise 2.3
public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scanner.next().toLowerCase();
        scanner.close();

        printPhoneKeyPad(str);
    }

    public static void printPhoneKeyPad(String str) {
        for (int index = 0; index < str.length(); index++) {
            System.out.print(convertCharToPhoneKey(str.charAt(index)));
        }
    }

    public static char convertCharToPhoneKey(char c) {
        if ("abc".indexOf(c) != -1) {
            return '2';
        } else if ("def".indexOf(c) != - 1) {
            return '3';
        } else if ("ghi".indexOf(c) != - 1) {
            return '4';
        } else if ("jkl".indexOf(c) != - 1) {
            return '5';
        } else if ("mno".indexOf(c) != - 1) {
            return '6';
        } else if ("pqrs".indexOf(c) != - 1) {
            return '7';
        } else if ("tuv".indexOf(c) != - 1) {
            return '8';
        } else if ("wxyz".indexOf(c) != - 1) {
            return '9';
        }
        return '0';
    }
}
