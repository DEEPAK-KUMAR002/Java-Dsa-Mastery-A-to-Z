package Ch13_Recursion;

public class pr03_Length_of_String {
    public static int findLength(String str) {
        if (str.equals("")) {      // Line 1
            return 0;              // Line 2
        }
        return 1 + findLength(str.substring(1));  // Line 3
    }
    public static void main(String[] args) {
        String str = "Hello";      // Line 4
        int len = findLength(str); // Line 5
        System.out.println(len);   // Line 6
    }
}
