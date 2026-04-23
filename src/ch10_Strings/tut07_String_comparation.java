package ch10_Strings;

public class tut07_String_comparation {
    public static void main(String[] args) {
        String s1 = "Tony";              // String literal (goes to String Constant Pool)
        String s2 = "Tony";              // Reuses same object from pool
        String s3 = new String("Tony");  // Creates NEW object in heap
        if(s1==s2){
            System.out.println("Strings are equal of s1,s2");
        }
        else{
            System.out.println("String are not equal of s1,s2");
        }
        if(s1==s3){
            System.out.println("Strings are equal of s1,s3");
        }
        else{
            System.out.println("String are not equal of s1,s3");
        }


        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

    }
}
