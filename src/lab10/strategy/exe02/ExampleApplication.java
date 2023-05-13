package lab10.strategy.exe02;

import lab10.decorator.exe02.IceCream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExampleApplication {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("First number: ");
        int num01 = Integer.parseInt(reader.readLine());
        System.out.print("Second number: ");
        int num02 = Integer.parseInt(reader.readLine());

        Context context = new Context();
        System.out.print("\n1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "Your choice [1-3]: "
        );
        String choice = reader.readLine();

        if (choice.equals("1")) {
            context.setStrategy(new ConcreteStrategyAdd());
        } else if (choice.equals("2")) {
            context.setStrategy(new ConcreteStrategySubtract());
        } else {
            context.setStrategy(new ConcreteStrategyMultiply());
        }
        System.out.println(context.executeStrategy(num01, num02));

    }
}
