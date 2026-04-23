package ch16_LinearDataStructures;

import java.util.ArrayList;

public class tut03_Find_Maximum_in_an_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            //Method 1
//            if(max<list.get(i)) {
//                max = list.get(i);
//            }

            //Method 2
            max = Math.max(max,list.get(i));// 0(1)
        }
        System.out.println("Max Element ="+max);
    }
}
