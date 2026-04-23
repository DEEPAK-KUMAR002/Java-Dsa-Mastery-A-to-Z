package ch07_1D_Array;

public class tut13_BuySell_Stock {
    public static int BuyandSellStocks(int prices[]) { //0(n)
        int buyPrice = Integer.MAX_VALUE;//+ve max int
        int maxProfit = 0;//
        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i])
            {
                int profit = prices[i] - buyPrice;//5-1=4 //3-1=2 //6-1=5 //4-1=3
                maxProfit = Math.max(maxProfit,profit);//5

            }
            else{
                buyPrice=prices[i];//7 //1
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(BuyandSellStocks(prices));
    }
}
