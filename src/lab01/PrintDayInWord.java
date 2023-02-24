package lab01;

// Exercise 2.4
public class PrintDayInWord {
    public static void main(String[] args) {
        System.out.println("Using nested-if: ");
        printDayInWordUsingNestedIf(0);
        printDayInWordUsingNestedIf(1);
        printDayInWordUsingNestedIf(2);
        printDayInWordUsingNestedIf(3);
        printDayInWordUsingNestedIf(4);
        printDayInWordUsingNestedIf(5);
        printDayInWordUsingNestedIf(6);
        printDayInWordUsingNestedIf(7);
        System.out.println("Using switch-case-default: ");
        printDayInWordUsingSwitchCaseDefault(0);
        printDayInWordUsingSwitchCaseDefault(1);
        printDayInWordUsingSwitchCaseDefault(2);
        printDayInWordUsingSwitchCaseDefault(3);
        printDayInWordUsingSwitchCaseDefault(4);
        printDayInWordUsingSwitchCaseDefault(5);
        printDayInWordUsingSwitchCaseDefault(6);
        printDayInWordUsingSwitchCaseDefault(7);
    }

    public static void printDayInWordUsingNestedIf(int dayNumber) {
        System.out.print("The day number is " + dayNumber + ":      ");
        if (dayNumber == 0) {
            System.out.println("Sunday");
        } else if (dayNumber == 1) {
            System.out.println("Monday");
        } else if (dayNumber == 2) {
            System.out.println("Tuesday");
        } else if (dayNumber == 3) {
            System.out.println("Wednesday");
        } else if (dayNumber == 4) {
            System.out.println("Thursday");
        } else if (dayNumber == 5) {
            System.out.println("Friday");
        } else if (dayNumber == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Not a valid day");
        }
    }

    public static void printDayInWordUsingSwitchCaseDefault(int dayNumber) {
        System.out.print("The day number is " + dayNumber + ":      ");
        switch (dayNumber) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a valid day");
        }
    }
}
