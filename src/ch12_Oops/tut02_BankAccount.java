package ch12_Oops;
class BankAccount{
    public String Username;
    private String Password;
    public void setPassword(String pwd) {
        Password=pwd;
    }
}
public class tut02_BankAccount {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.Username="Ravi das";
//        myAcc.Password="abcdeghi";
        myAcc.setPassword("abcdefghi");
        System.out.println(myAcc.Username);
    }
}
