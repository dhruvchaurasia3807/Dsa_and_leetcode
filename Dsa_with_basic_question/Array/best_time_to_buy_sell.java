package Dsa_with_basic_question.Array;

public  class best_time_to_buy_sell{

    public static int buy_sell(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        
        for(int i=0;i<prices.length;i++){

            if(buyPrice < prices[i]){//profit
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return  maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int result = buy_sell(prices);
        System.out.println("the max profit is : " + result);
    }
}

// output:the max profit is : 5