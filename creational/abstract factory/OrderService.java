public class OrderService {

    public void sendNotification(){
        Factory factory = new SmsFactory();
        Notification notification = factory.createNotification();
        notification.send();

    }

    public void createTemplate(){
        Factory factory = new EmailFactory();
        Template template = factory.createTemplate();
        template.format();
    }
}
