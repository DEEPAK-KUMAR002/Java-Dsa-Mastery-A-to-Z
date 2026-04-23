package ch07_1D_Array;

public class tut01_Creation_of_array {
    public static void main(String[] args) {
        int numbers[] = {1,2,3};
        int marks[]=new int[3];
        marks[0]=0;
        marks[1]=1;
        marks[2]=2;
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        marks[1]=100;//mutable
        System.out.println("marks is:"+marks[1]);
    }
}
