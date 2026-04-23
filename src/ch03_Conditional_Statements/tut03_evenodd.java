package ch03_Conditional_Statements;

import java.util.Scanner;

public class tut03_evenodd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        if(n % 2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
