package ch05_pattern;

import java.util.Scanner;

public class tut10_Butterfly_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //Upper half
        for(int i=1;i<=n;i++){
            //1st part
            for (int j=1;j<=i;j++){
                System.out.print("* ");
                //i=1,j=1 (*)
                //i=2,j=1,2 (* *)
                //i=3,j=1,2,3 (* * *)
                //i=4,j=1,2,3,4 (* * * *)
                //i=5,j=1,2,3,4,5 (* * * * *)
            }
            //Spaces
            int spaces=2*(n-i);//2(5-i)
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
                //i=1,j=1,2,3,4,5,6,7,8 spaces (2*4=8)
                //i=2,j=1,2,3,4,5,6,7 (2*3=6)
                //i=3,j=1,2,3,4,5,6  (2*2=4)
                //i=4,j=1,2,3,4,5   (2*1=2)
                //i=5,j=0    (2*0=0)
            }
            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("* ");
                //i=1,j=1 (*)
                //i=2,j=1,2 (* *)
                //i=3,j=1,2,3 (* * *)
                //i=4,j=1,2,3,4 (* * * *)
                //i=5,j=1,2,3,4,5 (* * * * *)
            }
            System.out.println();
        }
        //Lower half
        for(int i=n;i>=1;i--){
            //1st part
            for (int j=1;j<=i;j++){
                //i=5,j=1,2,3,4,5 stars
                //i=4,j=1,2,3,4 stars
                //i=3,j=1,2,3 stars
                //i=2,j=1,2 stars
                //i=1,j=1 stars
                System.out.print("* ");
            }
            //Spaces
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                // 2*(5-5)=0 spaces
                // 2*(5-4)=2 spaces
                // 2*(5-3)=4 spaces
                // 2*(5-2)=6 spaces
                // 2*(5-1)=8 spaces
                System.out.print("  ");
            }
            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("* ");
                //i=5,j=1,2,3,4,5 stars
                //i=4,j=1,2,3,4 stars
                //i=3,j=1,2,3 stars
                //i=2,j=1,2 stars
                //i=1,j=1 stars
            }
            System.out.println();
        }
    }
}
