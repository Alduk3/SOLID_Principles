public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        PaymentMethod creditCardPayment = new CreditCardPayment();
        processor.processPayment(creditCardPayment);

        PaymentMethod paypalPayment = new PayPalPayment();
        processor.processPayment(paypalPayment);
    }
}