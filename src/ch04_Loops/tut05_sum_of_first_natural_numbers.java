package ch04_Loops;

import java.util.Scanner;

public class tut05_sum_of_first_natural_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int i=1;
        while(i <= n){
            sum+=i;
            i++;
        }
        System.out.println("Sum is :"+sum);
    }
}
