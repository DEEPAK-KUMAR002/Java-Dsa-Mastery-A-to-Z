package ch05_pattern;

import java.util.Scanner;

public class tut06_Inverted_Half_pyramid_rotated180 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();//5
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++)
            //row = 1,space = 5 -1=4 spaces
            //row = 2,space = 5 -2=3 spaces
            //row = 3,space = 5 -3=2 spaces
            //row = 4,space = 5 -4=1 spaces
            //row = 5,space = 5 -5=0 spaces
            {
                System.out.print("  ");
            }
            //row =1 star = 1(    *)
            //row =2 star = 2(   **)
            //row =3 star = 3(  ***)
            //row =4 star = 4( ****)
            //row =5 star = 5(*****)
            for(int star=1;star<=row;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
