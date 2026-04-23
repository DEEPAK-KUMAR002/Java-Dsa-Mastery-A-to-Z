package ch05_pattern;
import java.util.Scanner;
public class tut08_Floyds_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int number=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                //i=1,j=1
                //i=2,j=1,2
                //i=3,j=1,2,3
                //i=4,j=1,2,3,4
                //i=5,j=1,2,3,4,5
                System.out.print(number+" ");
                //1
                //2 3
                //4 5 6
                // 7  8  9 10
                //11 12 13 14 15
                number++;
            }
            System.out.println();
        }
    }
}
