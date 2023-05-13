package lab10.singleton.exe03;

import java.util.LinkedList;
import java.util.List;

public class BookManager {
    private List<Book> books;
    private static BookManager instance;

    private BookManager() {
        books = new LinkedList<Book>();
    }

    public static BookManager getInstance() {
        if (instance == null) {
            instance = new BookManager();
        }
        return instance;
    }

    public void add(Book book) {
        books.add(book);
    }

    public void remove(int index) {
        books.remove(index);
    }
}
