package ch11_Bit_Manipulation;

public class tut04_set_i_Th_Bits {
    public static int SetithBit(int n,int i){
        int BitMask=1<<i;
        return n | BitMask;
    }
    public static int ClearithBit(int n,int i){
        int BitMask=~(1<<i);
        return n & BitMask;
    }
    public static int updateIthBit(int n,int i,int newBit){
//        if(newBit == 0){
//            return ClearithBit(n,i);
//        }
//        else{
//            return SetithBit(n,i);
//        }

        n = ClearithBit(n,i);
        int Bitmask = newBit<<i;
        return n | Bitmask;
    }
    public static void main(String[] args) {
        //10=1010
        /*
        System.out.println(SetithBit(10,1));
        System.out.println(SetithBit(10,2));
        System.out.println(SetithBit(10,3));

        System.out.println(ClearithBit(10,1));
        System.out.println(ClearithBit(10,2));

         */

        System.out.println(updateIthBit(10,2,1));
    }
}
