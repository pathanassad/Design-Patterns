package LSP;

import java.util.List;

public class Main {
    public static void main(String[] args){
        PaymentClient client = new PaymentClient();
        List<Payment> paymentList = List.of(new CreditCard(), new Upi());
        for(Payment payment: paymentList){
            client.processTransaction(payment);

        }

        NonRefundablePayments payments = new Crypto();
        client.processTransaction(payments);



    }
}
