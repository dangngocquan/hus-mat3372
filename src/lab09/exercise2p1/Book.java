package lab09.exercise2p1;

public class Book extends Item {
    int pages;

    public Book(String title, int year, int pages) {
        super(title, year);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString() {
        return String.format("Book[pages=%d, title=\'%s\', year=%d]", pages, title, year);
    }
}
