package ex10;

public class Cash extends PaymentMethod {

    public Cash(double amount) {
        super(amount);
    }

    @Override
    public double calculateFee() {
        return 0;
    }

    @Override
    public double processPayment() {
        return amount;
    }

    @Override
    public String processPayment(String currency) {
        return processPayment() + " " + currency;
    }
}
