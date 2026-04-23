package ch10_Strings;

public class tut08_Substring {
    public static String Substring(String str, int si, int ei){
        String Substr="";
        for(int i = si;i<ei;i++){
            Substr += str.charAt(i);
        }
        return Substr;
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println( str.substring(0,5));
        System.out.println(Substring( str,0,5));
    }
}
