package ex10;

public class ex10 {
    static void main(String[] args) {
        PaymentMethod credit = new CreditCard(1000);
        PaymentMethod debit = new DebitCard(1000);
        PaymentMethod cash = new Cash(1000);

        System.out.println("=== Credit Card ===");
        System.out.println("Fee: " + credit.calculateFee());
        System.out.println("Total: " + credit.processPayment());
        System.out.println("With currency: " + credit.processPayment("USD"));

        System.out.println("\n=== Debit Card ===");
        System.out.println("Fee: " + debit.calculateFee());
        System.out.println("Total: " + debit.processPayment());
        System.out.println("With currency: " + debit.processPayment("USD"));

        System.out.println("\n=== Cash ===");
        System.out.println("Fee: " + cash.calculateFee());
        System.out.println("Total: " + cash.processPayment());
        System.out.println("With currency: " + cash.processPayment("USD"));
    }
}
