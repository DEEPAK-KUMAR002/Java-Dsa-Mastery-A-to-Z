package ch06_Functionsormethods;

import java.util.Scanner;

public class tut03_Swap {
    public static void swap(int a,int b){
//        a=6;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("method value of a = "+a);
        System.out.println("method value of b = "+b);
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the number of a:");
//        int a1=sc.nextInt();
//        System.out.print("Enter the number of b:");
//        int b1=sc.nextInt();
//        //swap-method 1
//        int temp = a1;
//        a1 = b1;
//        b1 = temp;
//        System.out.println("a = "+a1);
//        System.out.println("b = "+b1);

        //swap-method 2
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of a:");
        int a=sc.nextInt();
        System.out.print("Enter the number of b:");
        int b=sc.nextInt();
        swap(a,b);//call by value=copy pass
        System.out.println("Actual value of a in main function= "+a);
        System.out.println("Actual value of b in main function = "+b);

    }
}
