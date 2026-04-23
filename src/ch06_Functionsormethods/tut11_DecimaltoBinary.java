package ch06_Functionsormethods;

public class tut11_DecimaltoBinary {
    public static void dectoBin(int n){
        int MydecNum = n;//12
        int pow = 0;
        int binNum = 0;
        while (n>0)//12,6,3,1
        {
            // Get the remainder when divided by 2. This is the current binary digit (0 or 1).
            int rem = n%2;//0,0,1,1
            // Add the remainder to the 'binNum' at its correct position.
            binNum +=(rem * (int)Math.pow(10,pow));
            //0+(0*1)=0
            //0+(0*10)=0
            //0+(1*100)= 100
            //100+(1*1000)=1100
            pow++;//1,2,3
            n = n/2;//6,3,1
        }
        System.out.println("Binary form of "+MydecNum + " = "+binNum);
    }
    public static void main(String[] args) {
        dectoBin(12);//
        int p=23;
        {
            int s=45;
            System.out.println(s);
            System.out.println(p);
        }
//        System.out.println(s);//out of Block scope
        System.out.println(p);
    }
}
