package ch18_stacks;

import java.util.Stack;

public class tut07_Stock_span_problem {
    public static void stockSpan(int stocks[],int span[])//stocks,7
    {
        Stack<Integer> s=new Stack<>();//
        span[0]=1;
        s.push(0);
        for(int i=1;i<stocks.length;i++)//6
            {
            int currPrice=stocks[i];//stocks[1]
            while(!s.isEmpty() && currPrice>stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
                int prevHigh=s.peek();
                span[i]=i-prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,85,100};
        System.out.println("Length of stock is "+stocks.length);//7
        int span[]=new int[stocks.length];//7
        stockSpan(stocks,span);
        for(int i=0;i<span.length;i++){
            System.out.println(span[i]+" ");
        }
    }
}
