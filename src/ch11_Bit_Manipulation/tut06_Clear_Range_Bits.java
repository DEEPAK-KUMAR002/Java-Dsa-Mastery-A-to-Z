package ch11_Bit_Manipulation;

public class tut06_Clear_Range_Bits {
    public static int ClearBitsinRange(int n,int i,int j){
        int a=((~0)<<(j+1));//1111 0000
        int b=(1<<i)-1;// 2^i-1 = 2^2-1=3 = 0011
        int Bitmask = a | b; //1111 0011
        return n & Bitmask; // 1010 & 0011=0010
    }
    public static void main(String[] args) {
        //10=1010
        System.out.println(ClearBitsinRange(10,2,4));

    }
}
