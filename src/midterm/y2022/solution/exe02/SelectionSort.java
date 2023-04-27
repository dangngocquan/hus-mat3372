package midterm.y2022.solution.exe02;

public class SelectionSort implements ISort {
    public SelectionSort() {

    }

    @Override
    public int[] sort(int[] array) {
        int[] copyArray = array.clone();
        for (int index = 0; index < copyArray.length; index++) {
            int minValue = copyArray[index];
            int indexOfMinValue = index;
            // Find min value and index of min value
            for (int i = index; i < copyArray.length; i++) {
                if (copyArray[i] < minValue) {
                    minValue = copyArray[i];
                    indexOfMinValue = i;
                }
            }
            // Swap
            copyArray[indexOfMinValue] = copyArray[index];
            copyArray[index] = minValue;
        }
        return copyArray;
    }
}
