public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Pay using Credit Card
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890123456", "John Doe", "123", "12/24");
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.executePayment(100.0);

        // Pay using PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com", "password");
        paymentContext.setPaymentStrategy(payPalPayment);
        paymentContext.executePayment(200.0);
    }
}

