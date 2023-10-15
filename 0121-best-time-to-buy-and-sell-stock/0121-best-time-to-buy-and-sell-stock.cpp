class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int mini=prices[0];
        int p=0;
        int n=prices.size();
        for(int i=0;i<n;i++){
            if(prices[i]<mini){
                mini=prices[i];
                // id=i;
            }else{
                int profit=prices[i]-mini;
                if(profit>p){
                    p=profit;
                }
            }


        //     }
        // }
        // int maxi=prices[id];
        // for(int i=id;i<n;i++){
        //     if(prices[i]<maxi){
        //         maxi=prices[i];
        //     }
        }
        return p;
    }
};