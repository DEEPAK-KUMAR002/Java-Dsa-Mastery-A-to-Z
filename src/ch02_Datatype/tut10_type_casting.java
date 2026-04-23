package ch02_Datatype;

import java.util.Scanner;

public class tut10_type_casting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float marks=99.9999f;
        // int b=a; //possible lossy conversion from float to int
        int b =(int)marks;
        System.out.println(b);
        char ch='a';
        int num=ch;
        System.out.println(num);
    }
}
