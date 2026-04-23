package ch03_Conditional_Statements;

import java.util.Scanner;

public class tut09_Switchcase {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch (n){
            case 1:
                System.out.println("samosa");
                break;
            case 2:
                System.out.println("pizza");
                break;
            case 3:
                System.out.println("Burger");
                break;
            default:
                System.out.println("We realize we are dreaming ");
                break;
        }
    }
}
