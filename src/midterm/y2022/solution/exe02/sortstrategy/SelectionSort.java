package midterm.y2022.solution.exe02.sortstrategy;

public class SelectionSort implements ISort {
    @Override
    public int sort(int[] data) {
        int swappedCount = 0;
        for (int index = 0; index < data.length; index++) {
            int minValue = data[index];
            int indexOfMinValue = index;
            // Find min value and index of min value
            for (int i = index; i < data.length; i++) {
                if (data[i] < minValue) {
                    minValue = data[i];
                    indexOfMinValue = i;
                }
            }
            // Swap
            if (indexOfMinValue != index) {
                data[indexOfMinValue] = data[index];
                data[index] = minValue;
                swappedCount++;
            }

        }
        return swappedCount;
    }
}
