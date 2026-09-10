package DIP;

public class MySQLDatabase implements Database{


    @Override
    public void save(String user){
        System.out.println("Saving Data in database" + user);
    }

}
