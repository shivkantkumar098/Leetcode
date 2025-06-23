class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxPro=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(prices[j]>prices[i]){
        //             maxPro=Math.max(prices[j]-prices[i],maxPro);
        //         }
        //     }
        // }
        int miniPrice=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            miniPrice=Math.min(prices[i],miniPrice);
            maxPro=Math.max(maxPro,prices[i]-miniPrice);
        }
        return maxPro;
    }
}