package ch11_Bit_Manipulation;

public class tut02_question1_Odd_Even {
    public static void oddOrEven(int n){
        int BitMask = 1;
        if((n & BitMask)==0){
            //Even number
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(8);
    }
}
