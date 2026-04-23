package ch06_Functionsormethods;

public class tut05_Factorial {
    public static int factorial(int n){//n=4
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;//f=1*1=1*2=2*3=6*4=24
        }
        return f;//factorial of n
    }
    public static int binomial(int n,int r){
        int nfact = factorial(n);//1*2*3*4=24
        int rfact = factorial(r);//1*2=2
        int nr_fact = factorial(n-r);//1*2=2
        int bincoeff = nfact/(rfact*nr_fact);
        //24/4=6
        return bincoeff;
    }
    public static void main(String[] args) {
        System.out.println("factorial is "+factorial(4));//24
        System.out.println("Binomial is  "+binomial(4,2));//6
    }
}
