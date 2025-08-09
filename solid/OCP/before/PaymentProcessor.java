package solid.OCP.before;
import java.util.Scanner;

enum PaymentType {
    CREDIT_CARD,
    PAYPAL,
    BANK_TRANSFER
}

class PaymentRequest {
    public final long amountInCents;
    public final PaymentType type;

    public PaymentRequest(long amountInCents, PaymentType type) {
        this.amountInCents = amountInCents;
        this.type = type;
    }
}

public class PaymentProcessor {

    public boolean process(PaymentRequest request) {
        if (request.type == PaymentType.CREDIT_CARD) {
            System.out.println("Charging credit card: " + request.amountInCents + " cents");
            return true;
        } else if (request.type == PaymentType.PAYPAL) {
            System.out.println("Charging PayPal: " + request.amountInCents + " cents");
            return true;
        } else if (request.type == PaymentType.BANK_TRANSFER) {
            System.out.println("Initiating bank transfer: " + request.amountInCents + " cents");
            return true;
        } else {
            throw new IllegalArgumentException("Unknown payment type: " + request.type);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in cents: ");
        long amount = Long.parseLong(scanner.nextLine());

        System.out.print("Enter payment type (CREDIT_CARD, PAYPAL, BANK_TRANSFER): ");
        String typeInput = scanner.nextLine().trim().toUpperCase();

        PaymentType type = PaymentType.valueOf(typeInput);

        PaymentRequest request = new PaymentRequest(amount, type);

        PaymentProcessor processor = new PaymentProcessor();
        processor.process(request);
    }
}
