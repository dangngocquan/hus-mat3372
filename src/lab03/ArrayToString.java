package lab03;

// Exercise 2.4
public class ArrayToString {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.printf("Array to string: %s", arrayToString(array));
    }

    public static String arrayToString(int[] array) {
        StringBuilder str = new StringBuilder("[");
        for (int element : array) {
            str.append(element).append(", ");
        }
        if (str.length() > 1) {
            str.delete(str.length() - 2, str.length());
        }
        str.append("]");

        return str.toString();
    }
}
