package midterm.y2023.solution.exe03.books;

public class BookManager {
    private MyList books;

    /**
     * Khởi tạo dữ liệu cho BookManager.
     */
    public BookManager(MyList data) {
        books = data;
    }

    /**
     * Lấy ra danh sách các sách được sắp xếp theo thứ tự title.
     * Chú ý, không thay đổi thứ tự sách trong danh sách gốc.
     * @param order
     * @return danh sách các sách đã được sắp xếp.
     */
    public MyList sortByTitle(boolean order) {
        /*
         TODO

         - Sửa lại lớp Book để sử dụng BookComparable để thực hiện việc so sánh các Book theo title.

         - Sử dụng tiêu chí so sánh trong BookComparable, viết code để sắp xếp danh sách các sách theo thứ tự
           phụ thuộc tham số order. Nếu order là true thì sắp xệp theo thứ tự tăng dần. Nếu order là false thì
           sắp xếp theo thứ tự giảm dần.

         - Trả ra danh sách mới các sách đã được sắp thứ tự.
         */

        // clone list
        MyList list = new MyLinkedList();
        for (int i = 0; i < books.size(); i++) {
            list.append(books.get(i));
        }
        // sort by title
        boolean swapped = true;
        do {
            swapped = false;
            for (int i = 1; i < list.size(); i++) {
                Book book1 = (Book) list.get(i-1);
                Book book2 = (Book) list.get(i);
                if (order? book1.compareTo(book2) > 0 : book1.compareTo(book2) < 0) {
                    // swap
                    list.set(book1, i);
                    list.set(book2, i-1);
                    swapped = true;
                }
            }
        } while (swapped);
        return list;
    }

    /**
     * Lấy ra danh sách các sách được sắp xếp theo pages.
     * Chú ý, không thay đổi thứ tự sách trong danh sách gốc.
     * @param order
     * @return danh sách các sách đã được sắp xếp.
     */
    public MyList sortByPageNumber(boolean order) {
        /*
         TODO

         - Thêm lớp PageComparison sử dụng BookComparator để có thể so sánh các sách theo pages.

         - Viết code sử dụng PageComparison để sắp xếp sách theo thứ tự phụ thuộc tham số order.
           Nếu order là true thì sắp xệp theo thứ tự tăng dần. Nếu order là false thì sắp xếp theo thứ tự giảm dần.

         - Trả ra danh sách mới các sách đã được sắp xếp.
         */

        // clone list
        MyList list = new MyLinkedList();
        for (int i = 0; i < books.size(); i++) {
            list.append(books.get(i));
        }
        // sort by title
        boolean swapped = true;
        PageComparison pageComparison = new PageComparison();
        do {
            swapped = false;
            for (int i = 1; i < list.size(); i++) {
                Book book1 = (Book) list.get(i-1);
                Book book2 = (Book) list.get(i);
                if (order? pageComparison.compare(book1, book2) > 0 : pageComparison.compare(book1, book2) < 0) {
                    // swap
                    list.set(book1, i);
                    list.set(book2, i-1);
                    swapped = true;
                }
            }
        } while (swapped);
        return list;
    }
}
