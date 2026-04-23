package ch40_coupling_demo;

public class UserService {
    NotificationService notificationService = new NotificationService();
    public void notifyUser(String message){
        notificationService.send("Notification Hello");
    }
}
