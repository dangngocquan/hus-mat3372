package lab04;

// Exercise 2.2
public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 6, 9, 11, 15, 22, 23, 55, 104};
        int key1 = 11;
        int key2 = 104;
        int key3 = 99;
        System.out.println("Array: " + arrayToString(array));
        System.out.println("Key 1: " + key1);
        System.out.println("Key 2: " + key2);
        System.out.println("Key 3: " + key3);
        System.out.println("Is the key 1 in array? " + binarySearch(array, key1, 0, array.length));
        System.out.println("Is the key 1 in array? " + binarySearch(array, key2, 0, array.length));
        System.out.println("Is the key 1 in array? " + binarySearch(array, key3, 0, array.length));

    }

    // search from index 'fromIndex' to 'toIndex - 1'
    public static boolean binarySearch(int[] array,int key, int fromIndex, int toIndex) {
        if (fromIndex == toIndex - 1) {
            if (array[fromIndex] == key) {
                return true;
            }
            return false;
        }

        int middleIndex = (fromIndex + toIndex) / 2;
        int middleElement = array[middleIndex];
        if (key == middleElement) {
            return true;
        } else if (key < middleElement) {
            return binarySearch(array, key, fromIndex, middleIndex);
        } else {
            return binarySearch(array, key, middleIndex + 1, toIndex);
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
