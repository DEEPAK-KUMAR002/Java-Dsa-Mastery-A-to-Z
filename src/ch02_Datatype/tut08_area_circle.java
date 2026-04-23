package ch02_Datatype;

import java.util.Scanner;

public class tut08_area_circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float rad=sc.nextFloat();
        float area=3.14f*rad*rad;
        System.out.println("Radius of circle is :"+rad);
        System.out.println("Area of circle is :"+area);
    }
}
