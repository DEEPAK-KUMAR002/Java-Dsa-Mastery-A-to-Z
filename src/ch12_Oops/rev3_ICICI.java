package ch12_Oops;

public class rev3_ICICI implements rev3_Bank{

    @Override
    public int getRateofInterest() {
        System.out.println("Rate of interest: "+12);
        return 12;
    }
    @Override
    public int getMoney() {
        System.out.println("Getting money from ICICI Bank");
        return 0;
    }
}
