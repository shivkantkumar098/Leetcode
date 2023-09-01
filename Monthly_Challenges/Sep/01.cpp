https://leetcode.com/problems/counting-bits/description/?envType=daily-question&envId=2023-09-01
class Solution {
public:
    vector<int> countBits(int n) {
        vector<int>res(n+1);
        res[0]=0;
        for(int i=1;i<=n;i++){
            res[i]=res[i/2]+i%2;

        }
        return res;
    }
};
