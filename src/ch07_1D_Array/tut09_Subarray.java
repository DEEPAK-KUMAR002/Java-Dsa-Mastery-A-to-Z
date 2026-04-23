package ch07_1D_Array;
public class tut09_Subarray {
    public static void printSubarray(int number[])//arr
    {
        int ts=0;// total subarray =0
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;//-ve infi
        int minSum = Integer.MAX_VALUE;//+ve infi
        for(int i=0;i<number.length;i++)//i<5
        {
            int start = i;//0
            for(int j=i;j<number.length;j++)//
            {
                int end = j;//0 //1 //2 //3 //4
                currentSum = 0;
                for(int k=start;k<=end;k++){
                    System.out.print(number[k]+" ");//1//1 -2//1 -2 6 //1 -2 6 -1 //1 -2 6 -1 3
                    currentSum+=number[k];//1//-1//5//4//7
                }
                System.out.println();
                System.out.print("Current sum :"+currentSum);//1//-1//5//4//7
                System.out.println();
                if(maxSum<currentSum)
                {
                    maxSum=currentSum;//1 // 5 //7
                }
                if(minSum > currentSum){
                    minSum = currentSum;//1  // -1
                }
                ts++;//1 // 2 //3 //4 //5
            }
            //ts=5+4+3+2+1=15
            System.out.println();
        }
        System.out.println("Total Subarray:"+ts);//
        System.out.println("Maxsum :"+maxSum);
        System.out.println("Minsum : "+minSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        System.out.println("length of array is :"+(numbers.length));
        printSubarray(numbers);
    }
}
