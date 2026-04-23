package ch04_Loops;

import java.util.Scanner;

public class tut11_continue {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }

         

        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter Your Number: ");
            int n=sc.nextInt();
            if(n%10==0){
                continue;// to skip the iteration multiple of 10
            }
            System.out.println("Number was: "+n);
        }while(true);
    }
}

