public class CalculatorLazyIntialization {
private int a;
private int b;

private static CalculatorLazyIntialization obj;

private CalculatorLazyIntialization(){
    System.out.println("Instance Created");
}

public int sum(){
    return a + b;
}

public static CalculatorLazyIntialization getInstance(){
    if(obj == null){
        obj = new CalculatorLazyIntialization();
    }

    return obj;
}

}
