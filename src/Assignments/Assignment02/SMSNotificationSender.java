package Assignments.Assignment02;

public class SMSNotificationSender implements NotificationSender, SMSNotification{

    @Override
    public void specifyPhoneNumber() {
        System.out.println("Please provide Phone Number: ");
    }

    @Override
    public void sendSMSNotification() {
        System.out.println("Sending SMS Notification");
    }
    @Override
    public void sendNotification() {
        System.out.println("Sending Notification");
    }
}
