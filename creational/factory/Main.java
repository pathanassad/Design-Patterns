public class Main {

    public static void main(String[] args){
        OrderService os = new OrderService();
        DeliveryService ds = new DeliveryService();
        os.sendNotification();
        ds.sendNotification();

    }
}
