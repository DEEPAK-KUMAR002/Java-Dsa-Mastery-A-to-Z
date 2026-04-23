package Ch13_Recursion;

public class tut07_First_Occurence {
    public static int FirstOccurance(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==key)//arr[0,1,2,3,4]=8,3 6 9 5 found at arr[4]
        {
            return i;//4
        }
        return FirstOccurance(arr,key,i+1);
    }
    public static int LastOccurance(int arr[],int key,int i){
        if(i == arr.length)//arr.length = 9
        {
            return -1;
        }
        int isFound = LastOccurance(arr,key,i+1);//arr,5,0+1
        if(isFound == -1 && arr[i] == key)//isfound=-1,arr[7]==key
        {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(arr.length);
        System.out.println("First occurence of arrays is :"+FirstOccurance(arr,5,0));
        System.out.println("Last occurence of arrays is :"+LastOccurance(arr,5,0));
    }
}
/*LastOccurance(arr, 5, 0) → calls LastOccurance(arr, 5, 1)
LastOccurance(arr, 5, 1) → calls LastOccurance(arr, 5, 2)
LastOccurance(arr, 5, 2) → calls LastOccurance(arr, 5, 3)
LastOccurance(arr, 5, 3) → calls LastOccurance(arr, 5, 4)
LastOccurance(arr, 5, 4) → calls LastOccurance(arr, 5, 5)
LastOccurance(arr, 5, 5) → calls LastOccurance(arr, 5, 6)
LastOccurance(arr, 5, 6) → calls LastOccurance(arr, 5, 7)
LastOccurance(arr, 5, 7) → calls LastOccurance(arr, 5, 8)
LastOccurance(arr, 5, 8) → calls LastOccurance(arr, 5, 9)
LastOccurance(arr, 5, 9) → i == arr.length, returns -1

i=8: isFound=-1, arr[8]=3 ≠ 5, return -1
i=7: isFound=-1, arr[7]=5 = 5, return 7  ← FOUND!
i=6: isFound=7 ≠ -1, return 7
i=5: isFound=7 ≠ -1, return 7
i=4: isFound=7 ≠ -1, return 7 (even though arr[4]=5, we don't check)
i=3: isFound=7 ≠ -1, return 7
i=2: isFound=7 ≠ -1, return 7
i=1: isFound=7 ≠ -1, return 7
i=0: isFound=7 ≠ -1, return 7
*/
