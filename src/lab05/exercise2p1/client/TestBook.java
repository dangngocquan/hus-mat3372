package lab05.exercise2p1.client;

import lab05.exercise2p1.service.Author;
import lab05.exercise2p1.service.Book;

public class TestBook {
    public static void main(String[] args) {
        // Constructor an author instance
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);

        // Test Book's Constructor
        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
        // Test Book's toString()
        System.out.println(dummyBook);
        // Test Setters and Getters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());

        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        Book anotherBook = new Book("More Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'),
                29.95);
        System.out.println(anotherBook);

    }
}
