package lab03;

// Exercise 2.9
public class Swap {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        System.out.printf("Initial array 1: %s\n", arrayToString(array1));
        System.out.printf("Initial array 2: %s\n", arrayToString(array2));
        System.out.println("After swap");
        swap(array1, array2);
        System.out.printf("Array 1: %s\n", arrayToString(array1));
        System.out.printf("Array 2: %s\n", arrayToString(array2));
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int index = 0; index < array1.length; index++) {
            int temp = array1[index];
            array1[index] = array2[index];
            array2[index] = temp;
        }
        return true;
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
