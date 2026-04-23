package ch03_Conditional_Statements;

import java.util.Scanner;

public class tut12_feverornot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();

        if (temp > 100) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You don't have a fever");
        }
    }
}
