package DIP;

public class MongoDBDatabase implements Database{

    @Override
    public void save(String user){
        System.out.println("Storing Document in MongoDB:" + user);
    }

}
