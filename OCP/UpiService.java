package OCP;

public class UpiService  implements PaymentService{

    @Override
    public void processPayment(){
        System.out.println("UPI Payment");
    }


}
