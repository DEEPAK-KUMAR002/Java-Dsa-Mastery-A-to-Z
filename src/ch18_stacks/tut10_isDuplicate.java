package ch18_stacks;
import java.util.Stack;
public class tut10_isDuplicate {
    public static boolean isDuplicate(String str){//0(n)
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //closing
            if(ch == ')'){
                int count = 0;
                while( s.pop() != '('){
                    System.out.print(count+" ");//b + a =pop 1 2 3//0
                    count++;
                }
                if(count < 1){
                    System.out.println("\n"+count);
                    return true;//duplicate
                }
            }
            else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //valid string
        String str1="((a+b))";//true
        String str2="(a-b)";//false
        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }
}
