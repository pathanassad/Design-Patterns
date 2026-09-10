package ISP;

public class BackendDeveloper implements Coder, Tester{

    @Override
    public void writeCode(){
        System.out.println("Dev writing code");
    }

    @Override
    public void testCode(){
        System.out.println("Dev Testing code");
    }
    
}
