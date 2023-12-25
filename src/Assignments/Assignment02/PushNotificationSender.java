package Assignments.Assignment02;

public class PushNotificationSender implements NotificationSender, PushNotification{

    @Override
    public void sendPushNotification() {
        System.out.println("Sending Push Notification");
    }
    @Override
    public void sendNotification() {
        System.out.println("Sending Notification");
    }
}
