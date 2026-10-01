public class Main {

    public static void main(String args[]){
        Calculator c1 = Calculator.getInstance();
        CalculatorLazyIntialization c2 = CalculatorLazyIntialization.getInstance();

        int result = c1.sum();
        System.out.println(result);
        int res = c2.sum();
        System.out.println(res);

        Thread t1 = new Thread(() -> {
            CalculatorLazyIntialization data = CalculatorLazyIntialization.getInstance();
        });

        Thread t2 = new Thread(() -> {
           CalculatorLazyIntialization data1 =  CalculatorLazyIntialization.getInstance();
        });

        t1.start();
        t2.start();

       // Double Checked Locking Mechanism
        Thread t3 = new Thread(() -> {
            Multiple mul = Multiple.getInstance();
        });
        Thread t4 = new Thread(() -> {
            Multiple mul2 = Multiple.getInstance();
        });

        t3.start();
        t4.start();
    }
}
