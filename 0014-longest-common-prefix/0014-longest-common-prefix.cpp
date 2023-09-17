class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string ans, temp, temp2;
        if(strs.size()<=1)return strs[0];
        // int n=max(strs[0],strs[1]);
        for(int i=0;i<strs.size()-1;i++){
            int n=min(strs[i].size(),strs[i+1].size());
            for(int j=0;j<n;j++){
                if(strs[i][j]==strs[i+1][j])temp.push_back(strs[i][j]);
                else{
                    break;
                }
            }
            if(temp.size()==0)return temp;
            if(ans.size()==0)ans=temp;
            if(ans.size()>0){int k=min(ans.size(),temp.size());
            for(int j=0;j<k;j++){
                if(temp[j]==ans[j])temp2.push_back(temp[j]);
                else break;
            }}
            ans=temp2;
            temp.clear();
            temp2.clear();
        }
        return ans;
    }
};