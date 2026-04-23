package ch06_Functionsormethods;

public class tut06_Functionoverloadingsum {
    //function to calculate sum of 2 numbers
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println("Sum of two: "+sum(3,4));
        System.out.println("Sum of Three: "+sum(3,4,6));
        System.out.println("Sum of Four: "+sum(3,4,6,9));
    }
}
