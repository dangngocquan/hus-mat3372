package lab02;

import java.util.Scanner;

// Exercise 2.6
public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String str = scanner.next().toUpperCase();
        scanner.close();

        System.out.printf("The ciphertext string is: %s", ciphertext(str));

    }

    public static String ciphertext(String plainText) {
        String cipherText = "";
        for (int index = 0; index < plainText.length(); index++) {
            cipherText += convertChar(plainText.charAt(index));
        }
        return cipherText;
    }

    public static char convertChar(char c) {
        return (char)('A' + 'Z' - c);
    }
}
