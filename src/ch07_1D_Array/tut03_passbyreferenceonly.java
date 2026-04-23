package ch07_1D_Array;
public class tut03_passbyreferenceonly {
    public static void update(int marks[],int nonChangable) {
        nonChangable=10;
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i]+1;//98 99 100
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        int nonChangable = 5;
        update(marks,nonChangable);
        //print our marks
        System.out.println(nonChangable);// pass by value
        //output:5
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]+" ");//pass by reference
            //98 99 100
        }
        System.out.println();
    }
}
