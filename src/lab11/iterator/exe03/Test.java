package lab11.iterator.exe03;

public class Test {
    public static void main(String[] args) {
        MyList list1 = new MyArrayList();
        list1.append("ABC");
        list1.append(1);
        list1.append(true);
        list1.append('c');

        MyIterator iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // ABC
        // 1
        // true
        // c
    }
}
