package ch04_Loops;

import java.util.*;

public class tut12_prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==2){
            System.out.println("N is prime");
        }
        else{
            boolean isprime=true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){//n is a multiple of i (i not equal to 1 or n)
                    isprime=false;
                }
            }
            if(isprime==true){
                System.out.println("N is prime");
            }
            else{
                System.out.println("N is not prime");
            }
         }
        
    }
}
