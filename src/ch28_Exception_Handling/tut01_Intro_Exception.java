package ch28_Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tut01_Intro_Exception {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your name:");
            String name = sc.nextLine();
            System.out.println("Hi "+name);
            System.out.println("Enter your age:");
            int age = sc.nextInt();
            System.out.println("Your age is :"+age);
            if(age <  18){
                throw new tut01_AgeInvalidException();
            }
            System.out.println("Voted ");
        }
        catch (tut01_AgeInvalidException ex){
            System.out.println("Your age is Invalid");
            System.out.println(ex.getMessage());
        }
        catch (InputMismatchException ex){
            System.out.println("Input is Wrong");
            System.out.println("Please enter valid input");
        }
        catch (Exception ex){
            System.out.println("Error !!");
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Finally statement");
        }
        System.out.println("Thank you !");
    }
}
