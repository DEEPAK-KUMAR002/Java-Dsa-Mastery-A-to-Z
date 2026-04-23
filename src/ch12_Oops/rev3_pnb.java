package ch12_Oops;

public class rev3_pnb implements rev3_Bank{
    @Override
    public int getRateofInterest() {
        System.out.println("Rate of Interest:"+10);
        return 10;
    }

    @Override
    public int getMoney() {
        System.out.println("Getting money from PNB Bank");
        return 0;
    }

}
