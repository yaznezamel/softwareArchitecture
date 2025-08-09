package solid.OCP.after;

public class PaymentRequest {
    private final long amount;
    private final PaymentType type;


    public PaymentRequest(long amount , PaymentType type){
        this.type = type;
        this.amount = amount;
    }



    public long getAmount(){
        return this.amount;
    }


    public PaymentType getPaymentType(){
        return this.type;
    }




}
