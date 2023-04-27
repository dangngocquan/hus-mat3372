package midterm.y2022.solution.exe02.sortstrategy;

public class SortStrategy {
    private static SortStrategy instance;

    private ISort sortee;

    private SortStrategy() {

    }

    public static SortStrategy getInstance() {
        if (instance == null) {
            instance = new SortStrategy();
        }
        return instance;
    }

    public void setSortee(ISort sortee) {
        this.sortee = sortee;
    }

    public int sort(int[] data) {
        return sortee.sort(data);
    }
}
