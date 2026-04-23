package ch07_1D_Array;

public class tut08_pair_array {
    public static void printPairs(int number[])//arr
    {
        for(int i=0;i<number.length;i++){
            int curr = number[i];//curr=2,4
            for(int j=i+1;j<number.length;j++){
                System.out.print( "("+curr + "," + number[j] + ") ");
                //(2,4) (2,6) (2,8) (2,10)
                //(4,6) (4,8) (4,10)
                //(6,8) (6,10)
                //(8,10)
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printPairs(numbers);
    }
}
