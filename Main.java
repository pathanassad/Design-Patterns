import DIP.MongoDBDatabase;
import DIP.UserService;

public class Main {

    public static void main(String[] args){
        UserService service = new UserService(new MongoDBDatabase());
        service.saveUser("Asad");

    }
}
