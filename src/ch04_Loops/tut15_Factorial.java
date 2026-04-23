package ch04_Loops;

import java.util.Scanner;

public class tut15_Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a  number:");
        int n=sc.nextInt();
        long Factorial=1;
        for(int i=1;i<=n;i++){
            Factorial*=i;//1*1=1,1*2=2,2*3=6,6*4=24,24*5=120.
        }
        System.out.println("Factorial of "+n +" is:"+Factorial);
    }
}
