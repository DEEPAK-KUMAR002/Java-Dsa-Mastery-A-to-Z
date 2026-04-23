package ch06_Functionsormethods;

public class tut04_product {
    public static int multiply(int p,int q) {
        int product=p*q;
        return product;
    }
    public static void main(String[] args) {
        int a=3;
        int b=5;
        int prod1=multiply(a,b);
        System.out.println("Multiply of two number is (a*b) :"+prod1);
        int prod2=multiply(10,30);
        System.out.println("Multiply of two number is (a*b) :"+prod2);
    }
}
