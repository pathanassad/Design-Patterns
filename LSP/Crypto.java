package LSP;

public class Crypto implements NonRefundablePayments{


    @Override
    public void pay() {
        System.out.println("Crypto Payment Done");
    }


}
