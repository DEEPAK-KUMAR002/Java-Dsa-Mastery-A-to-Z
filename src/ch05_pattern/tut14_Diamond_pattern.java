package ch05_pattern;

public class tut14_Diamond_pattern {
    public static void main(String[] args) {
        int n=5;
        //Upper half
        for(int i=1;i<=n;i++){
            //spaces
            for(int spaces=1;spaces<=n-i;spaces++){
                System.out.print(" ");
            }
            //Stars
            for(int star=1;star<=2*i-1;star++){
                System.out.print("*");
                //    *
                //   ***
                //  *****
                // *******
                //*********
            }
            System.out.println();
        }
        //Lower half
        for(int i=n;i>=1;i--)//5 4 3 2 1
        {
            //spaces
            for(int spaces=1;spaces<=n-i;spaces++)//0,1,2,3,4
            {
                System.out.print(" ");
            }
            //Stars
            for(int star=1;star<=2*i-1;star++){
                System.out.print("*");
                //*********
                // *******
                //  *****
                //   ***
                //    *
            }
            System.out.println();
        }
    }
}
