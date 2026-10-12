
public class best_time_to_buy_and_sell_stock {
    static int checkProfit(int prices[]){
      int min_price = Integer.MAX_VALUE;
        int max_price = 0;

        for(int price:prices){
            min_price = Math.min(min_price, price);
            int profit = price - min_price;
            max_price = Math.max(max_price, profit);
        }
        return max_price;
    }
    public static void main(String[] args) {
        int[] prices = {3,1,5,2,6,4};
        int result = checkProfit(prices);
        System.out.println("The max profit is : "+result);

        
    }
}

// output:The max profit is : 5