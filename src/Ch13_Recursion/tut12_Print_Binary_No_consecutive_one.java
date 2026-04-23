package Ch13_Recursion;

public class tut12_Print_Binary_No_consecutive_one{
    public static void Print_Binary_Strings(int n,int lastPlace,String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        Print_Binary_Strings(n-1,0,str+"0");
        if(lastPlace == 0){
            Print_Binary_Strings(n-1,1,str+"1");
        }
    }
    public static void main(String[] args) {
        Print_Binary_Strings(3,0,"");
    }
}
