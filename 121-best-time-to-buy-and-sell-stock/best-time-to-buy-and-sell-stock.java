class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxiProfit=0;
        for(int price:prices){
            if(price<minPrice){
                minPrice=price;
            }
            else{
                maxiProfit=Math.max(maxiProfit,price-minPrice);
            }
        }
        return maxiProfit;
    }
}