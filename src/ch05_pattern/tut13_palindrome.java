package ch05_pattern;
/*
    1
   212
  32123
 4321234
543212345
 */
public class tut13_palindrome {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            //spaces
            for(int spaces=1; spaces<=n-i;spaces++){
                System.out.print(" ");
            }
            //1st half numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //2nd half numbers
            for(int j=2;j<=i;j++){
                System.out.print(j);
                //    1
                //   212
                //  32123
                // 4321234
                //543212345
            }
            System.out.println();
        }
    }
}
