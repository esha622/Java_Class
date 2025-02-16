package Assignment;

interface PaymentMethod {
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

class BitcoinPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Bitcoin payment of $" + amount);
    }
}

class PaymentProcessor {
    private PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void makePayment(double amount) {
        paymentMethod.processPayment(amount);
    }
}
public class PaymentSystem {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod payPal = new PayPalPayment();
        PaymentMethod bitcoin = new BitcoinPayment();

        PaymentProcessor creditCardProcessor = new PaymentProcessor(creditCard);
        PaymentProcessor payPalProcessor = new PaymentProcessor(payPal);
        PaymentProcessor bitcoinProcessor = new PaymentProcessor(bitcoin);

        creditCardProcessor.makePayment(100.00);
        payPalProcessor.makePayment(200.50);
        bitcoinProcessor.makePayment(300.75);
    }
}