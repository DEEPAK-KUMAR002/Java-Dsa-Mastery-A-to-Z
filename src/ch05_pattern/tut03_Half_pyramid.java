package ch05_pattern;

import java.util.Scanner;

public class tut03_Half_pyramid {
    public static void main(String[] args) {
    	System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int l1=1;l1<=n;l1++){
            for(int number=1;number<=l1;number++)
            //l1=1(1)
            //l1=2(1 2)
            //l1=3(1 2 3)
            //l1=4(1 2 3 4)
            //l1=5(1 2 3 4 5)
            {
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
}
