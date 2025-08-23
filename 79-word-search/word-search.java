class Solution {
    boolean searchNext(char[][]board,String word,int row,int col,int n,int m,int indx){
        if(indx==word.length()){
            return true;
        }
        if(row<0 || col<0 ||row==n || col==m || board[row][col]!=word.charAt(indx)||board[row][col]=='!')
        {
        return false;
        }
        char c=board[row][col];
        board[row][col]='!';
        boolean top=searchNext(board,word,row-1,col,n,m,indx+1); 
        boolean down=searchNext(board,word,row+1,col,n,m,indx+1);
        boolean right=searchNext(board,word,row,col+1,n,m,indx+1);
        boolean left=searchNext(board,word,row,col-1,n,m,indx+1);
        board[row][col]=c;
        return top|| down|| left||right;
    }
    public boolean exist(char[][] board, String word) {
     int n=board.length;
     int m=board[0].length;
     int indx=0;
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(board[i][j]==word.charAt(indx)){
                if(searchNext(board,word,i,j,n,m,indx)){
                    return true;
                }
            }
        }
     }  
     return false; 

    }
}