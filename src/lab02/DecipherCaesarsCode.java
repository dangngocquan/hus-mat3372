package lab02;

import java.util.Scanner;

// Exercise 2.5
public class DecipherCaesarsCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String str = scanner.next().toUpperCase();
        scanner.close();

        System.out.printf("The plaintext string is: %s", deciphertext(str, 3));

    }

    public static String deciphertext(String cipherText, int n) {
        String text = "";
        for (int index = 0; index < cipherText.length(); index++) {
            text += convertChar(cipherText.charAt(index), n);
        }
        return text;
    }

    public static char convertChar(char c, int n) {
        char c1 = c;
        while (n-- > 0) {
            c1 =  (char)(c1 - 1);
            if (c1 < 'A') {
                c1 = 'Z';
            }
        }
        return c1;
    }
}
