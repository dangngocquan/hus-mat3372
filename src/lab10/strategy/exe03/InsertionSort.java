package lab10.strategy.exe03;

public class InsertionSort implements Sort {
    @Override
    public int[] sort(int[] a) {
        int[] array = a.clone();
        for (int i = 1; i< array.length; i++) {
            int j = i;
            while (j > 0 && array[j-1] > array[j]) {
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        return array;
    }
}
