package lab03;

// Exercise 2.5
public class Contains {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int key = 7;
        System.out.printf("Array contains key? %s", contains(array, key));
    }

    public static boolean contains(int[] array, int key) {
        for (int element : array) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }
}
