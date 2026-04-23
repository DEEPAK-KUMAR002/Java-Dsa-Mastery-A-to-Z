package ch10_Strings;

public class tut10_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
           sb.append(ch) ;
           //abcdefghijklmnopqrstvuwxyz
            // Time complexity=0(26)
        }
        System.out.println(sb.toString());
        System.out.println(sb.length());
    }
}
