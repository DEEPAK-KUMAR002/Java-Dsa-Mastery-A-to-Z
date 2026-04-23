package ch18_stacks;

import java.util.Stack;

public class tut08_Next_greater_element {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int nextGreater[] = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            //step 1:while(s.peek()->Indices,arr[s.peek()]=value
            while(!s.isEmpty() && arr[s.peek()]<=arr[i])//stack empty//
            {
                s.pop();//pop=2,3,4
            }
            //step 2:if-else
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }
            else{
                nextGreater[i] = arr[s.peek()];
            }
//            nextGreatest=8,-1,1,3,-1
            //step 3:push in s
            s.push(i);//push=4,3,2 //push=1,0
        }
        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
        System.out.println(s);

        //next greater right=this code
        //next greater Left=for(0-arr.length-1
        //
    }
}
