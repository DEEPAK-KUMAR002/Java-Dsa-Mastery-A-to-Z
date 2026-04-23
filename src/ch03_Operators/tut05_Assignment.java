package ch03_Operators;

public class tut05_Assignment {
    public static void main(String[] args) {
        int a = 10;      // Assignment
        System.out.println("a = " + a);//10

        a += 5;          // a = a + 5
        System.out.println("a += 5: " + a);//15

        a -= 3;          // a = a - 3
        System.out.println("a -= 3: " + a);//12

        a *= 2;          // a = a * 2
        System.out.println("a *= 2: " + a);//24

        a /= 4;          // a = a / 4
        System.out.println("a /= 4: " + a);//6

        a %= 3;          // a = a % 3
        System.out.println("a %= 3: " + a);//0
    }
}