package ch20_Greedy_algo;

import java.util.Arrays;

public class tut03_Min_Absolute_Difference {
    public static void main(String[] args) {//0(nlogn)
        int A[]={4,1,8,7};
        int B[]={2,3,6,5};
        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff = 0;
        for(int i=0;i<A.length;i++){
            minDiff += Math.abs(A[i]-B[i]);
        }
        System.out.println("Minimum absolute difference of pairs = "+minDiff);
    }
}
