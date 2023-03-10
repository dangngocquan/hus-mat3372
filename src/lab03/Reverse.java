package lab03;

// Exercise 2.10
public class Reverse {
    public static void main(String[] args) {
        int[] array = {6, 7, 8, 9, 10};
        System.out.printf("Initial array: %s\n", arrayToString(array));
        System.out.println("After reverse");
        reverse(array);
        System.out.printf("Array: %s\n", arrayToString(array));
    }

    public static void reverse(int[] array) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while (leftIndex < rightIndex) {
            int tempValue = array[leftIndex];
            array[leftIndex] = array[rightIndex];
            array[rightIndex] = tempValue;
            leftIndex++;
            rightIndex--;
        }
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
