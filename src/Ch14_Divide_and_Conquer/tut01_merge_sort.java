package Ch14_Divide_and_Conquer;

public class tut01_merge_sort {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergesort(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        //left(0,3)=4,right(4,6)=3
        int temp[] = new int[ei-si+1];
        int i = si; //Iterator for left part
        int j = mid+1;//Iterator for Right part
        int k = 0;//Iterator for temp arr
        while(i <= mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];//ftemp=3,5
                i++;
            }
            else{
                temp[k]=arr[j];//temp=3//temp=5
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k++]=arr[i++];//temp = 3,6//temp=5,9
        }
        while(j <= ei){
            temp[k++]=arr[j++];//ftemp=3,5,6,9
        }
        //copy temp to original arr
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5};
        System.out.println(arr.length);
        mergesort(arr, 0, arr.length - 1);
        printarr(arr);
    }
}