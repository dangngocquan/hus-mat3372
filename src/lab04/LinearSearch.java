package lab04;

// Exercise 2.1
public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int key = 5;
        System.out.println("Array: " + arrayToString(array));
        System.out.println("Key: " + key);
        System.out.println("Is the key in array? " + linearSearch(array, key));
        System.out.println("Index of the key in array? " + linearSearchIndex(array, key));
    }

    public static boolean linearSearch(int[] array, int key) {
        for (int element: array) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == key) {
                return index;
            }
        }
        return -1;
    }

    public static String arrayToString(int[] array) {
        StringBuilder str = new StringBuilder("[");
        for (int element: array) {
            str.append(element).append(", ");
        }
        if (str.length() > 1) {
            str.delete(str.length() - 2, str.length());
        }
        str.append("]");
        return str.toString();
    }
}
