package ch06_Functionsormethods;

import java.util.Scanner;

public class tut14_pr3_Palindrome {
    public static boolean isPalindrome(int n){
        int original = n;
        int reversed = 0;
        while(n > 0)//121,12,1
        {
            int digit= n%10;//1,2,1
            reversed=reversed*10+digit;//0*10+1=1,1*10+2=12,12*10+1=121
            n/=10;//121=12=1=0
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();//121
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
