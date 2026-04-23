package ch15_BackTracking;

public class tut01_arrays {
    public static void ChangeArrays(int arr[],int i,int val)
    //arr,0 1 2 3 4,1 2 3 4 5
    {
        //base case
        if(i==arr.length)//i=5
        {
            printarray(arr);
            return;
        }
        //recursion
        arr[i]=val;//arr[0,1,2,3,4]=1,2,3,4,5
        ChangeArrays(arr,i+1,val+1);
        arr[i] = arr[i]-2;//arr[4,3,2,1,0]=3,2,1,0,-1
    }
    public static void printarray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        ChangeArrays(arr,0,1);
        printarray(arr);
    }
}
