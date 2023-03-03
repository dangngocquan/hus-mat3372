package lab02;

import java.util.Scanner;

// Exercise 2.4
public class CaesarsCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String str = scanner.next().toUpperCase();
        scanner.close();

        System.out.printf("The ciphertext string is: %s", ciphertext(str, 3));

    }

    public static String ciphertext(String plainText, int n) {
        String cipherText = "";
        for (int index = 0; index < plainText.length(); index++) {
            cipherText += convertChar(plainText.charAt(index), n);
        }
        return cipherText;
    }

    public static char convertChar(char c, int n) {
        char c1 = c;
        while (n-- > 0) {
            c1 =  (char)(c1 + 1);
            if (c1 > 'Z') {
                c1 = 'A';
            }
        }
        return c1;
    }
}
