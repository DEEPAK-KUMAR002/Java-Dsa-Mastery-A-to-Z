package ch11_Bit_Manipulation;
public class tut03_get_i_th_Bits {
    public static void GetithBits(int n,int i){
        int BitMask=1<<i;
        //1st bits is ...
        System.out.println("Number is "+n);
        if((n & BitMask)==0){
            //Even number
            System.out.println("ith bits is 0");
        }
        else {
            System.out.println("ith bits is 1");
        }
    }
    public static void main(String[] args) {
        GetithBits(5,1);//101=0
        GetithBits(4,2);//100=1
        GetithBits(11,3);//1011=1
        GetithBits(12,4);//1100=0
    }
}

