package ch04_Loops;
import java.util.Scanner;
public class tut14_SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.print("Enter the number ");
            number = sc.nextInt();//5
            if( number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;//oddSum=5
            }
            System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
                    choice = sc.nextInt();//Enter number except 1
        } while(choice==1);
        System.out.println("Sum of even numbers: " + evenSum);//0
        System.out.println("Sum of odd numbers: " + oddSum);//5
    }
}