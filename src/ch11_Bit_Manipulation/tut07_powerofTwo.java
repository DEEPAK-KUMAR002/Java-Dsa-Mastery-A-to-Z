package ch11_Bit_Manipulation;

public class tut07_powerofTwo {
    public static boolean isPowerofTwo(int n){
        return (n & (n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerofTwo(15));
        System.out.println(isPowerofTwo(120));
        System.out.println(isPowerofTwo(34));
        System.out.println(isPowerofTwo(32));
        System.out.println(isPowerofTwo(128));
    }
}
