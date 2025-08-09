package solid.OCP.after;

public class BankTransferPayment implements PaymentMethod {

    @Override
    public boolean pay(long amount) {
        System.out.printf("Processing bank tranfer operation with amount of %d ", amount);
        return true;
    }
}
