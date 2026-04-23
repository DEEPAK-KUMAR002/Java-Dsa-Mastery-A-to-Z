package Ch13_Recursion;

public class tut03_Factorial {
    public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        int Fnm1= Factorial(n-1);//4->3->2->1
        int Fn = n * Fnm1;//1, 1*1=1, 2*1=2, 3*2=6, 4*6=24, 5*24=120.(n*f(n-1))
        return Fn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(Factorial(n));
    }
}
