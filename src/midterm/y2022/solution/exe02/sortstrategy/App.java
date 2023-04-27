package com.sortstrategy;

import midterm.y2022.solution.exe02.sortstrategy.BubbleSort;
import midterm.y2022.solution.exe02.sortstrategy.InsertionSort;
import midterm.y2022.solution.exe02.sortstrategy.SelectionSort;
import midterm.y2022.solution.exe02.sortstrategy.SortStrategy;

public class App {
    public static void main(String[] args) {
        // Tạo một mảng các số tự nhiên, các số tự nhiên được sinh ngẫu nhiên
        // In ra mảng vừa tạo theo định dạng, ví dụ [1 2 3 4 5].
        // Sắp xếp mảng theo thứ tự tăng dần sử dụng các thuật toán sắp xếp khác nhau.
        // In ra mảng sau khi sắp xếp.
        // In ra số lần đổi vị trí trong thuật toán đang sử dụng.
        // Ví dụ:
        // Using Bubble Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // Using Selection Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // Kết quả chạy chương trình lưu vào file SortStrategy21000699<Mã sinh viên>.txt và nộp cùng source code.

        // Create an array
        // length = 10, minValue = 0, maxValue = 100
        int[] array = createRandomArray(10, 0, 100);
        // print array
        printArray(array);
        // clone initial array
        int[] arrayClone = array.clone();

        // Using Bubble Sort Algorithm:
        SortStrategy.getInstance().setSortee(new BubbleSort());
        System.out.println("\nUsing Bubble Sort Algorithm:");
        System.out.print("Before sorting: ");
        printArray(array);
        int numOfSwap = SortStrategy.getInstance().sort(array);
        System.out.print("After sorting: ");
        printArray(array);
        System.out.println("Number of swap: " + numOfSwap);

        // Using Insertion Sort Algorithm:
        array = arrayClone.clone();
        SortStrategy.getInstance().setSortee(new InsertionSort());
        System.out.println("\nUsing Insertion Sort Algorithm:");
        System.out.print("Before sorting: ");
        printArray(array);
        numOfSwap = SortStrategy.getInstance().sort(array);
        System.out.print("After sorting: ");
        printArray(array);
        System.out.println("Number of swap: " + numOfSwap);

        // Using Selection Sort Algorithm:
        array = arrayClone.clone();
        SortStrategy.getInstance().setSortee(new SelectionSort());
        System.out.println("\nUsing Insertion Sort Algorithm:");
        System.out.print("Before sorting: ");
        printArray(array);
        numOfSwap = SortStrategy.getInstance().sort(array);
        System.out.print("After sorting: ");
        printArray(array);
        System.out.println("Number of swap: " + numOfSwap);

    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("]");
    }

    public static int[] createRandomArray(int length, int minValue, int maxValue) {
        if (length < 0) {
            return null;
        }
        int[] array = new int[length];
        int range = Math.abs(maxValue - minValue);
        for (int i = 0; i < length; i++) {
            array[i] = (int) (minValue + Math.random() * range);
        }
        return array;
    }
}
