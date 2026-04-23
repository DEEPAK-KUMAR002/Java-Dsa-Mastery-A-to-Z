package ch11_Bit_Manipulation;

public class tut05_ClearLast_i_Bits {
    public static int ClearLast_i_Bits(int n,int i){
        //0        = 00000000 00000000 00000000 00000000
        //~0       = 11111111 11111111 11111111 11111111
        int bitmask = (~0)<<i;//1100
        return n & bitmask;//1111 & 1100=1100
    }
    public static void main(String[] args) {
        System.out.println(ClearLast_i_Bits(15,2));
    }
}
