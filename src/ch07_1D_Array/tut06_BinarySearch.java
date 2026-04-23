package ch07_1D_Array;

public class tut06_BinarySearch {
    public static int BinarySearch(int numbers[],int key)//arr,25
    {
        int start=0,end=numbers.length-1;
        while(start<=end)//0<6//4<6 //
        {
            int mid = (start+end)/2;//0+6/2=3 //4+6/2=5 //4+5/2=4
            //Comparisons
            if(numbers[mid] == key)//No //No //yes (10==10)
            {
                return mid;//4
            }
            if(numbers[mid] < key)//yes //No
            {
                start = mid+1;//4
            }
            else{
                end = mid-1;//5
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key =10;
        System.out.println(numbers.length-1);//6
        System.out.println("Index for key is :"+BinarySearch(numbers,key));//4

    }
}
