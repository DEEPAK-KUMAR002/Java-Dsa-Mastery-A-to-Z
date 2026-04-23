package ch02_Datatype;

import java.util.Scanner;

public class tut07_sumoftwo_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum = a+b;
        System.out.println("Sum of two numbers is: " + sum);
        int product = a*b;
        System.out.println("Product of two numbers is: " + product);
    }
}
