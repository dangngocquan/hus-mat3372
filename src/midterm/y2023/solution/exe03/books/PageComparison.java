package midterm.y2023.solution.exe03.books;

public class PageComparison implements BookComparator {
    @Override
    public int compare(Book left, Book right) {
        return left.getPages() - right.getPages();
    }
}
