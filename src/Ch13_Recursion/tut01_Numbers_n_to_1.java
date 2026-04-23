package Ch13_Recursion;
public class tut01_Numbers_n_to_1 {
    public static void printDec(int n){
        if(n == 1){
            System.out.print(n+" ");//1
            return;
        }
        System.out.print(n+" ");// 10 9 8 7 6 5 4 3 2
        printDec(n-1);//9 8 7 6 5 4 3 2 1
        System.out.print(n+" ");// 2 3 4 5 6 7 8 9 10
    }
    public static void main(String[] args) {
        int n=10;
        printDec(n);
    }
}
