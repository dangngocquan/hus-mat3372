package lab02;

import java.util.Scanner;

// Exercise 2.7
public class TestPalindromicPhrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = scanner.nextLine();
        scanner.close();

        System.out.printf("\"%s\" %s a palindrome phrase",
                str, isPalindromicPhrase(str)? "is" : "is not");
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

    public static boolean isPalindromicPhrase(String str) {
        String str1 = "";
        str = str.toLowerCase();
        String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
        for (int index = 0; index < str.length(); index++) {
            char c = str.charAt(index);
            if (chars.indexOf(c) != -1) {
                str1 += c;
            }
        }
        return isPalindromicWord(str1);
    }
}
