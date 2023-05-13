package lab10.strategy.exe03;

public class SelectionSort implements Sort {
    @Override
    public int[] sort(int[] a) {
        int[] array = a.clone();
        for (int i = 0; i < array.length; i++) {
            int minValue = array[i];
            int index = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    index = j;
                }
            }

            if (index != i) {
                array[index] = array[i];
                array[i] = minValue;
            }
        }
        return array;
    }
}
