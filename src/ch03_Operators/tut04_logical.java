package ch03_Operators;

public class tut04_logical {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 15;

        // Logical AND (&&)
        System.out.println("(a < b) && (b < c): " + ((a < b) && (b < c))); // true
        System.out.println("(a < b) && (b > c): " + ((a < b) && (b > c))); // false
        System.out.println("(a > b) && (b < c): " + ((a > b) && (b < c))); // false
        System.out.println("(a > b) && (b > c): " + ((a > b) && (b > c))); // false

        // Logical OR (||)
        System.out.println("(a < b) || (b < c): " + ((a < b) || (b < c))); // true
        System.out.println("(a < b) || (b > c): " + ((a < b) || (b > c))); // true
        System.out.println("(a > b) || (b < c): " + ((a > b) || (b < c))); // true
        System.out.println("(a > b) || (b > c): " + ((a > b) || (b > c))); // false

        // Logical NOT (!)
        System.out.println("!(a == b): " + (!(a == b))); // true
        System.out.println("!(a < b): " + (!(a < b))); //false
        System.out.println("(!true): "+ (!true));
    }
}
