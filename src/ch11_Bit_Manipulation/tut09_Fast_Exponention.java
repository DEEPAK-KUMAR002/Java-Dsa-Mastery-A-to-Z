package ch11_Bit_Manipulation;

public class tut09_Fast_Exponention {
    public static int FastExponential(int n,int p){
        int ans = 1;
        while(p > 0)//5
        {
            if((p & 1) != 0)//101 & 001 = 001//010 & 001=000//001 & 001 =001
            {
                ans = ans * n;//1*3=3//0//3*81
            }
            n = n*n;//3*3=9//9*9=81//81*81
            p = p>>1;//010//001//000
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(FastExponential(3,5));
    }
}
