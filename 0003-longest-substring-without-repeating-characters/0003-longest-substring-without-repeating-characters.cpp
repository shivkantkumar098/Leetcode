class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        // int start=0;
        // int end=0;
        // int maxi=0;
        // set<char>Set;
        // while(start<s.size()){
        //     auto it=Set.find(s[start]);
        //     if(it==Set.end()){
        //         if(start-end+1>maxi)
        //             maxi=start-end+1;
        //             Set.insert(s[start]);
        //             start++;
                
        //     }
        //         else{
        //             Set.erase(s[end]);
        //             end++;
        //         }
        //     }
        
        // return maxi;
   
        int start=0;
        int end=0;
             int maxi=0;
        set<char>st;
        while(start<s.size()){
            auto it =st.find(s[start]);
            if(it==st.end()){
                if(start-end+1>maxi)
                    maxi=start-end +1;
                    st.insert(s[start]);
                    start++;
                
            }
                else{
                    st.erase(s[end]);
                    end++;
                }
            
        }

        return maxi;
    }
};