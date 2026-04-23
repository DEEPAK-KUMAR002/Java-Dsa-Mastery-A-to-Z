package ch16_LinearDataStructures;

import java.util.ArrayList;
import java.util.Collections;

public class tut05_Sorting_an_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        list.add(0);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        //descending order
        Collections.sort(list,Collections.reverseOrder());
        //Comparator-Fnx logic
        System.out.println(list);
    }
}
