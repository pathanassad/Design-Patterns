package LSP;

public class CreditCard implements Payment{

    @Override
    public void pay(){
        System.out.println("Credit Card Payment Done");
    }

    @Override
    public void refund() {
        System.out.println("Credit Card Refund Done");
    }

}
