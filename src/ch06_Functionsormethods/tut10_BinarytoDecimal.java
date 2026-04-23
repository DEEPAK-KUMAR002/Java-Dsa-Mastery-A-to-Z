package ch06_Functionsormethods;

public class tut10_BinarytoDecimal {
    public static void BinaryTodecimal(int binNum)//1111
    {
        int mybinnum=binNum;//1111
        int pow=0;
        int decNum =0;
        while(binNum > 0)//1111,111,11,1
        {
            //Get the last digit of the binary number.
            int lastdigit = binNum%10;//1111,111,11,1%10=1
            // Calculate the decimal value for the current digit.
            decNum = decNum+(lastdigit * (int)Math.pow(2,pow));
            //0+(1*1)=1
            //1+(1*2)=3
            //3+(1*4)=7
            //7+(1*8)=15
            pow++;
            // Remove the last digit from the binary number to process the next one.
            binNum = binNum/10;//1111,111,11,1/10=111,11,1,0
        }
        System.out.println("Decimal of "+mybinnum+" ="+decNum);
    }
    public static void main(String[] args) {
        BinaryTodecimal(1111);
    }
}
