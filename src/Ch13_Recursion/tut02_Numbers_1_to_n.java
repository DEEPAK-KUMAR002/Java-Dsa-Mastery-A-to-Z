package Ch13_Recursion;

public class tut02_Numbers_1_to_n {
    public static void PrintIncreasing(int n){
        // Each call pushes n onto the call stack until n == 1
        if(n == 1){
            System.out.print(n+" "); // Prints 1 when base case is reached
            return;
        }
        PrintIncreasing(n-1); // Recursively call with n-1 (stacking up: 10,9,...,2)
        System.out.print(n+" "); // Prints n as the stack unwinds (prints 2,3,...,10)
    }
    public static void main(String[] args) {
        int n=5;
        PrintIncreasing(n); // Output: 1 2 3 4 5 6 7 8 9 10
    }
}