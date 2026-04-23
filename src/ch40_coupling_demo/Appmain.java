package ch40_coupling_demo;

public class Appmain {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.notifyUser("Order placed!");
    }
}
