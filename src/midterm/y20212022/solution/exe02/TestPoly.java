package midterm.y20212022.solution.exe02;

import java.util.LinkedList;
import java.util.List;

public class TestPoly {
    List<Poly> polyList;

    public TestPoly() {
        polyList = new LinkedList<Poly>();
    }

    public static ArrayPoly createArrayPoly(int[] coefficients) {
        return new ArrayPoly(coefficients);
    }

    public static ListPoly createListPoly(int[] coefficients) {
        return new ListPoly(coefficients);
    }

    public static int[] createRandomArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = createRandomNumber(1, 100);
        }
        return arr;
    }

    public static int createRandomNumber(int minValue, int maxValue) {
        int range = maxValue - minValue;
        return (int) (Math.random() * range + minValue);
    }

    public static void printPolyList(List<Poly> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("Poly %d:\n", i+1);
            Poly poly = list.get(i);
            System.out.println(poly);
            System.out.println(poly.derivative());
            int x = createRandomNumber(1, 10);
            System.out.println(x);
            System.out.println(poly.evaluate(x));
            System.out.println(poly.type());
        }
    }

    public static void main(String[] args) {
        TestPoly testPoly = new TestPoly();
        // Create 5 ArrayPoly
        for (int count = 0; count < 5; count++) {
            int randomDegree = createRandomNumber(0, 10);
            testPoly.polyList.add(
                    createArrayPoly(createRandomArray(randomDegree + 1))
            );
        }

        // Create 5 ListPoly
        for (int count = 0; count < 5; count++) {
            int randomDegree = createRandomNumber(0, 10);
            testPoly.polyList.add(
                    createListPoly(createRandomArray(randomDegree + 1))
            );
        }

        // print polyList
        printPolyList(testPoly.polyList);
    }
}
