package ch05_pattern;

public class tut05_Hollow_rectangle {
    public static void main(String[] args) {
        int n=4;
        int m=5;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=m;col++ ){
                //row =1 ,col = 1 2 3 4 5(* * * * *)
                //row =2 ,col = 1 5      (*       *)
                //row =3 ,col = 1 5      (*       *)
                //row =4 ,col = 1 2 3 4 5(* * * * *)
                if(row==1 || col==1 || row==n || col==m ){
                    System.out.print("* ");

                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
