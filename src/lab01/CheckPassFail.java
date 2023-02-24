package lab01;

// Exercise 2.1
public class CheckPassFail {
    public static void main(String[] args) {
        checkPass(0);
        checkPass(49);
        checkPass(50);
        checkPass(51);
        checkPass(100);
    }

    public static void checkPass(int mark) {
        System.out.println("The mark is " + mark);
        if (mark >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }
}
