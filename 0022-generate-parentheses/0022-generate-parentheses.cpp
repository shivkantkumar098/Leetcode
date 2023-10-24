class Solution {
public:

    void helper(string curr,int o,int c,int n,vector<string>&res){
        if(o==n&&c==n){
            res.push_back(curr);
            return;
        }
        // odd open
        if(o<n){
            helper(curr+'(',o+1,c,n,res);
        }
        // closed
        if(o>c){
            helper(curr+')',o,c+1,n,res);
        }
    }
    vector<string> generateParenthesis(int n) {
        vector<string>res;
        helper("",0,0,n,res);
        return res;
    }
};