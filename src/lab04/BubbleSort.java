package lab04;

// Exercise 2.4
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {9, 2, 4, 1, 5};
        System.out.println("Initial array: " + arrayToString(array));
        System.out.println("Sorting array ...");
        bubbleSort(array);
        System.out.println("Sorted array: " + arrayToString(array));
    }

    public static void bubbleSort(int[] array) {
        int passCount = 1;
        boolean swapped;
        do {
            System.out.println("Pass " + passCount);
            swapped = false;
            for (int index = 1; index < array.length; index++) {
                if (array[index-1] > array[index]) {
                    // swap 2 elements
                    int tempElement = array[index-1];
                    array[index-1] = array[index];
                    array[index] = tempElement;
                    swapped = true;
                }
                System.out.printf("Checking index %d and %d. Array now: %s\n",
                        index-1, index, arrayToString(array));
            }
            passCount++;
        } while (swapped);
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
