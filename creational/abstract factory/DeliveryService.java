public class DeliveryService {
    public void sendNotification(){
            Factory factory = new EmailFactory();
            Notification notification = factory.createNotification();
            notification.send();

    }


    public void createTemplate(){
        Factory factory = new SmsFactory();
        Template template = factory.createTemplate();
        template.format();
    }
}
