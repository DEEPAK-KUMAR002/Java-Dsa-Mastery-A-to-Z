package ch05_pattern;

import java.util.Scanner;

public class tut04_character_pattern {
    public static void main(String[] args) {
    	System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char character='A';
        for(int l1=1;l1<=n;l1++){
            for(char ch=1;ch<=l1;ch++)
            //l1=1(ch=1 A)
            //l1=2(ch=2 B C)
            //l1=3(ch=3 D E F)
            //l1=4(ch=4 G H I J)
            //l1=5(ch=5 K L M N O)
            {
                System.out.print(character+" ");
                character++;
            }
            System.out.println();
        }
    }
}
