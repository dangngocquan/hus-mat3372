package lab05.exercise1p5.service;

public class InvoiceItem {
    // private instance variables
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    // constructors
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Getter
    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    // Setter
    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return qty * unitPrice;
    }

    public String toString() {
        return String.format("InvoiceItem[id = %s, desc = %s, qty = %d, unitPrice = %s]",
                id, desc, qty, unitPrice);
    }
}
