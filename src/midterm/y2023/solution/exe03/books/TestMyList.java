package midterm.y2023.solution.exe03.books;

public class TestMyList {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyList>.txt
           (ví dụ, NguyenVanA_123456_MyList.txt)
         - Nộp kết quả chạy chương trình (file text trên) cùng với các file source code.
         */

        System.out.println("Test MyArrayList:\n");
        testMyArrayList();
        System.out.println("\n------------------------------------------------------------------\n");

        System.out.println("Test MyLinkedList:\n");
        testMyLinkedList();
        System.out.println("\n------------------------------------------------------------------\n");

        System.out.println("Test Iterator:\n");
        testIterator(createRandomMyListBook(20));
        System.out.println("\n------------------------------------------------------------------\n");
    }

    public static void testMyArrayList() {
        /*
         TODO

         - Tạo ra một list kiểu MyArrayList có ít nhất 10 Book.

         - Sử dụng BookManager để
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo title.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo title.
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo số trang.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo số trang.
         */

        // create a list
        MyList list = new MyArrayList();
        // Add 10 books with random year and random page
        for (int i = 0; i < 10; i++) {
            Book book = new Book(
                    String.format("Book%03d", (int) (Math.random() * 999)),
                    (int) (Math.random() * 200 + 1800),
                    (int) (Math.random() * 1000 + 50)
            );
            list.append(book);
        }
        // Print list
        System.out.println("Current list: ");
        printListBook(list);

        // create BookManager
        BookManager bookManager = new BookManager(list);

        // Sort by title, order = true
        System.out.println("\nAfter sort by title, order = true: ");
        printListBook(bookManager.sortByTitle(true));

        // Sort by title, order = false
        System.out.println("\nAfter sort by title, order = false: ");
        printListBook(bookManager.sortByTitle(false));

        // Sort by page number, order = true
        System.out.println("\nAfter sort by page number, order = true: ");
        printListBook(bookManager.sortByPageNumber(true));

        // Sort by page number, order = true
        System.out.println("\nAfter sort by page number, order = false: ");
        printListBook(bookManager.sortByPageNumber(false));
    }

    public static void testMyLinkedList() {
        /*
         TODO

         - Tạo ra một list kiểu MyLinkedList có ít nhất 10 Book.

         - Sử dụng BookManager để
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo tên sách.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo tên sách.
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo số trang.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo số trang.
         */

        // create a list
        MyList list = new MyLinkedList();
        // Add 10 books with random year and random page
        for (int i = 0; i < 10; i++) {
            Book book = new Book(
                    String.format("Book%03d", (int) (Math.random() * 999)),
                    (int) (Math.random() * 200 + 1800),
                    (int) (Math.random() * 1000 + 50)
            );
            list.append(book);
        }
        // Print list
        System.out.println("Current list: ");
        printListBook(list);

        // create BookManager
        BookManager bookManager = new BookManager(list);

        // Sort by title, order = true
        System.out.println("\nAfter sort by title, order = true: ");
        printListBook(bookManager.sortByTitle(true));

        // Sort by title, order = false
        System.out.println("\nAfter sort by title, order = false: ");
        printListBook(bookManager.sortByTitle(false));

        // Sort by page number, order = true
        System.out.println("\nAfter sort by page number, order = true: ");
        printListBook(bookManager.sortByPageNumber(true));

        // Sort by page number, order = true
        System.out.println("\nAfter sort by page number, order = false: ");
        printListBook(bookManager.sortByPageNumber(false));
    }

    public static void testIterator(MyList myList) {
        /*
         TODO

         Sử dụng iterator duyệt qua tất cả các phần tử trong danh sách myList và in ra thông tin về phần tử đó.
         */

        MyIterator iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void printListBook(MyList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((Book) list.get(i));
        }
    }

    public static MyList createRandomMyListBook(int size) {
        // create a list
        MyList list = new MyLinkedList();
        // Add 10 books with random year and random page
        for (int i = 0; i < size; i++) {
            Book book = new Book(
                    String.format("Book%03d", (int) (Math.random() * 999)),
                    (int) (Math.random() * 200 + 1800),
                    (int) (Math.random() * 1000 + 50)
            );
            list.append(book);
        }
        return list;
    }
}
