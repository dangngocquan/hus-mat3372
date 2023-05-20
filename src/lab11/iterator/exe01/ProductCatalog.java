package lab11.iterator.exe01;

public class ProductCatalog implements Iterable {
    private String[] productCatalog;

    public ProductCatalog(String[] data) {
        productCatalog = data;
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator(productCatalog);
    }
}
