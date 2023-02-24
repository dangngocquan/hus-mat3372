package lab01;

// Exercise 2.3
public class PrintNumberInWord {
    public static void main(String[] args) {
        System.out.println("Using nested-if: ");
        printNumberInWordUsingNestedIf(0);
        printNumberInWordUsingNestedIf(1);
        printNumberInWordUsingNestedIf(2);
        printNumberInWordUsingNestedIf(3);
        printNumberInWordUsingNestedIf(4);
        printNumberInWordUsingNestedIf(5);
        printNumberInWordUsingNestedIf(6);
        printNumberInWordUsingNestedIf(7);
        printNumberInWordUsingNestedIf(8);
        printNumberInWordUsingNestedIf(9);
        printNumberInWordUsingNestedIf(10);
        System.out.println("Using switch-case-default: ");
        printNumberInWordUsingSwitchCaseDefault(0);
        printNumberInWordUsingSwitchCaseDefault(1);
        printNumberInWordUsingSwitchCaseDefault(2);
        printNumberInWordUsingSwitchCaseDefault(3);
        printNumberInWordUsingSwitchCaseDefault(4);
        printNumberInWordUsingSwitchCaseDefault(5);
        printNumberInWordUsingSwitchCaseDefault(6);
        printNumberInWordUsingSwitchCaseDefault(7);
        printNumberInWordUsingSwitchCaseDefault(8);
        printNumberInWordUsingSwitchCaseDefault(9);
        printNumberInWordUsingSwitchCaseDefault(10);

    }

    public static void printNumberInWordUsingNestedIf(int number) {
        System.out.print("The number is " + number + ":     ");
        if (number == 1) {
            System.out.println("ONE");
        } else if (number == 2) {
            System.out.println("TWO");
        } else if (number == 3) {
            System.out.println("THREE");
        } else if (number == 4) {
            System.out.println("FOUR");
        } else if (number == 5) {
            System.out.println("FIVE");
        } else if (number == 6) {
            System.out.println("SIX");
        } else if (number == 7) {
            System.out.println("SEVEN");
        } else if (number == 8) {
            System.out.println("EIGHT");
        } else if (number == 9) {
            System.out.println("NINE");
        } else {
            System.out.println("OTHER");
        }
    }

    public static void printNumberInWordUsingSwitchCaseDefault(int number) {
        System.out.print("The number is " + number + ":     ");
        switch (number) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }
}
