package lab10.singleton.exe02;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query();    // Queried

        Database bar = Database.getInstance();
        bar.query();    // Queried

        System.out.println(foo == bar); // true
    }
}
