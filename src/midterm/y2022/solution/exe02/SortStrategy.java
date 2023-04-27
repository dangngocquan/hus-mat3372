package midterm.y2022.solution.exe02;

public class SortStrategy {
    public static SortStrategy instance;
    public ISort sortee;

    private SortStrategy() {
        instance = this;
        instance.sortee = new SelectionSort();
    }

    public int[] sort(int[] array) {
        return sortee.sort(array);
    }
}
