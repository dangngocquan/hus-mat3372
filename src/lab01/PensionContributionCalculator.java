package lab01;

import java.util.Scanner;

// Exercise 4.3
public class PensionContributionCalculator {
    static final int SALARY_CEILING = 6000;
    static final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
    static final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
    static final double EMPLOYEE_RATE_55_TO_60 = 0.13;
    static final double EMPLOYER_RATE_55_TO_60 = 0.13;
    static final double EMPLOYEE_RATE_60_TO_65 = 0.075;
    static final double EMPLOYER_RATE_60_TO_65 = 0.09;
    static final double EMPLOYEE_RATE_65_ABOVE = 0.05;
    static final double EMPLOYER_RATE_65_ABOVE = 0.075;

    public static void main(String[] args) {
        // Get input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the monthly salary: $");
        int salary = scanner.nextInt();
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();
        scanner.close();
        // Print result
        printResult(salary, age);
    }

    public static void printResult(int salary, int age) {
        double employeeContribution = getEmployeeContribution(salary, age);
        double employerContribution = getEmployerContribution(salary, age);
        double totalContribution = employeeContribution + employerContribution;
        System.out.printf("The employee's contribution is: $%.2f\n", employeeContribution);
        System.out.printf("The employer's contribution is: $%.2f\n", employerContribution);
        System.out.printf("The total contribution is: $%.2f\n", totalContribution);
    }

    public static double getEmployeeContribution(int salary, int age) {
        int contributableSalary = Math.min(SALARY_CEILING, salary);
        if (age <= 55) {
            return contributableSalary * EMPLOYEE_RATE_55_AND_BELOW;
        } else if (age <= 60) {
            return contributableSalary * EMPLOYEE_RATE_55_TO_60;
        } else if (age <= 65) {
            return contributableSalary * EMPLOYEE_RATE_60_TO_65;
        } else {
            return contributableSalary * EMPLOYEE_RATE_65_ABOVE;
        }
    }

    public static double getEmployerContribution(int salary, int age) {
        int contributableSalary = Math.min(SALARY_CEILING, salary);
        if (age <= 55) {
            return contributableSalary * EMPLOYER_RATE_55_AND_BELOW;
        } else if (age <= 60) {
            return contributableSalary * EMPLOYER_RATE_55_TO_60;
        } else if (age <= 65) {
            return contributableSalary * EMPLOYER_RATE_60_TO_65;
        } else {
            return contributableSalary * EMPLOYER_RATE_65_ABOVE;
        }
    }
}
