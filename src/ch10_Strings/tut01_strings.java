package ch10_Strings;

import java.io.PrintStream;
import java.util.Scanner;

public class tut01_strings {
    public static void main(String[] args) {
        char arr[] = {'a','b','c','d'};
        String str1="abcd";
        String str2= new String("xyz");
        String str3 = new String(arr);
        //Strings are Immutable.
        System.out.print("Enter your name: ");
        Scanner sc=new Scanner(System.in);
        String name;
        name=sc.nextLine();
        System.out.println(name);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
