package ch06_Functionsormethods;

public class tut07_functionalOverloadingDataTypes {
    public static int sum(int a,int b) {
        return a+b;
    }
    public static float sum(float a,float b) {
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Sum of two int number:"+sum(2,5));
        System.out.println("Sum of two int number:"+sum(2.9f,5.86f));
    }
}
