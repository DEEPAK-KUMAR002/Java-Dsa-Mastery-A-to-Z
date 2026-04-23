package ch02_Datatype;
import java.util.Scanner;
public class tut06_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String input = sc.next();
         System.out.println(input);
        System.out.println(input.getClass().getSimpleName());
        sc.nextLine();
        String input1 = sc.nextLine();
         System.out.println(input1);
        System.out.println(input1.getClass().getSimpleName());

        // For primitive int, use wrapper class to get class name
         int a = sc.nextInt();
         System.out.println(a);
        System.out.println(((Object)a).getClass().getSimpleName());

        // For primitive float, use wrapper class to get class name
        float b = sc.nextFloat();
        System.out.println(b);
        System.out.println(((Object)b).getClass().getSimpleName());
    }
}
