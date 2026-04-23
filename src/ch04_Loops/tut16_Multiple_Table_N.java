package ch04_Loops;

import java.util.Scanner;

public class tut16_Multiple_Table_N {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int N = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(N+" X "+i+" = "+(N*i));
        }
    }
}
