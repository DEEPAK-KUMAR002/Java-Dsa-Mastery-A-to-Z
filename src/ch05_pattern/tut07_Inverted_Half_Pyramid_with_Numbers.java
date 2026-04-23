package ch05_pattern;

import java.util.Scanner;

public class tut07_Inverted_Half_Pyramid_with_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++)
            //row =1 col=5-1+1=5(1 2 3 4 5)
            //row =2 col=5-2+1=5(1 2 3 4)
            //row =3 col=5-3+1=5(1 2 3)
            //row =4 col=5-4+1=5(1 2)
            //row =5 col=5-5+1=5(1)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
