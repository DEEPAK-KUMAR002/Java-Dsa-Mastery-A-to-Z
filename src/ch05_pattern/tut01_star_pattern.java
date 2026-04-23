package ch05_pattern;

import java.util.Scanner;

public class tut01_star_pattern {
    public static void main(String[] args) {
    	System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int l1=1;l1<=n;l1++){
            for(int star=1;star<=l1;star++)
            //l1=1(*)
            //l1=2(* *)
            //l1=3(* * *)
            //l1=4(* * * *)
            //l1=5(* * * * *)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
