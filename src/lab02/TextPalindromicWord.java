package lab02;

import java.util.Scanner;

// Exercise 2.7
public class TextPalindromicWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = scanner.next();
        scanner.close();

        System.out.printf("\"%s\" %s a palindrome",
                str, isPalindromicWord(str)? "is" : "is not");
    }

    public static boolean isPalindromicWord(String str) {
        str = str.toLowerCase();
        int leftIndex = 0;
        int rightIndex = str.length() - 1;
        while (leftIndex < rightIndex) {
            if (str.charAt(leftIndex) != str.charAt(rightIndex)) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}
