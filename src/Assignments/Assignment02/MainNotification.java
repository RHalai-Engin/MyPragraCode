package Assignments.Assignment02;

public class MainNotification {
    public static void main(String[] args) {
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("Email Notification Sender");
        System.out.println("++++++++++++++++++++++++++++");
        EmailNotificationSender email = new EmailNotificationSender();
        email.setRecipient();
        email.sendEmailNotification();
        email.sendNotification();
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("SMS Notification Sender");
        System.out.println("++++++++++++++++++++++++++++");
        SMSNotificationSender sms = new SMSNotificationSender();
        sms.specifyPhoneNumber();
        sms.sendSMSNotification();
        sms.sendNotification();
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("Push Notification Sender");
        System.out.println("++++++++++++++++++++++++++++");
        PushNotificationSender pushNotify = new PushNotificationSender();
        pushNotify.sendPushNotification();
        pushNotify.sendNotification();
    }
}
