package ch03_Conditional_Statements;

public class tut14_ValueXY {
    public static void main(String[] args) {
        int a = 63, b = 36;
        boolean x = (a < b ) ? true : false;
        int y= (a > b ) ? a : b;
        System.out.println("Value of x is "+x+" ,and Y is: "+y);
    }
}
