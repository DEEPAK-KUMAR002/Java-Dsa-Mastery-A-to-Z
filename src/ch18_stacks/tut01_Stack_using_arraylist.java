package ch18_stacks;
import java.util.ArrayList;
public class tut01_Stack_using_arraylist {
    static class stack{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        //push
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
        public static void printStack() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }

            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.print(list.get(i) + " -> ");
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Stack is:");
        s.printStack();
        while(!s.isEmpty()){
            System.out.println("peek element is :"+s.peek());
            System.out.println("Pop this peek element");
            s.pop();
        }
    }
}
