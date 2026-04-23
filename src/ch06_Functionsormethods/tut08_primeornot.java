package ch06_Functionsormethods;

public class tut08_primeornot {
    public static boolean isprime(int n) {
        // condition for 0 and 1
        if (n <= 1) {
            return false;
        }

        // condition for 2
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isprime2(int n)//8,9,11
    {
        if (n <= 1) {
            return false;
        }
        if(n==2){
            return true;//
        }
        for(int i=2;i<=Math.sqrt(n);i++)//i<=2.828427,3,
        {
            if(n % i == 0)//8 % 2 ==0,9 % 3 == 0,11 %  3.31662479!=0
            {
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        System.out.println("Is this number is prime ? 1:"+isprime(1));
        System.out.println("Is this number is prime ? 11:"+isprime(11));
        System.out.println("Is this number is prime ? 8:"+isprime2(8));
        System.out.println("Is this number is prime ? 9:"+isprime2(9));
        System.out.println("Is this number is prime ? 11:"+isprime2(11));
    }
}
