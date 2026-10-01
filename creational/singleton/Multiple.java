public class Multiple {

private int a;
private int b;

private static Multiple obj;

private Multiple(){
    System.out.println("Instance Created");
}

public int sum(){
    return a + b;
}

public static Multiple getInstance(){
    if(obj == null){
        synchronized (Multiple.class){
            if(obj == null){
                obj = new Multiple();
            }
        }

    }


    return obj;
}


}
