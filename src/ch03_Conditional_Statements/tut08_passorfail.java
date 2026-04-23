package ch03_Conditional_Statements;

import java.util.Scanner;

public class tut08_passorfail {
    public static void main(String[] args) {
        System.out.print("Enter the marks of students in a test:");
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        String result= (marks>=33) ? "Pass" : "Fail";
        System.out.println(result);
    }
}
