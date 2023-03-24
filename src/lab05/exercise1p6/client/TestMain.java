package lab05.exercise1p6.client;

import lab05.exercise1p6.service.Account;

public class TestMain {
    public static void main(String[] args) {
        // Test constructors and toString()
        Account account1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(account1);
        Account account2 = new Account("A102", "Kumar");
        System.out.println(account2);

        // Test Getters
        System.out.println("ID: " + account1.getId());
        System.out.println("Name: " + account1.getName());
        System.out.println("Balance: " + account1.getBalance());

        // Test credit() and debit()
        account1.credit(100);
        System.out.println(account1);
        account1.debit(50);
        System.out.println(account1);
        account1.debit(500);
        System.out.println(account1);

        // Test transferTo()
        account1.transferTo(account2, 100);
        System.out.println(account1);
        System.out.println(account2);
    }
}
