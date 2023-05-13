package lab10.singleton.exe03;

public class Test {
    public static void main(String[] args) {
        BookManager bookManager = BookManager.getInstance();
        BookManager bookManager1 = BookManager.getInstance();
        System.out.println(bookManager == bookManager); // true
    }
}
