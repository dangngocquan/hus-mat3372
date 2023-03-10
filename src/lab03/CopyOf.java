package lab03;

// Exercise 2.8
public class CopyOf {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.printf("Initial array: %s\n", arrayToString(array));
        System.out.printf("Array copy: %s\n", arrayToString(copyOf(array)));
        System.out.printf("Array copy with new length: %s\n",
                arrayToString(copyOf(array, 8)));

    }

    public static int[] copyOf(int[] array) {
        int[] copyArray = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            copyArray[index] = array[index];
        }
        return copyArray;
    }

    public static int[] copyOf(int[] array, int newLength) {
        if (newLength <= 0) {
            return null;
        }
        int[] copyArray = new int[newLength];
        for (int index = 0; index < newLength; index++) {
            if (index < array.length) {
                copyArray[index] = array[index];
            } else {
                copyArray[index] = 0;
            }
        }
        return copyArray;
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
