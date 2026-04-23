package ch05_pattern;

import java.util.Scanner;

public class tut02_inverted_Star {
    public static void main(String[] args) {
    	System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int l1=1;l1<=n;l1++){
            for(int star=1;star<=n-l1+1;star++)
            //l1=1(5-1+1=5 * * * * *)
            //l1=2(5-2+1=4 * * * *)
            //l1=3(5-3+1=3 * * *)
            //l1=4(5-4+1=2 * *)
            //l1=5(5-5+1=1 *)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
