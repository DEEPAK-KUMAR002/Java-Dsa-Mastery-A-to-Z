package Ch13_Recursion;

public class tut11_Friends_Pairing {
    public static int Friends_pairing(int n){
        //Base Case
        if(n == 1 || n == 2){
            return n;
        }
        //choice
        //Single
//        int Fnm1 = Friends_pairing(n-1);
//        //pair
//        int Fnm2 = Friends_pairing(n-2);
//        int pairWays = (n-1)*Fnm2;
//        int totalWays = Fnm1+pairWays;
//        return totalWays;
        return Friends_pairing(n-1)+(n-1)*Friends_pairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(Friends_pairing(1));
        System.out.println(Friends_pairing(2));
        System.out.println(Friends_pairing(3));
        System.out.println(Friends_pairing(4));
    }
}
