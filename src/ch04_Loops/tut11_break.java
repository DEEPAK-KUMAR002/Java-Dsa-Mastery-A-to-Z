package ch04_Loops;

import java.util.Scanner;

public class tut11_break {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the for loop");

         

        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter Your Number: ");
            int n=sc.nextInt();
            if(n%10==0){
                break;//break the do while loop
            }
            System.out.println(n);
        }while(true);
    }
}
