package ch07_1D_Array;

public class tut11_Kadane_algorithm {
    public static void Kadanes(int numbers[]) {
        int ms=Integer.MIN_VALUE;//-ve int
        //Current Sum
        int cs=0;//0
        for(int i=0;i<numbers.length;i++){
            cs += numbers[i];//-2 // -3 //4-1=3-2=1+1=2+5=7-3=4
            if(cs<0){
                cs=0;//0 //0 //
            }
            //Maximum Sum
            ms = Math.max(cs,ms);//-2 //4 //7
        }
        System.out.println("Our max subarray sum is :"+ms);//7
    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        Kadanes(numbers);
    }
}

