package midterm.y2022.solution.exe02;

public class InsertionSort implements ISort {
    public InsertionSort() {

    }

    @Override
    public int[] sort(int[] array) {
        int[] copyArray = array.clone();
        for (int index = 1; index < copyArray.length; index++) {
            int tempIndex = index;
            while (tempIndex > 0 && copyArray[tempIndex-1] > copyArray[tempIndex]) {
                // Swap
                int tempValue = copyArray[tempIndex];
                copyArray[tempIndex] = copyArray[tempIndex-1];
                copyArray[tempIndex-1] = tempValue;
                // Decrease tempIndex
                tempIndex--;
            }
        }
        return copyArray;
    }
}
