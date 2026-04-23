package ch12_Oops;

public class rev3_Interface {
    public static void main(String[] args) {
        System.out.println("Starting Bank app:");
        rev3_Bank Bank = new rev3_pnb();
        Bank.getRateofInterest();
        rev3_Bank Bank1=new rev3_ICICI();
        Bank1.getRateofInterest();

        rev3_Deepak Deepak = new rev3_Deepak();
        Deepak.goGetMoneyFromBank(Bank);
        Deepak.goGetMoneyFromBank(Bank1);
        Deepak.goGetMoneyFromBank(new rev3_ICICI());
    }
}
