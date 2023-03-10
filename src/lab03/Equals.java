package lab03;

// Exercise 2.7
public class Equals {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 6};
        System.out.printf("Is equals arrays? %s", equals(array1, array2));
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            return false;
        }

        if (array1.length != array2.length) {
            return false;
        }

        for (int index = 0; index < array1.length; index++) {
            if (array1[index] != array2[index]) {
                return false;
            }
        }

        return true;
    }
}
