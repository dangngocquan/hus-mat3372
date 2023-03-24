package lab05.exercise1p5.client;

import lab05.exercise1p5.service.InvoiceItem;

public class TestMain {
    public static void main(String[] args) {
        // Test constructors and toString()
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1);

        // Test setter and getter
        inv1.setQty(999);
        inv1.setUnitPrice(0.99);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getId());
        System.out.println("desc is: " + inv1.getDesc());
        System.out.println("qty is: " + inv1.getQty());
        System.out.println("unitPrice is: " + inv1.getUnitPrice());

        // Test getTotal()
        System.out.println("The total is: " + inv1.getTotal());
    }
}
