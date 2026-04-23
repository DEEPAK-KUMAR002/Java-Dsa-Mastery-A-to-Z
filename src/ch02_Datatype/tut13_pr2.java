package ch02_Datatype;
import java.util.Scanner;
public class tut13_pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        float side = sc.nextFloat();
        float area = side * side;
        System.out.println("Area of the square: " + area);
    }
}
