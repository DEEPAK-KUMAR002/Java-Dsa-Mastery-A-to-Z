package ch07_1D_Array;
public class tut10_subarray_prefixsum {
    public static void printSubarray(int number[])//arr
    {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;//-ve
        //prefix sum
        int prefix[] = new int[number.length];//5
        prefix[0] = number[0];//1
        for(int i=1;i<prefix.length;i++)//i<5
        {
            prefix[i] = prefix[i-1] + number[i];//1+-2=-1 //-1+6=5 //5+-1=4 //4+3=7
//            prefix[0] = 1
//            prefix[1] = 1 + (-2) = -1
//            prefix[2] = -1 + 6 = 5
//            prefix[3] = 5 + (-1) = 4
//            prefix[4] = 4 + 3 = 7
//            Result: prefix = [1, -1, 5, 4, 7]
        }
        for(int i=0;i<number.length;i++)//i<5
        {
            int start = i;//0 //1
            for(int j=i;j<number.length;j++)//j<5
            {
                int end = j;//0 1 2 3 4 //1 2 3 4
                currentSum = start==0 ? prefix[end]: prefix[end]-prefix[start-1];
                //currentsum= 1 -1 5 4 7

                if(maxSum<currentSum){
                    maxSum=currentSum;
                }
            }
        }
        System.out.println("Maxsum :"+maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        System.out.println(numbers.length-1);
        printSubarray(numbers);
    }
}

