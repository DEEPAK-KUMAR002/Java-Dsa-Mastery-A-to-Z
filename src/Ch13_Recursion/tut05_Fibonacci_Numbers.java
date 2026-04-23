package Ch13_Recursion;

public class tut05_Fibonacci_Numbers {
    public static int Fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int Fnm1=Fibonacci(n-1);
        int Fnm2=Fibonacci(n-2);
        int Fn=Fnm1+Fnm2;
        return Fn;
    }
    public static void main(String[] args) {
        System.out.println(Fibonacci(5));
        System.out.println(Fibonacci(6));
        System.out.println(Fibonacci(7));
        System.out.println(Fibonacci(8));
    }
}
