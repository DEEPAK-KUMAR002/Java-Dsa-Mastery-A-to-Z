package ch07_1D_Array;

public class tut05_largest_Numbers {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;// -ve infinity
        for(int i=0;i<numbers.length;i++)//Time Complexity: 0(n)
        {
            if(largest < numbers[i])//1 2 6 (false 3 5)
            {
                largest = numbers[i];// 6
            }

        }
        return largest;
    }

    public static int getSmallest(int numbers[]) {
        int Smallest = Integer.MAX_VALUE;//+ve infinity
        for(int i=0;i<numbers.length;i++){
            if(Smallest > numbers[i])// 2 6 3 5 false
            {
                Smallest = numbers[i];//1
            }
        }
        return Smallest;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,6,3,5};
        System.out.println("Largest value is :"+getLargest(numbers));
        System.out.println("Smallest value is:"+getSmallest(numbers));
    }
}
