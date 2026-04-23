package ch08_shorting;

public class tut01_Bubblesort {
    public static void Bubblesort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++)//0//1//2//3
        {
            for(int j=0;j<arr.length-1-turn;j++)//0 1 2 3//0 1 2 //0 1//0
            {
                if(arr[j]>arr[j+1])//no
                {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];//4,1,3,2//1,3,2//1,2
                    arr[j+1] = temp;//5,5,5,5//4,4,4//3,3
                    //4 1 3 2 5
                    //1 3 2 4 5
                    //1 2 3 4 5
                }
            }
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
        System.out.println(arr.length);//5
        Bubblesort(arr);
        printarray(arr);
    }
}
