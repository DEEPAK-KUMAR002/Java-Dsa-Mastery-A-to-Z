package ch05_pattern;
/*
      1
     2 2
    3 3 3
   4 4 4 4
 */
public class tut12_Number_pyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            //spaces
            for(int spaces=1;spaces<=n-i;spaces++)//space=5-i=4,3,2,1
            {
                System.out.print(" ");//
            }
            //numbers --> print row no,row no times
            for (int j=1;j<=i;j++)//j<=i;1,1 2,1 2 3,1 2 3 4
            {
                System.out.print(i+ " ");
                //    1
                //   2 2
                //  3 3 3
                // 4 4 4 4
                //5 5 5 5 5
            }
            System.out.println();
        }
    }
}
