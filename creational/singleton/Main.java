public class Main {

    public static void main(String args[]){
        Calculator c1 = Calculator.getInstance();
        CalculatorLazyIntialization c2 = CalculatorLazyIntialization.getInstance();

        int result = c1.sum();
        System.out.println(result);
        int res = c2.sum();
        System.out.println(res);
    }
}
