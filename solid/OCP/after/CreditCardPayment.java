package solid.OCP.after;

public class CreditCardPayment implements PaymentMethod{
    @Override
    public boolean pay(long amount) {
        System.out.printf("Processing credit card transaction with amount of %d ", amount);
        return true;
    }
}
