package midterm.y2022.solution.exe02;

public class BubbleSort implements ISort {
    public BubbleSort() {

    }

    @Override
    public int[] sort(int[] array) {
        int[] copyArray = array.clone();
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int index = 1; index < copyArray.length; index++) {
                if (copyArray[index-1] > copyArray[index]) {
                    // Swap
                    int tempValue = copyArray[index-1];
                    copyArray[index-1] = copyArray[index];
                    copyArray[index] = tempValue;
                    swapped = true;
                }
            }
        }
        return copyArray;
    }
}
