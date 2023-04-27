package midterm.y20212022.solution.exe01;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class TestFraction {
    private List<Fraction> fractions;

    public TestFraction() {
        fractions = new LinkedList<Fraction>();
    }

    public Fraction getSecondLargestValue() {
        List<Fraction> list = sortByValue(fractions);
        if (list.size() > 0) {
            double maxValue = list.get(list.size() - 1).doubleValue();
            for (int i = list.size()-1; i >= 0; i--) {
                if (Double.compare(list.get(i).doubleValue(), maxValue) != 0) {
                    return list.get(i);
                }
            }
            return null;
        }
        return null;
    }

    public static void print(List<Fraction> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");
    }

    public static List<Fraction> sortByDenominator(List<Fraction> list) {
        List<Fraction> list0 = new LinkedList<>(list);
        Collections.sort(list0, new Comparator<Fraction>() {
            @Override
            public int compare(Fraction o1, Fraction o2) {
                return o1.getDenominator() - o2.getDenominator();
            }
        });
        return list0;
    }

    public static List<Fraction> sortByValue(List<Fraction> list) {
        List<Fraction> list0 = new LinkedList<>(list);
        Collections.sort(list0);
        return list0;
    }

    public static int createRandomNumber(int minValue, int maxValue) {
        int range = maxValue - minValue;
        return (int) (Math.random() * range + minValue);
    }

    public static Fraction createRandomFraction() {
        return new Fraction(
                createRandomNumber(1, 1000),
                createRandomNumber(1, 1000)
        );
    }

    public static void main(String[] args) {
        TestFraction testFraction = new TestFraction();
        // Create random 30 fractions
        for (int i = 0; i < 30; i++) {
            testFraction.fractions.add(createRandomFraction());
        }

        // Print fractions
        print(testFraction.fractions);

        // sort by value and print
        print(sortByValue(testFraction.fractions));

        // sort by value and print
        print(sortByDenominator(testFraction.fractions));

        // second largest value
        System.out.println(testFraction.getSecondLargestValue());
    }
}
