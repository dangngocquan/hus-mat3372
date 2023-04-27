package midterm.y2022.solution.exe02.sortstrategy;

public class InsertionSort implements ISort {
    @Override
    public int sort(int[] data) {
        int swappedCount = 0;
        for (int index = 1; index < data.length; index++) {
            int tempIndex = index;
            while (tempIndex > 0 && data[tempIndex-1] > data[tempIndex]) {
                // Swap
                int tempValue = data[tempIndex];
                data[tempIndex] = data[tempIndex-1];
                data[tempIndex-1] = tempValue;
                swappedCount++;
                // Decrease tempIndex
                tempIndex--;
            }
        }
        return swappedCount;
    }
}
