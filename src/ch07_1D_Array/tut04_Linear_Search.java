package ch07_1D_Array;

public class tut04_Linear_Search {
    public static int LinearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) //i<8
        {
            if (numbers[i] == key) //2 4 6 8 10==10
            {
                return i;//10
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        System.out.println(numbers.length);//8
        int index = LinearSearch(numbers, key);
        //
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Key is at index:" + index);
        }
    }
}