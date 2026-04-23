package ch08_shorting;
import java.util.Arrays;
public class tut04_Inbuilt_sort {
    public static void printarray_Inbulit(int arr[]) {
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,3,2,1,4};
//        Arrays.sort(arr);
//        printarray_Inbulit(arr);
        Arrays.sort(arr,0,3);//0 to n-1 index
        printarray_Inbulit(arr);
    }
}
