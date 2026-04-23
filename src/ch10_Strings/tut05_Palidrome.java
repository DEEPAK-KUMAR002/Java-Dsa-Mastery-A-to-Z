package ch10_Strings;

public class tut05_Palidrome {
    public static boolean isPalindrome(String str){
        //Tc = 0(n)
        for(int i=0;i<str.length();i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "MADAM";
        System.out.println(isPalindrome(str));
    }
}
