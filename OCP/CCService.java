package OCP;

public class CCService implements PaymentService {
    @Override
    public void processPayment(){
        System.out.println("CC payment");
    }
}
