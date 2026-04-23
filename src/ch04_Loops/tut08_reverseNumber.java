package ch04_Loops;

public class tut08_reverseNumber {
    public static void main(String[] args) {
        int n=23456789;
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n/=10;
        }
        System.out.println();
    }
}
