package ch06_Functionsormethods;
import java.util.Scanner;
public class tut15_pr5_Sumofdigit {
    public static int sumDigits(int n)//12345
    {
        int sumofDigit = 0;
        while(n>0)//12345
        {
            int digit = n%10;
            sumofDigit += digit;//5+4+3+2+1=15
            n/=10;
        }
        return sumofDigit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int digits = sc.nextInt();//12345
        System.out.println("The sum is " + sumDigits(digits));
    }
}
