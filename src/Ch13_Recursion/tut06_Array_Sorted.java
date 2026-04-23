package Ch13_Recursion;

public class tut06_Array_Sorted {
    public static boolean isSorted(int arr[],int i){
        if(i == arr.length-1){
            return true;//(i=4)==4(arr)
        }
        if(arr[i]>arr[i+1]){
            return false;//arr[3] return false
        }
        return isSorted(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(isSorted(arr,0));
    }
}
