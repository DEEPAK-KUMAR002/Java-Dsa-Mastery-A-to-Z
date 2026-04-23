package ch06_Functionsormethods;

public class tut09_print_all_prime_range {
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
            //(3)1.73,(4)2,(5)2.236,(6)2.4494,(7)2.6457,(8)2.8284,(9)3,(10)3.16227
        {
            if(n % i == 0)//4 % 2 == 0,5 % 2 !=0,6 % 2 == 0,7 % 2 !=0,8 % 2 == 0,9 % 3==0,10 % 2 ==0
            {
                return false;
            }
        }
        return  true;
    }
    public static void primeinRange(int n)//10
    {
        for(int i=2;i<=n;i++)//
        {
            if(isprime(i))//isprime(2,3,4,5,6,7,8,9,10)
            {
                System.out.print(i+" ");//2 3 5 7
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        primeinRange(30); //2 ,3,5,7
    }
}
