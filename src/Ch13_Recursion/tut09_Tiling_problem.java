package Ch13_Recursion;

public class tut09_Tiling_problem {
    public static int TilingProblem(int n){
        //Base case
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        //Vertical choice
        int Fnm1=TilingProblem(n-1);
        //Horizontal choice
        int Fnm2=TilingProblem(n-2);
        int totWays = Fnm1+Fnm2;
        return totWays;
    }
    public static void main(String[] args) {
        System.out.println(TilingProblem(3));
        System.out.println(TilingProblem(2));
        System.out.println(TilingProblem(4));
    }
}
