package Assignments.Assignment02;

public class EmailNotificationSender implements NotificationSender, EmailNotification{


    @Override
    public void setRecipient() {
        System.out.println("Set Recipient");
    }

    @Override
    public void sendEmailNotification() {
        System.out.println("Sending email notification");
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending Notification");
    }
}
