package ch06_Functionsormethods;

import java.util.Scanner;

public class tut02_sumab {
    //method1
//    public static void calculateSum1(int num1,int num2){
//
//        int sum=num1+num2;
//        System.out.println("Sum is : "+sum);
//    }
//    method2
//    public static int calculateSum(int num1,int num2)//parameters or formal parameter
//    {
//        int sum=num1+num2;
//        return sum;
//    }


    //method 3
    public static void calculateSum3(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        int sum = a+b;
        System.out.println("Sum is : "+sum);
    }

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number 1:");
//        int a=sc.nextInt();
//        System.out.println("Enter number 2:");
//        int b=sc.nextInt();
////        method1
////        calculateSum1(a,b);
//        // method 2
//        int sum=calculateSum(a,b);//arguments or actual parameters
//        System.out.println("Sum is :"+sum);

        //method 3
        calculateSum3();


    }
}
