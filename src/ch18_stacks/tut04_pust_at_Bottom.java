package ch18_stacks;
import java.util.*;
public class tut04_pust_at_Bottom {
    public static void pustAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);//4th call: stack is empty ,push 4
            return;
        }
        int top = s.pop();//call pop: 3 2 1
        pustAtBottom(s,data);//recursive call with smaller stack
        s.push(top);//after pushing 4 at bottom ,push back 1,2,3.
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pustAtBottom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());//pop 3,2,1,4 (In this order)
        }
    }
}
