package ch10_Strings;

public class tut04_charat {
    public static void printString(String str) {
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String FirstName = "Deepak";
        String LastName = "Kumar";
        String FullName = FirstName+" "+LastName;
        System.out.println(FullName.charAt(0));
        System.out.println(FullName.charAt(1));
        printString(FullName);
    }
}
