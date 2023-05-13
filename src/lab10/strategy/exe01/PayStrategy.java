package lab10.strategy.exe01;

public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
