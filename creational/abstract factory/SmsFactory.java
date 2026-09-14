public class SmsFactory implements Factory{
    @Override
    public Notification createNotification(){
        return new SmsNotification();
    }

    @Override
    public Template createTemplate(){
        return  new SmsTemplate();
    }
}
