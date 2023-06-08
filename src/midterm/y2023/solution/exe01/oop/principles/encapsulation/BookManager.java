package midterm.y2023.solution.exe01.oop.principles.encapsulation;

import java.util.LinkedList;
import java.util.List;

public class BookManager {
    // private instance variables
    private List<Book> books;

    // constructor
    public BookManager() {
        books = new LinkedList<Book>();
    }

    // method: add new book to list book
    public void add(Book book) {
        books.add(book);
    }

    // getters and setters method
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
