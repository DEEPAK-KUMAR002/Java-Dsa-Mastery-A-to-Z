package ch40_coupling_demo;

public class NotificationService {
    public void send(String Message){
        //sms
        System.out.println("Notification :"+Message);
    }
}
