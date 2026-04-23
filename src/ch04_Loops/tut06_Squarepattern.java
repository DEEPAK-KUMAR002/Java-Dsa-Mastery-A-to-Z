package ch04_Loops;

public class tut06_Squarepattern {
    public static void main(String[] args) {
    	System.out.println("Square pattern using for loop");
        for(int l1=1;l1<=4;l1++){
            System.out.println("* * * *");
        }
        System.out.println();
        System.out.println("Square pattern using while loop");
        int l2=1;
        while(l2 <= 4){
            System.out.println("* * * *");
            l2++;
        }
    }
}
