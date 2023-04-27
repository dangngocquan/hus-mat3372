package midterm.y2022.solution.exe02.sortstrategy;

public class BubbleSort implements ISort {
    @Override
    public int sort(int[] data) {
        int swappedCount = 0;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int index = 1; index < data.length; index++) {
                if (data[index-1] > data[index]) {
                    // Swap
                    int tempValue = data[index-1];
                    data[index-1] = data[index];
                    data[index] = tempValue;
                    swappedCount++;
                    swapped = true;
                }
            }
        }
        return swappedCount;
    }
}
