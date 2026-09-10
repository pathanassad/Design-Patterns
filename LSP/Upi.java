package LSP;

public class Upi implements Payment{

@Override
public void pay() {
    System.out.println("UPI Payment Done");
}

@Override
public void refund() {
    System.out.println("UPI Refund Done");
}

public void checkBalance(){
    System.out.println("Checking UPI Balance");
}


}
