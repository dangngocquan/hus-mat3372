package lab03;

import java.util.Scanner;

// Exercise 2.11
public class GradesStatistics2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        int[] grades = new int[numStudents];
        for (int indexStudent = 0; indexStudent < numStudents; indexStudent++) {
            System.out.printf("Enter the grade for student %d: ", indexStudent + 1);
            grades[indexStudent] = scanner.nextInt();
        }
        scanner.close();

        printGradeStatistics(grades);

    }

    public static void printGradeStatistics(int[] grades) {
        System.out.print("The grades are: ");
        print(grades);
        System.out.println();
        System.out.printf("The average is: %.2f\n", getAverage(grades));
        System.out.printf("The median is: %.2f\n", getMedian(grades));
        System.out.printf("The minimum is: %d\n", getMin(grades));
        System.out.printf("The maximum is: %d\n", getMax(grades));
        System.out.printf("The standard deviation is: %.2f\n", stdDev(grades));
    }

    public static void print(int[] array) {
        StringBuilder str = new StringBuilder("[");
        for (int element : array) {
            str.append(element).append(", ");
        }
        if (str.length() > 1) {
            str.delete(str.length() - 2, str.length());
        }
        str.append("]");
        System.out.print(str);
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return (double) sum / array.length;
    }

    public static double getMedian(int[] array) {
        int[] arr = copyOf(array);
        sortArray(arr);
        if (arr.length % 2 == 0) {
            return (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2;
        } else {
            return arr[arr.length / 2];
        }
    }

    public static int[] copyOf(int[] array) {
        int[] copyArray = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            copyArray[index] = array[index];
        }
        return copyArray;
    }

    public static void sortArray(int[] array) {
        for (int turn = 0; turn < array.length; turn++) {
            for (int index = 0; index < array.length - 1; index++) {
                if (array[index] > array[index + 1]) {
                    int tempValue = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = tempValue;
                }
            }
        }
    }

    public static int getMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public static int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public static double stdDev(int[] array) {
        double ex = getAverage(array);
        double stdDev = 0.0;
        for (int index = 0; index < array.length; index++) {
            stdDev += array[index] * array[index] - ex * ex;
        }
        stdDev /= array.length;
        stdDev = Math.sqrt(stdDev);
        return stdDev;
    }
}