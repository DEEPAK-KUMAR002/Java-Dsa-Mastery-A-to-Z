package ch02_Datatype;

import java.util.Scanner;

public class tut12_pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float average = (a + b + c) / 3;
        System.out.println(average);
    }
}
