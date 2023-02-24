package lab01;

import java.util.Scanner;

// Exercise 4.7
public class AverageWithInputValidation {
    public static void main(String[] args) {
        int mark, sum = 0;
        int studentNo = 1;
        int numberStudents = 3;
        Scanner scanner = new Scanner(System.in);
        for (studentNo = 1; studentNo <= numberStudents; studentNo++) {
            System.out.printf("Enter the mark (0-100) for student %d: ", studentNo);
            mark = scanner.nextInt();
            if (isValid(mark)) {
                sum += mark;
            } else {
                studentNo--;
            }
        }
        scanner.close();
        System.out.printf("The average is: %.2f", sum * 1.0 / numberStudents);
    }

    public static boolean isValid(int mark) {
        if (0 <= mark && mark <= 100) {
            return true;
        } else {
            System.out.println("Invalid input, try again ...");
            return false;
        }
    }
}
