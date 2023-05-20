package lab11.iterator.exe01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IteratorPatternExample {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog(
                new String[] {"A1", "A2", "A3", "A4"});
        Iterator iterator = productCatalog.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // A1
        // A2
        // A3
        // A4
    }
}

