package solid.OCP.after;

public class PayPalPayment implements PaymentMethod {
    
    @Override
    public boolean pay(long amount) {
        System.out.printf("Processing paypal transaction with amount of %d" , amount);

        return true;
    }
}
