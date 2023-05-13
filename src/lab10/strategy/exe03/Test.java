package lab10.strategy.exe03;

public class Test {
    public static void main(String[] args) {
        Host host = new Host();
        int[] a = new int[] {1, 2, 5, 4, 3, 8, 6, 7, 10, 9};
        host.setStrategy(new BubbleSort());
        System.out.println(arrayToString(host.sort(a)));
        host.setStrategy(new InsertionSort());
        System.out.println(arrayToString(host.sort(a)));
        host.setStrategy(new SelectionSort());
        System.out.println(arrayToString(host.sort(a)));
    }

    public static String arrayToString(int[] a) {
        StringBuilder sb = new StringBuilder("[");
        for (int element : a) {
            sb.append(element).append(", ");
        }
        if (sb.length() > 2) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append("]");
        return sb.toString();
    }
}
