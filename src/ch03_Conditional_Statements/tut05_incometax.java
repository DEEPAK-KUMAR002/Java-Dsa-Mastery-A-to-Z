package ch03_Conditional_Statements;

import java.util.Scanner;

public class tut05_incometax {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your salary:");
        int income=sc.nextInt();
        int tax=0;
        if(income<500000){
            tax=0;
            System.out.println("Your salary is less than 5 lakh, and the tax is: "+tax);
        }
        else if(income>=500000  && income<1000000){
        	System.out.println("The tax rate on your salary is 20%.");
            tax=(int)(income*0.2f);
            System.out.println("Your salary is lies b/w (5 -10 )lakhs, and the tax is: "+tax);
        }
        else{
        	System.out.println("The tax rate on your salary is 30%.");
            tax=(int)(income*0.3f);
            System.out.println("Your salary is greater than 10 lakh, and the tax is: "+tax);
        }
        System.out.println("If there is no tax, your salary remains the same, and your salary is: "+(income));
        System.out.println("There is  tax on your salary, and your remaining salary  is  : "+(income-tax));
    }
}
