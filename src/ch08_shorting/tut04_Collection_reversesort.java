package ch08_shorting;

import java.util.Arrays;
import java.util.Collections;

public class tut04_Collection_reversesort {
    public static void print(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Integer arr[] = {3,4,5,1,2};
        Arrays.sort(arr, Collections.reverseOrder() );
//        Arrays.sort(arr, 0,3,Collections.reverseOrder() );//0 to n-1
        print(arr);
    }
}
