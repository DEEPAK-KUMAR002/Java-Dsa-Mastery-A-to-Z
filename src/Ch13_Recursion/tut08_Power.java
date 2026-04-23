package Ch13_Recursion;

public class tut08_Power {
    public static int power(int x,int n){
        // Dry run for power(2,5):
        // power(2,5) -> 2 * power(2,4)
        // power(2,4) -> 2 * power(2,3)
        // power(2,3) -> 2 * power(2,2)
        // power(2,2) -> 2 * power(2,1)
        // power(2,1) -> 2 * power(2,0)
        // power(2,0) -> 1 (base case)
        // Unwinding:
        // power(2,1) = 2 * 1 = 2
        // power(2,2) = 2 * 2 = 4
        // power(2,3) = 2 * 4 = 8
        // power(2,4) = 2 * 8 = 16
        // power(2,5) = 2 * 16 = 32
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
    public static int optimizedPower(int a,int n){
//        Step 1:
//        n=1
//        halfPower = 1
//        halfPowerSq = 1*1 = 1
//        n is odd → multiply by 2
//        return 2
//
//        Step 2:
//        n=2
//        halfPower = 2
//        halfPowerSq = 2*2 = 4
//        n is even → no extra multiply
//        return 4
//
//        Step 3:
//        n=5
//        halfPower = 4
//        halfPowerSq = 4*4 = 16
//        n is odd → multiply by 2
//        return 32
        if(n==0){
            return 1;
        }
        int halfPower = optimizedPower(a,n/2);
        int halfPowerSq = halfPower*halfPower;
        if(n%2!=0)// If n is odd, multiply by a
        {
            halfPowerSq = a*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(power(2,5)); // Output: 32
        System.out.println(optimizedPower(2,5)); // Output: 32
    }
}