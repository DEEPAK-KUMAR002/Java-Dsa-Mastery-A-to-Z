package ch03_Conditional_Statements;

public class tut07_ternaryoperator {
    public static void main(String[] args) {
        int n = 4;
        String type=((n % 2) == 0) ? "Even Number":"Odd Number";
        System.out.println(type);
    }
}
