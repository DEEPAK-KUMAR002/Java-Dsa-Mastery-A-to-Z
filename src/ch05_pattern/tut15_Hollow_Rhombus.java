package ch05_pattern;

import java.util.Scanner;

public class tut15_Hollow_Rhombus {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                //space
                for(int space=1;space<=n-i;space++)
                //spaces=5-1=4
                //spaces=5-2=3
                //spaces=5-3=2
                //spaces=5-4=1
                //spaces=5-5=0
                {
                    System.out.print("  ");
                }
                //Stars
                for (int j=1;j<=n;j++){
                    if(i==1||i==n||j==1||j==n) {
                        System.out.print("* ");
                        //* * * * *
                        //*       *
                        //*       *
                        //*       *
                        //* * * * *
                    }
                    else {
                        System.out.print("  ");
                }}
                System.out.println();
            }
        }
    }
