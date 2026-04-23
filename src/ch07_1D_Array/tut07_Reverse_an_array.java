package ch07_1D_Array;

public class tut07_Reverse_an_array {
    public static void reverse(int number[])//arr
    {
        int first = 0,last = number.length -1;//4
        while (first<last)//0<4 //1<3 //2<2(false)
        {
            int temp = number[last];//temp=10 ,8
            number[last] = number[first];//n[l]=2(4) ,4(3)
            number[first] = temp;//n[f]=10(0),8(1)

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        reverse(numbers);
        System.out.println(numbers.length-1);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");//10 8 6 4 2
        }
        System.out.println();
    }
}
