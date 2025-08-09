package solid.OCP.after;
import java.util.Map;





public class PaymentProcessor {
    

    private final Map<PaymentType, PaymentMethod> registry;

    public PaymentProcessor(Map<PaymentType , PaymentMethod> registry){
        this.registry = registry;
    }



    public boolean processPayment(PaymentRequest request)
    {
        PaymentMethod paymentMethod = registry.get(request.getPaymentType());

        if( paymentMethod == null ){
            throw new IllegalArgumentException();
        }

        return paymentMethod.pay(request.getAmount());

    }
}
