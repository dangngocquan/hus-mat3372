package lab03;

import java.util.Scanner;

// Exercise 2.3
public class Print {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        double[] array2 = {1.2, 2.33, 3.444, 4.5555, 5.6666};
        float[] array3 = {1.2f, 2.33f, 3.444f, 4.5555f, 5.6666f};
        print(array1);
        print(array2);
        print(array3);
    }

    public static void print(int[] array) {
        StringBuilder str = new StringBuilder("[");
        for (int element : array) {
            str.append(element).append(", ");
        }
        if (str.length() > 1) {
            str.delete(str.length() - 2, str.length());
        }
        str.append("]");
        System.out.println(str);
    }

    public static void print(double[] array) {
        StringBuilder str = new StringBuilder("[");
        for (double element : array) {
            str.append(element).append(", ");
        }
        if (str.length() > 1) {
            str.delete(str.length() - 2, str.length());
        }
        str.append("]");
        System.out.println(str);
    }

    public static void print(float[] array) {
        StringBuilder str = new StringBuilder("[");
        for (float element : array) {
            str.append(element).append(", ");
        }
        if (str.length() > 1) {
            str.delete(str.length() - 2, str.length());
        }
        str.append("]");
        System.out.println(str);
    }
}
