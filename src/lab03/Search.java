package lab03;

public class Search {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int key = 3;
        System.out.printf("Search index of key %d is: %d",
                key, search(array, key));
    }

    public static int search(int[] array, int key) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == key) {
                return index;
            }
        }
        return -1;
    }
}
