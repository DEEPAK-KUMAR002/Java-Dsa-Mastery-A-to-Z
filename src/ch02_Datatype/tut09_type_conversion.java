package ch02_Datatype;

import java.util.Scanner;

public class tut09_type_conversion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float number=sc.nextInt();
        System.out.println(number);

//        long a = 25;
//        int b = a;
        int a=25;
        long b=a;
        System.out.println(b);
    }
}
