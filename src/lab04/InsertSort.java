package lab04;

// Exercise 2.5
public class InsertSort {
    public static void main(String[] args) {
        int[] array = {9, 6, 4, 1, 5, 2, 7};
        System.out.println("Initial array: " + arrayToString(array));
        System.out.println("Sorting array ...");
        insertSort(array);
        System.out.println("Sorted array: " + arrayToString(array));
    }

    public static void insertSort(int[] array) {
        for (int index = 1; index < array.length; index++) {
            int indexChecking = index;
            System.out.printf("Insert element at index %d\n", index);
            while (indexChecking > 0 && array[indexChecking-1] > array[indexChecking]) {
                // swap
                int tempElement = array[indexChecking];
                array[indexChecking] = array[indexChecking-1];
                array[indexChecking-1] = tempElement;
                // update indexChecking
                indexChecking--;
                System.out.println("Array now: " + arrayToString(array));
            }
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
