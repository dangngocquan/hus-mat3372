package lab10.strategy;

public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrderUsingPaypal(PayByPaypal paypal) {
        paypal.collectPaymentDetails();
    }

    public void processOrderUsingCreditCard(PayByCreditCard creditCard) {
        creditCard.collectPaymentDetails();
    }

    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
    }
    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }
}
