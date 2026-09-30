public class Calculator {
    private int a;
    private int b;

    private static Calculator obj = new Calculator();

    private Calculator(){

    }

    public int sum(){
        return a + b;
    }

    public static Calculator getInstance(){
        return obj;
    }

}
