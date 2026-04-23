package ch06_Functionsormethods;

import java.util.Scanner;

public class tut13_ChecKEven {
    public static boolean IsEven(int n) {
        return n % 2 == 0;//true,false return
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter an integer: ");
        num = sc.nextInt();
        if (IsEven(num)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}