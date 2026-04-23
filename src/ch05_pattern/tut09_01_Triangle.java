package ch05_pattern;

import java.util.Scanner;

public class tut09_01_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                int sum=i+j;
                //1+1=2 (1)
                //2+1=3,2+2=4 (0 1)
                //3+1=4,3+2=5,3+3=6(1 0 1)
                //4+1=5,4+2=6,4+3=7(0 1 0 1)
                //5+1=6,5+2=7,5+3=8(1 0 1 0 1)
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
