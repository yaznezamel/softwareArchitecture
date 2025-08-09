package solid.OCP.after;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<PaymentType, PaymentMethod> methods = Map.of(
            PaymentType.CREDIT_CARD, new CreditCardPayment(),
            PaymentType.PAYPAL, new PayPalPayment(),
            PaymentType.BANK_TRANSFER, new BankTransferPayment()
        );

        PaymentProcessor processor = new PaymentProcessor(methods);

        processor.processPayment(new PaymentRequest(2599, PaymentType.CREDIT_CARD));
        processor.processPayment(new PaymentRequest(990,  PaymentType.PAYPAL));
        processor.processPayment(new PaymentRequest(4200, PaymentType.BANK_TRANSFER));
    }
}
