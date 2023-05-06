package oop.principles.encapsulation;

import java.util.LinkedList;
import java.util.List;

public class BookManager {
    private List<Book> books;

    public BookManager() {
        books = new LinkedList<Book>();
    }

    public void add(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
