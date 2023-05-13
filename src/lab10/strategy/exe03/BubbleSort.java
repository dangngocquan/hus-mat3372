package lab10.strategy.exe03;

public class BubbleSort implements Sort {
    @Override
    public int[] sort(int[] a) {
        int[] array = a.clone();
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    // swap
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = true;
                }
            }

        } while (swapped);
        return array;
    }
}
