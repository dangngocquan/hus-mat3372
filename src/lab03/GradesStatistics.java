package lab03;

import java.util.Scanner;

// Exercise 1.3
public class GradesStatistics {
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
        System.out.printf("The average is: %.2f\n", getAverage(grades));
        System.out.printf("The minimum is: %d\n", getMin(grades));
        System.out.printf("The maximum is: %d\n", getMax(grades));
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return (double) sum / array.length;
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
}
