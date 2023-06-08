package midterm.y2023.solution.exe01.oop.principles.encapsulation;

public class Test {
    public static void main(String[] args) {
        // Tính đóng gói thể hiện ở phạm vi truy cập biến
        Book book1 = new Book("Name1", 10000);
//        System.out.println(book1.name); // Lỗi do phạm vi truy cập biến 'name' là private

        // Muốn lấy giá trị của biến thì phải thông qua các phương thức
        System.out.println(book1.getName());


        /*
        Tính đóng gói thể hiện ở: Các class có liên quan với nhau thì có thể cho vào cùng một package
        Ở đây, class Book và class BookManager có liên quan
         */
        Book book2 = new Book("Name2", 12000);
        BookManager bookManager = new BookManager();
        bookManager.add(book1);
        bookManager.add(book2);

    }
}
