package Ch13_Recursion;

public class tut04_Sumof_N_Numbers {
    public static int Sum(int n){
        // Each call pushes n onto the stack until n == 1
        if(n==1){
            return 1; // Base case: sum of 1 is 1
        }
        int Snm1 = Sum(n-1); // Recursively calculate sum of n-1
        // For n=5: calls Sum(4), Sum(3), Sum(2), Sum(1)
        int Sn =  Snm1+n; // Add n to sum of previous numbers
        // Stack unwinds: 1, 1+2=3, 3+3=6, 6+4=10, 10+5=15
        return Sn; // Return the result up the call stack
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(Sum(n)); // Output: 15
    }
}