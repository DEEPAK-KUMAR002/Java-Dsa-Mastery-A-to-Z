package ch07_1D_Array;

import java.util.Scanner;

public class tut02_inputarray {
    public static void main(String[] args) {
        int marks[] = new int[100];
        System.out.println("Length of Array :"+marks.length);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter physics marks:");
        marks[0] = sc.nextInt();
        System.out.print("Enter Chemistry marks:");
        marks[1] = sc.nextInt();
        System.out.print("Enter Mathematics marks:");
        marks[2] = sc.nextInt();

        System.out.println("Physics marks:"+marks[0]);
        System.out.println("Chemistry marks:"+marks[1]);
        System.out.println("Mathematics marks:"+marks[2]);
        int percentage1 = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage of pcm :"+percentage1+"%");
        marks[2]=100;
        System.out.println("Updated Mathematics marks :"+marks[2]);
        int percentage2 = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage of pcm :"+percentage2+"%");
    }
}
