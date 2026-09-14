public class EmailFactory implements Factory{

    @Override
    public Notification createNotification(){
        return new EmailNotification();
    }

    @Override
    public Template createTemplate(){
        return new EmailTemplate();
    }
}
