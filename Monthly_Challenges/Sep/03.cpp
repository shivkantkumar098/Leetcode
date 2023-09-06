https://leetcode.com/problems/unique-paths/?envType=daily-question&envId=2023-09-03
class Solution {
public:
// int countways(int i,int j,vector<vector<int>>&dp){
//     if(i==0 && j==0){
//         return 1;
//     }
//     if(i<0||j<0){
//         return 0;

//     }
…                    if(i>0) up = dp[i-1][j];
                    if(j>0) left = dp[i][j-1];
                    dp[i][j] = up+left;
                }
            }
        }
        return dp[m-1][n-1];
        
    }
};
