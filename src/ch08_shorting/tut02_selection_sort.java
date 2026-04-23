package ch08_shorting;

public class tut02_selection_sort {
    public static void Selectionsort(int arr[]){
        for (int i=0;i<arr.length-1;i++)// 0 1
        {
            int minpos = i;//5 // 4
            for(int j=i+1;j<arr.length;j++)// 1 2 3 4//2 3 4
            {
                if(arr[minpos]>arr[j]) {
                    minpos = j;//4,1,1,1//
                }
                //minpos=1
            }
        //swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];//5
            arr[i] = temp;//1
        }
    }
    public static void printarray(int arr[]) {
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        Selectionsort(arr);
        printarray(arr);
    }
}
