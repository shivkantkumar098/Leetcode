class Solution {
public:
    int maximalSquare(vector<vector<char>>& matrix) {

       int rows=matrix.size();
       int col=matrix[0].size();
       // where we see zero in rows put =0
       if(rows==0){
           return 0;

       } 
       vector<vector<int>>dp(rows+1,vector<int>(col+1,0));
       int largest=0;
       for(int i=1;i<=rows;i++){
           for(int j=1;j<=col;j++){
               if(matrix[i-1][j-1]=='1'){
                  dp[i][j]= 1+min(dp[i-1][j],min(dp[i][j-1],dp[i-1][j-1]));//                 when we encounter any larger valu greater than largets update it
                  if(largest<dp[i][j])
                  largest=dp[i][j];
               }
           }
       }
       return largest*largest;
    }
};