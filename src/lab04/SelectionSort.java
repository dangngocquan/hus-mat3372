package lab04;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {9, 6, 4, 1, 5};
        System.out.println("Initial array: " + arrayToString(array));
        System.out.println("Sorting array ...");
        selectionSort(array);
        System.out.println("Sorted array: " + arrayToString(array));
    }

    public static void selectionSort(int[] array) {
        for (int selectionIndex = 0; selectionIndex < array.length; selectionIndex++) {
            System.out.printf("Finding element for index %d. ", selectionIndex);
            // found index of min element
            int minElement = array[selectionIndex];
            int indexOfMinElement = selectionIndex;
            for (int index = selectionIndex; index < array.length; index++) {
                if (array[index] < minElement) {
                    minElement = array[index];
                    indexOfMinElement = index;
                }
            }
            // swap 2 elements
            System.out.printf("Swap element at index %d and element at index %d. ",
                    selectionIndex, indexOfMinElement);
            array[indexOfMinElement] = array[selectionIndex];
            array[selectionIndex] = minElement;

            System.out.println("Array now: " + arrayToString(array));
        }
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
