package OCP;

public class NetbankingService implements PaymentService{

    @Override
    public void processPayment(){
        System.out.println("NetBanking Payment");
     }


}
