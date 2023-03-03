package lab02;

import java.util.Scanner;

// Exercise 2.2
public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scanner.next();
        scanner.close();

        printCountVowelsDigits(str);
    }

    public static boolean isVowel(char c) {
        String vowels = "ueoaiUEOAI";
        return !(vowels.indexOf(c) == -1);
    }

    public static boolean isDigit(char c) {
        String digits = "0123456789";
        return !(digits.indexOf(c) == -1);
    }

    public static int countVowels(String str) {
        int count = 0;
        for (int index = 0; index < str.length(); index++) {
            count += (isVowel(str.charAt(index)))? 1 : 0;
        }
        return count;
    }

    public static int countDigits(String str) {
        int count = 0;
        for (int index = 0; index < str.length(); index++) {
            count += (isDigit(str.charAt(index)))? 1 : 0;
        }
        return count;
    }

    public static void printCountVowelsDigits(String str) {
        int countVowel = countVowels(str);
        int countDigit = countDigits(str);
        System.out.printf("Number of vowels: %d (%.2f%%)\n",
                countVowel, countVowel * 100.0 / str.length());
        System.out.printf("Number of digits: %d (%.2f%%)\n",
                countDigit, countDigit * 100.0 / str.length());
    }
}
