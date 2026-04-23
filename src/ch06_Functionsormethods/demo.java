package ch06_Functionsormethods;

public class demo {
    public static void sumofdigit(int n){
        int sum=0;
        while(n>0){
            int lastdigit=n%10;
            sum+=lastdigit;
            n/=10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int num=12345678;
        sumofdigit(num);
    }
}
