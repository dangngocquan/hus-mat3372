package lab05.exercise2p4.client;

import lab05.exercise2p4.service.Customer;
import lab05.exercise2p4.service.Invoice;

public class TestMain {
    public static void main(String[] args) {
        // Test Customer class
        Customer customer1 = new Customer(88, "Tan Ah Teck", 10);
        System.out.println(customer1);

        customer1.setDiscount(8);
        System.out.println(customer1);
        System.out.println("id is: " + customer1.getId());
        System.out.println("name is: " + customer1.getName());
        System.out.println("discount is: " + customer1.getDiscount());

        // Test Invoice class
        Invoice invoice1 = new Invoice(101, customer1, 888.8);
        System.out.println(invoice1);

        invoice1.setAmount(999.9);
        System.out.println(invoice1);
        System.out.println("id is: " + invoice1.getId());
        System.out.println("customer is: " + invoice1.getCustomer());
        System.out.println("amount is: " + invoice1.getAmount());
        System.out.println("customer's id is: " + invoice1.getCustomerID());
        System.out.println("customer's name is: " + invoice1.getCustomerName());
        System.out.println("customer's discount is: " + invoice1.getCustomerDiscount());
        System.out.printf("amount after discount is: %.2f%n", invoice1.getAmountAfterDiscount());
    }
}
